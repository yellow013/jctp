package io.mercury.gateway.ctp.bean.rsp;

public class RspDepthMarketData {

	// 交易日
	private String TradingDay;
	// InstrumentID
	private String InstrumentID;
	// 交易所ID
	private String ExchangeID;
	private String ExchangeInstID;
	// 最新价
	private double LastPrice;
	// 上次结算价
	private double PreSettlementPrice;

	// 昨收盘
	private double PreClosePrice;
	// 昨持仓量
	private double PreOpenInterest;

	// 开盘价
	private double OpenPrice;
	// 最高价
	private double HighestPrice;
	// 最低价
	private double LowestPrice;
	// 成交量
	private int Volume;
	// 成交金额
	private double Turnover;
	// 持仓量
	private double OpenInterest;
	private double ClosePrice;
	private double SettlementPrice;
	// 涨停板价
	private double UpperLimitPrice;
	// 跌停板价
	private double LowerLimitPrice;
	private double PreDelta;
	private double CurrDelta;
	/* 五档买价卖价及买量卖量 v */
	private double BidPrice1;
	private int BidVolume1;
	private double AskPrice1;
	private int AskVolume1;
	private double BidPrice2;
	private int BidVolume2;
	private double AskPrice2;
	private int AskVolume2;
	private double BidPrice3;
	private int BidVolume3;
	private double AskPrice3;
	private int AskVolume3;
	private double BidPrice4;
	private int BidVolume4;
	private double AskPrice4;
	private int AskVolume4;
	private double BidPrice5;
	private int BidVolume5;
	private double AskPrice5;
	private int AskVolume5;
	/* 五档买价卖价及买量卖量 ^ */
	// 平均价格
	private double AveragePrice;
	// 更新时间
	private String UpdateTime;
	// 更新毫秒数
	private int UpdateMillisec;
	private String ActionDay;

	public String getTradingDay() {
		return TradingDay;
	}

	public String getInstrumentID() {
		return InstrumentID;
	}

	public String getExchangeID() {
		return ExchangeID;
	}

	public String getExchangeInstID() {
		return ExchangeInstID;
	}

	public double getLastPrice() {
		return LastPrice;
	}

	public double getPreSettlementPrice() {
		return PreSettlementPrice;
	}

	public double getPreClosePrice() {
		return PreClosePrice;
	}

	public double getPreOpenInterest() {
		return PreOpenInterest;
	}

	public double getOpenPrice() {
		return OpenPrice;
	}

	public double getHighestPrice() {
		return HighestPrice;
	}

	public double getLowestPrice() {
		return LowestPrice;
	}

	public int getVolume() {
		return Volume;
	}

	public double getTurnover() {
		return Turnover;
	}

	public double getOpenInterest() {
		return OpenInterest;
	}

	public double getClosePrice() {
		return ClosePrice;
	}

	public double getSettlementPrice() {
		return SettlementPrice;
	}

	public double getUpperLimitPrice() {
		return UpperLimitPrice;
	}

	public double getLowerLimitPrice() {
		return LowerLimitPrice;
	}

	public double getPreDelta() {
		return PreDelta;
	}

	public double getCurrDelta() {
		return CurrDelta;
	}

	public double getBidPrice1() {
		return BidPrice1;
	}

	public int getBidVolume1() {
		return BidVolume1;
	}

	public double getAskPrice1() {
		return AskPrice1;
	}

	public int getAskVolume1() {
		return AskVolume1;
	}

	public double getBidPrice2() {
		return BidPrice2;
	}

	public int getBidVolume2() {
		return BidVolume2;
	}

	public double getAskPrice2() {
		return AskPrice2;
	}

	public int getAskVolume2() {
		return AskVolume2;
	}

	public double getBidPrice3() {
		return BidPrice3;
	}

	public int getBidVolume3() {
		return BidVolume3;
	}

	public double getAskPrice3() {
		return AskPrice3;
	}

	public int getAskVolume3() {
		return AskVolume3;
	}

	public double getBidPrice4() {
		return BidPrice4;
	}

	public int getBidVolume4() {
		return BidVolume4;
	}

	public double getAskPrice4() {
		return AskPrice4;
	}

	public int getAskVolume4() {
		return AskVolume4;
	}

	public double getBidPrice5() {
		return BidPrice5;
	}

	public int getBidVolume5() {
		return BidVolume5;
	}

	public double getAskPrice5() {
		return AskPrice5;
	}

	public int getAskVolume5() {
		return AskVolume5;
	}

	public double getAveragePrice() {
		return AveragePrice;
	}

	public String getUpdateTime() {
		return UpdateTime;
	}

	public int getUpdateMillisec() {
		return UpdateMillisec;
	}

	public String getActionDay() {
		return ActionDay;
	}

	public RspDepthMarketData setTradingDay(String tradingDay) {
		TradingDay = tradingDay;
		return this;
	}

	public RspDepthMarketData setInstrumentID(String instrumentID) {
		InstrumentID = instrumentID;
		return this;
	}

	public RspDepthMarketData setExchangeID(String exchangeID) {
		ExchangeID = exchangeID;
		return this;
	}

	public RspDepthMarketData setExchangeInstID(String exchangeInstID) {
		ExchangeInstID = exchangeInstID;
		return this;
	}

	public RspDepthMarketData setLastPrice(double lastPrice) {
		LastPrice = lastPrice;
		return this;
	}

	public RspDepthMarketData setPreSettlementPrice(double preSettlementPrice) {
		PreSettlementPrice = preSettlementPrice;
		return this;
	}

	public RspDepthMarketData setPreClosePrice(double preClosePrice) {
		PreClosePrice = preClosePrice;
		return this;
	}

	public RspDepthMarketData setPreOpenInterest(double preOpenInterest) {
		PreOpenInterest = preOpenInterest;
		return this;
	}

	public RspDepthMarketData setOpenPrice(double openPrice) {
		OpenPrice = openPrice;
		return this;
	}

	public RspDepthMarketData setHighestPrice(double highestPrice) {
		HighestPrice = highestPrice;
		return this;
	}

	public RspDepthMarketData setLowestPrice(double lowestPrice) {
		LowestPrice = lowestPrice;
		return this;
	}

	public RspDepthMarketData setVolume(int volume) {
		Volume = volume;
		return this;
	}

	public RspDepthMarketData setTurnover(double turnover) {
		Turnover = turnover;
		return this;
	}

	public RspDepthMarketData setOpenInterest(double openInterest) {
		OpenInterest = openInterest;
		return this;
	}

	public RspDepthMarketData setClosePrice(double closePrice) {
		ClosePrice = closePrice;
		return this;
	}

	public RspDepthMarketData setSettlementPrice(double settlementPrice) {
		SettlementPrice = settlementPrice;
		return this;
	}

	public RspDepthMarketData setUpperLimitPrice(double upperLimitPrice) {
		UpperLimitPrice = upperLimitPrice;
		return this;
	}

	public RspDepthMarketData setLowerLimitPrice(double lowerLimitPrice) {
		LowerLimitPrice = lowerLimitPrice;
		return this;
	}

	public RspDepthMarketData setPreDelta(double preDelta) {
		PreDelta = preDelta;
		return this;
	}

	public RspDepthMarketData setCurrDelta(double currDelta) {
		CurrDelta = currDelta;
		return this;
	}

	public RspDepthMarketData setBidPrice1(double bidPrice1) {
		BidPrice1 = bidPrice1;
		return this;
	}

	public RspDepthMarketData setBidVolume1(int bidVolume1) {
		BidVolume1 = bidVolume1;
		return this;
	}

	public RspDepthMarketData setAskPrice1(double askPrice1) {
		AskPrice1 = askPrice1;
		return this;
	}

	public RspDepthMarketData setAskVolume1(int askVolume1) {
		AskVolume1 = askVolume1;
		return this;
	}

	public RspDepthMarketData setBidPrice2(double bidPrice2) {
		BidPrice2 = bidPrice2;
		return this;
	}

	public RspDepthMarketData setBidVolume2(int bidVolume2) {
		BidVolume2 = bidVolume2;
		return this;
	}

	public RspDepthMarketData setAskPrice2(double askPrice2) {
		AskPrice2 = askPrice2;
		return this;
	}

	public RspDepthMarketData setAskVolume2(int askVolume2) {
		AskVolume2 = askVolume2;
		return this;
	}

	public RspDepthMarketData setBidPrice3(double bidPrice3) {
		BidPrice3 = bidPrice3;
		return this;
	}

	public RspDepthMarketData setBidVolume3(int bidVolume3) {
		BidVolume3 = bidVolume3;
		return this;
	}

	public RspDepthMarketData setAskPrice3(double askPrice3) {
		AskPrice3 = askPrice3;
		return this;
	}

	public RspDepthMarketData setAskVolume3(int askVolume3) {
		AskVolume3 = askVolume3;
		return this;
	}

	public RspDepthMarketData setBidPrice4(double bidPrice4) {
		BidPrice4 = bidPrice4;
		return this;
	}

	public RspDepthMarketData setBidVolume4(int bidVolume4) {
		BidVolume4 = bidVolume4;
		return this;
	}

	public RspDepthMarketData setAskPrice4(double askPrice4) {
		AskPrice4 = askPrice4;
		return this;
	}

	public RspDepthMarketData setAskVolume4(int askVolume4) {
		AskVolume4 = askVolume4;
		return this;
	}

	public RspDepthMarketData setBidPrice5(double bidPrice5) {
		BidPrice5 = bidPrice5;
		return this;
	}

	public RspDepthMarketData setBidVolume5(int bidVolume5) {
		BidVolume5 = bidVolume5;
		return this;
	}

	public RspDepthMarketData setAskPrice5(double askPrice5) {
		AskPrice5 = askPrice5;
		return this;
	}

	public RspDepthMarketData setAskVolume5(int askVolume5) {
		AskVolume5 = askVolume5;
		return this;
	}

	public RspDepthMarketData setAveragePrice(double averagePrice) {
		AveragePrice = averagePrice;
		return this;
	}

	public RspDepthMarketData setUpdateTime(String updateTime) {
		UpdateTime = updateTime;
		return this;
	}

	public RspDepthMarketData setUpdateMillisec(int updateMillisec) {
		UpdateMillisec = updateMillisec;
		return this;
	}

	public RspDepthMarketData setActionDay(String actionDay) {
		ActionDay = actionDay;
		return this;
	}

}
