/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcReserveOpenAccountField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcReserveOpenAccountField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcReserveOpenAccountField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				thosttraderapiJNI.delete_CThostFtdcReserveOpenAccountField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setTradeCode(String value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_TradeCode_set(swigCPtr, this, value);
	}

	public String getTradeCode() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_TradeCode_get(swigCPtr, this);
	}

	public void setBankID(String value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_BankID_set(swigCPtr, this, value);
	}

	public String getBankID() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_BankID_get(swigCPtr, this);
	}

	public void setBankBranchID(String value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_BankBranchID_set(swigCPtr, this, value);
	}

	public String getBankBranchID() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_BankBranchID_get(swigCPtr, this);
	}

	public void setBrokerID(String value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_BrokerID_get(swigCPtr, this);
	}

	public void setBrokerBranchID(String value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_BrokerBranchID_set(swigCPtr, this, value);
	}

	public String getBrokerBranchID() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_BrokerBranchID_get(swigCPtr, this);
	}

	public void setTradeDate(String value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_TradeDate_set(swigCPtr, this, value);
	}

	public String getTradeDate() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_TradeDate_get(swigCPtr, this);
	}

	public void setTradeTime(String value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_TradeTime_set(swigCPtr, this, value);
	}

	public String getTradeTime() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_TradeTime_get(swigCPtr, this);
	}

	public void setBankSerial(String value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_BankSerial_set(swigCPtr, this, value);
	}

	public String getBankSerial() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_BankSerial_get(swigCPtr, this);
	}

	public void setTradingDay(String value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_TradingDay_set(swigCPtr, this, value);
	}

	public String getTradingDay() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_TradingDay_get(swigCPtr, this);
	}

	public void setPlateSerial(int value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_PlateSerial_set(swigCPtr, this, value);
	}

	public int getPlateSerial() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_PlateSerial_get(swigCPtr, this);
	}

	public void setLastFragment(char value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_LastFragment_set(swigCPtr, this, value);
	}

	public char getLastFragment() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_LastFragment_get(swigCPtr, this);
	}

	public void setSessionID(int value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_SessionID_set(swigCPtr, this, value);
	}

	public int getSessionID() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_SessionID_get(swigCPtr, this);
	}

	public void setCustomerName(String value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_CustomerName_set(swigCPtr, this, value);
	}

	public String getCustomerName() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_CustomerName_get(swigCPtr, this);
	}

	public void setIdCardType(char value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_IdCardType_set(swigCPtr, this, value);
	}

	public char getIdCardType() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_IdCardType_get(swigCPtr, this);
	}

	public void setIdentifiedCardNo(String value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_IdentifiedCardNo_set(swigCPtr, this, value);
	}

	public String getIdentifiedCardNo() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_IdentifiedCardNo_get(swigCPtr, this);
	}

	public void setGender(char value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_Gender_set(swigCPtr, this, value);
	}

	public char getGender() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_Gender_get(swigCPtr, this);
	}

	public void setCountryCode(String value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_CountryCode_set(swigCPtr, this, value);
	}

	public String getCountryCode() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_CountryCode_get(swigCPtr, this);
	}

	public void setCustType(char value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_CustType_set(swigCPtr, this, value);
	}

	public char getCustType() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_CustType_get(swigCPtr, this);
	}

	public void setAddress(String value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_Address_set(swigCPtr, this, value);
	}

	public String getAddress() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_Address_get(swigCPtr, this);
	}

	public void setZipCode(String value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_ZipCode_set(swigCPtr, this, value);
	}

	public String getZipCode() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_ZipCode_get(swigCPtr, this);
	}

	public void setTelephone(String value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_Telephone_set(swigCPtr, this, value);
	}

	public String getTelephone() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_Telephone_get(swigCPtr, this);
	}

	public void setMobilePhone(String value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_MobilePhone_set(swigCPtr, this, value);
	}

	public String getMobilePhone() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_MobilePhone_get(swigCPtr, this);
	}

	public void setFax(String value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_Fax_set(swigCPtr, this, value);
	}

	public String getFax() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_Fax_get(swigCPtr, this);
	}

	public void setEMail(String value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_EMail_set(swigCPtr, this, value);
	}

	public String getEMail() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_EMail_get(swigCPtr, this);
	}

	public void setMoneyAccountStatus(char value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_MoneyAccountStatus_set(swigCPtr, this, value);
	}

	public char getMoneyAccountStatus() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_MoneyAccountStatus_get(swigCPtr, this);
	}

	public void setBankAccount(String value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_BankAccount_set(swigCPtr, this, value);
	}

	public String getBankAccount() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_BankAccount_get(swigCPtr, this);
	}

	public void setBankPassWord(String value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_BankPassWord_set(swigCPtr, this, value);
	}

	public String getBankPassWord() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_BankPassWord_get(swigCPtr, this);
	}

	public void setInstallID(int value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_InstallID_set(swigCPtr, this, value);
	}

	public int getInstallID() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_InstallID_get(swigCPtr, this);
	}

	public void setVerifyCertNoFlag(char value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_VerifyCertNoFlag_set(swigCPtr, this, value);
	}

	public char getVerifyCertNoFlag() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_VerifyCertNoFlag_get(swigCPtr, this);
	}

	public void setCurrencyID(String value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_CurrencyID_set(swigCPtr, this, value);
	}

	public String getCurrencyID() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_CurrencyID_get(swigCPtr, this);
	}

	public void setDigest(String value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_Digest_set(swigCPtr, this, value);
	}

	public String getDigest() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_Digest_get(swigCPtr, this);
	}

	public void setBankAccType(char value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_BankAccType_set(swigCPtr, this, value);
	}

	public char getBankAccType() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_BankAccType_get(swigCPtr, this);
	}

	public void setBrokerIDByBank(String value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_BrokerIDByBank_set(swigCPtr, this, value);
	}

	public String getBrokerIDByBank() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_BrokerIDByBank_get(swigCPtr, this);
	}

	public void setTID(int value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_TID_set(swigCPtr, this, value);
	}

	public int getTID() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_TID_get(swigCPtr, this);
	}

	public void setReserveOpenAccStas(char value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_ReserveOpenAccStas_set(swigCPtr, this, value);
	}

	public char getReserveOpenAccStas() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_ReserveOpenAccStas_get(swigCPtr, this);
	}

	public void setErrorID(int value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_ErrorID_set(swigCPtr, this, value);
	}

	public int getErrorID() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_ErrorID_get(swigCPtr, this);
	}

	public void setErrorMsg(String value) {
		thosttraderapiJNI.CThostFtdcReserveOpenAccountField_ErrorMsg_set(swigCPtr, this, value);
	}

	public String getErrorMsg() {
		return thosttraderapiJNI.CThostFtdcReserveOpenAccountField_ErrorMsg_get(swigCPtr, this);
	}

	public CThostFtdcReserveOpenAccountField() {
		this(thosttraderapiJNI.new_CThostFtdcReserveOpenAccountField(), true);
	}

}
