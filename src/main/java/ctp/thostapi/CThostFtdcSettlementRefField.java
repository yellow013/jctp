/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcSettlementRefField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcSettlementRefField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcSettlementRefField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				thosttraderapiJNI.delete_CThostFtdcSettlementRefField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setTradingDay(String value) {
		thosttraderapiJNI.CThostFtdcSettlementRefField_TradingDay_set(swigCPtr, this, value);
	}

	public String getTradingDay() {
		return thosttraderapiJNI.CThostFtdcSettlementRefField_TradingDay_get(swigCPtr, this);
	}

	public void setSettlementID(int value) {
		thosttraderapiJNI.CThostFtdcSettlementRefField_SettlementID_set(swigCPtr, this, value);
	}

	public int getSettlementID() {
		return thosttraderapiJNI.CThostFtdcSettlementRefField_SettlementID_get(swigCPtr, this);
	}

	public CThostFtdcSettlementRefField() {
		this(thosttraderapiJNI.new_CThostFtdcSettlementRefField(), true);
	}

}
