/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcInvestorAccountField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcInvestorAccountField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcInvestorAccountField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				thosttraderapiJNI.delete_CThostFtdcInvestorAccountField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		thosttraderapiJNI.CThostFtdcInvestorAccountField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return thosttraderapiJNI.CThostFtdcInvestorAccountField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value) {
		thosttraderapiJNI.CThostFtdcInvestorAccountField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID() {
		return thosttraderapiJNI.CThostFtdcInvestorAccountField_InvestorID_get(swigCPtr, this);
	}

	public void setAccountID(String value) {
		thosttraderapiJNI.CThostFtdcInvestorAccountField_AccountID_set(swigCPtr, this, value);
	}

	public String getAccountID() {
		return thosttraderapiJNI.CThostFtdcInvestorAccountField_AccountID_get(swigCPtr, this);
	}

	public void setCurrencyID(String value) {
		thosttraderapiJNI.CThostFtdcInvestorAccountField_CurrencyID_set(swigCPtr, this, value);
	}

	public String getCurrencyID() {
		return thosttraderapiJNI.CThostFtdcInvestorAccountField_CurrencyID_get(swigCPtr, this);
	}

	public CThostFtdcInvestorAccountField() {
		this(thosttraderapiJNI.new_CThostFtdcInvestorAccountField(), true);
	}

}
