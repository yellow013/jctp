/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcQrySyncFundMortgageField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcQrySyncFundMortgageField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcQrySyncFundMortgageField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				thosttraderapiJNI.delete_CThostFtdcQrySyncFundMortgageField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		thosttraderapiJNI.CThostFtdcQrySyncFundMortgageField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return thosttraderapiJNI.CThostFtdcQrySyncFundMortgageField_BrokerID_get(swigCPtr, this);
	}

	public void setMortgageSeqNo(String value) {
		thosttraderapiJNI.CThostFtdcQrySyncFundMortgageField_MortgageSeqNo_set(swigCPtr, this, value);
	}

	public String getMortgageSeqNo() {
		return thosttraderapiJNI.CThostFtdcQrySyncFundMortgageField_MortgageSeqNo_get(swigCPtr, this);
	}

	public CThostFtdcQrySyncFundMortgageField() {
		this(thosttraderapiJNI.new_CThostFtdcQrySyncFundMortgageField(), true);
	}

}
