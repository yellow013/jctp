package io.ffreedom.jctp.gateway;

import java.util.HashSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.ffreedom.common.utils.ThreadUtil;
import io.ffreedom.jctp.gateway.config.MdApiConfig;
import io.ffreedom.jctp.gateway.config.TdApiConfig;
import io.ffreedom.jctp.gateway.dto.ReqCancelOrder;
import io.ffreedom.jctp.gateway.dto.ReqOrder;

/**
 * @author Administrator
 *
 */
public class CtpGateway {

	private static Logger log = LoggerFactory.getLogger(CtpGateway.class);

	static {
		try {
			// 判断是否是windows操作系统
			if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
				System.loadLibrary("lib/win64/thosttraderapi");
				System.loadLibrary("lib/win64/thostmduserapi");
				System.loadLibrary("lib/win64/thostapi_wrap");
			} else {
				System.loadLibrary("lib/linux64/thosttraderapi");
				System.loadLibrary("lib/linux64/thostmduserapi");
				System.loadLibrary("lib/linux64/thostapi_wrap");
			}
		} catch (Exception e) {
			log.error("Load libs error...", e);
		}
	}

	private MdApi mdApi;
	private TdApi tdApi;

	private MdSpi mdSpi;
	private TdSpi tdSpi;

	private String gatewayId;

	private HashSet<String> subscribeSymbols = new HashSet<>();

	private int tdFrontId = 0; // 前置机编号
	private int tdSessionId = 0; // 会话编号

	public CtpGateway(String gatewayId, MdApiConfig mdApiConfig, TdApiConfig tdApiConfig) {
		this.gatewayId = gatewayId;
		this.mdSpi = new MdSpi(this);
		this.tdSpi = new TdSpi(this);
		if (mdApiConfig != null)
			this.mdApi = new MdApi(gatewayId, mdSpi, mdApiConfig);
		if (tdApiConfig != null)
			this.tdApi = new TdApi(gatewayId, tdSpi, tdApiConfig);
		if (mdApi == null || tdApi == null)
			throw new RuntimeException("Cannot init...");
		ThreadUtil.startNewTimerTask(() -> query(), 0, 2500);
	}

	private void query() {
		if (isConnected())
			queryAccount();
		ThreadUtil.sleep(1250);
		if (isConnected())
			queryPosition();
		ThreadUtil.sleep(1250);
	}

	public String getGatewayId() {
		return gatewayId;
	}

	public HashSet<String> getSubscribedSymbols() {
		return subscribeSymbols;
	}

	public boolean isConnected() {
		return tdApi.isConnected() && mdApi.isConnected();
	}

	public void connect() {
		if (mdApi != null)
			mdApi.connect();
		if (tdApi != null)
			tdApi.connect();
	}

	public void login() {
		if (mdApi != null)
			mdApi.login();
		if (tdApi != null)
			tdApi.login();
	}

	public void close() {
		// 务必判断连接状态,防止死循环
		if (mdApi != null && mdApi.isConnected())
			mdApi.close();
		if (tdApi != null && tdApi.isConnected())
			tdApi.close();
		// 在这里发送事件主要是由于接口可能自动断开,需要广播通知
	}

	public void subscribe(String symbol) {
		subscribeSymbols.add(symbol);
		if (mdApi != null)
			mdApi.subscribe(symbol);

	}

	public void unsubscribe(String symbol) {
		subscribeSymbols.remove(symbol);
		if (mdApi != null)
			mdApi.unsubscribe(symbol);
	}

	public void sendOrder(ReqOrder reqOrder) {
		if (tdApi != null)
			tdApi.sendOrder(reqOrder);
	}

	public void cancelOrder(ReqCancelOrder reqCancelOrder) {
		if (tdApi != null)
			tdApi.cancelOrder(reqCancelOrder);
	}

	public void queryAccount() {
		if (tdApi != null)
			tdApi.queryAccount();
	}

	public void queryPosition() {
		if (tdApi != null)
			tdApi.queryPosition();
	}

	CtpGateway setTdFrontId(int tdFrontId) {
		this.tdFrontId = tdFrontId;
		return this;
	}

	CtpGateway setTdSessionId(int tdSessionId) {
		this.tdSessionId = tdSessionId;
		return this;
	}

	void onFrontConnectedOfMdSpi() {
		mdApi.setConnected(true);
		mdApi.login();
	}

	void onFrontConnectedOfTdSpi() {
		tdApi.setConnected(true);
		tdApi.login();
	}

	void onFrontDisconnectedOfMdSpi(int nReason) {
		log.info("Md front disconnected nReason==[{}]", nReason);
		if (mdApi != null)
			mdApi.close();
	}

	void onFrontDisconnectedOfTdSpi(int nReason) {
		log.info("Td front disconnected nReason==[{}]", nReason);
		if (tdApi != null)
			tdApi.close();
	}

	void onRspUserLoginOfMdSpi() {
		mdApi.setLogin(true);
		if (!subscribeSymbols.isEmpty())
			mdApi.subscribe(subscribeSymbols.toArray(new String[subscribeSymbols.size()]));
	}

	void onRspUserLoginOfTdSpi(boolean isSuccess) {
		if (isSuccess)
			tdApi.setLogin(true);
		else
			tdApi.setLoginFailed(true);
		// tdApi.queryAccount();
		// tdApi.queryPosition();
	}

	void onRspUserLogout() {
		// TODO Auto-generated method stub
	}

	void onRspError() {
		// TODO Auto-generated method stub
	}

	void onRspSubMarketData() {
		// TODO Auto-generated method stub
	}

	void onRspUnSubMarketData() {
		// TODO Auto-generated method stub
	}

	void onRtnDepthMarketData() {
		// TODO Auto-generated method stub
	}

	void onRspAuthenticate() {
		tdApi.setAuth(true);
		tdApi.login();
	}

	public static void main(String[] args) {

		CtpGateway ctpGateway = new CtpGateway("simnow-test",
				new MdApiConfig().setMdAddress("tcp://180.168.146.187:10010").setBrokerId("9999").setUserId("005853")
						.setPassword("jinpengpass101"),
				new TdApiConfig().setTdAddress("tcp://180.168.146.187:10000").setBrokerId("9999").setUserId("005853")
						.setPassword("jinpengpass101"));

		ctpGateway.connect();
		ctpGateway.login();

		ctpGateway.subscribe("rb1905");

		System.out.println(System.getProperty("java.library.path"));

	}

}