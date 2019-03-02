package io.ffreedom.jctp;

import static io.ffreedom.jctp.base.CtpRspValidator.validateRspInfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ctp.thostapi.CThostFtdcInputOrderActionField;
import ctp.thostapi.CThostFtdcInputOrderField;
import ctp.thostapi.CThostFtdcInstrumentField;
import ctp.thostapi.CThostFtdcInvestorPositionField;
import ctp.thostapi.CThostFtdcOrderActionField;
import ctp.thostapi.CThostFtdcOrderField;
import ctp.thostapi.CThostFtdcRspAuthenticateField;
import ctp.thostapi.CThostFtdcRspInfoField;
import ctp.thostapi.CThostFtdcRspUserLoginField;
import ctp.thostapi.CThostFtdcSettlementInfoField;
import ctp.thostapi.CThostFtdcTradeField;
import ctp.thostapi.CThostFtdcTraderSpi;
import ctp.thostapi.CThostFtdcTradingAccountField;
import ctp.thostapi.CThostFtdcUserLogoutField;

public class TraderSpiImpl extends CThostFtdcTraderSpi {

	private Logger logger = LoggerFactory.getLogger(getClass());

	private Gateway gateway;

	TraderSpiImpl(Gateway gateway) {
		this.gateway = gateway;
	}

	@Override
	public void OnFrontConnected() {
		logger.info("TraderSpiImpl OnFrontConnected");
		gateway.onTraderFrontConnected();
	}

	@Override
	public void OnFrontDisconnected(int nReason) {
		logger.warn("TraderSpiImpl OnFrontDisconnected -> Reason==[{}]", nReason);
	}

	@Override
	public void OnRspUserLogin(CThostFtdcRspUserLoginField pRspUserLogin, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		validateRspInfo("OnRspUserLogin", pRspInfo);
		logger.info("TraderSpiImpl OnRspUserLogin");
		if (pRspUserLogin != null)
			gateway.onTraderRspUserLogin(pRspUserLogin);
		else
			logger.info("OnRspUserLogin return null");
	}

	@Override
	public void OnRspAuthenticate(CThostFtdcRspAuthenticateField pRspAuthenticateField, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		validateRspInfo("OnRspAuthenticate", pRspInfo);
		logger.info("TraderSpiImpl OnRspAuthenticate");
		if (pRspAuthenticateField != null) {

		}
	}

	@Override
	public void OnRspUserLogout(CThostFtdcUserLogoutField pUserLogout, CThostFtdcRspInfoField pRspInfo, int nRequestID,
			boolean bIsLast) {
		validateRspInfo("OnRspUserLogout", pRspInfo);
		logger.info("Call TraderSpiImpl OnRspUserLogout");
	}

	@Override
	public void OnRspQryTradingAccount(CThostFtdcTradingAccountField pTradingAccount, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		validateRspInfo("OnRspQryTradingAccount", pRspInfo);
		logger.info("Call TraderSpiImpl OnRspQryTradingAccount");
		if (pTradingAccount != null) {
			gateway.onQryTradingAccount(pTradingAccount);
		} else 
			logger.warn("OnRspQryTradingAccount return null");
		
	}

	@Override
	public void OnRspQryInvestorPosition(CThostFtdcInvestorPositionField pInvestorPosition,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		validateRspInfo("OnRspQryInvestorPosition", pRspInfo);
		pInvestorPosition.getInstrumentID();
	}

	@Override
	public void OnRspQrySettlementInfo(CThostFtdcSettlementInfoField pSettlementInfo, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		validateRspInfo("OnRspQrySettlementInfo", pRspInfo);

		if (pSettlementInfo != null)
			logger.info("OnRspQrySettlementInfo -> \n {}", pSettlementInfo.getContent());
		else
			logger.warn("OnRspQrySettlementInfo return null");
	}

	@Override
	public void OnRspQryInstrument(CThostFtdcInstrumentField pInstrument, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		validateRspInfo("OnRspQryInstrument", pRspInfo);
		if (pInstrument != null)
			logger.info("OnRspQryInstrument -> InstrumentID==[{}]", pInstrument.getInstrumentID());
		else
			logger.warn("OnRspQryInstrument return null");
	}

	@Override
	public void OnRtnOrder(CThostFtdcOrderField pOrder) {
		if (pOrder != null)
			gateway.onRtnOrder(pOrder);
		else
			logger.warn("OnRtnOrder return null");
	}

	@Override
	public void OnRtnTrade(CThostFtdcTradeField pTrade) {
		if (pTrade != null)
			gateway.onRtnTrade(pTrade);
		else
			logger.warn("OnRtnTrade return null");
	}

	@Override
	public void OnRspOrderInsert(CThostFtdcInputOrderField pInputOrder, CThostFtdcRspInfoField pRspInfo, int nRequestID,
			boolean bIsLast) {
		validateRspInfo("OnRspOrderInsert", pRspInfo);
	}

	@Override
	public void OnRspOrderAction(CThostFtdcInputOrderActionField pInputOrderAction, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		validateRspInfo("OnRspOrderAction", pRspInfo);
	}

	@Override
	public void OnErrRtnOrderInsert(CThostFtdcInputOrderField pInputOrder, CThostFtdcRspInfoField pRspInfo) {
		validateRspInfo("OnErrRtnOrderInsert", pRspInfo);
	}

	@Override
	public void OnErrRtnOrderAction(CThostFtdcOrderActionField pOrderAction, CThostFtdcRspInfoField pRspInfo) {
		validateRspInfo("OnErrRtnOrderAction", pRspInfo);
	}

	@Override
	public void OnRspError(CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
	}

}