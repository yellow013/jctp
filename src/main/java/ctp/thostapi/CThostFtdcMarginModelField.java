/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcMarginModelField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcMarginModelField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcMarginModelField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				thosttraderapiJNI.delete_CThostFtdcMarginModelField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		thosttraderapiJNI.CThostFtdcMarginModelField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return thosttraderapiJNI.CThostFtdcMarginModelField_BrokerID_get(swigCPtr, this);
	}

	public void setMarginModelID(String value) {
		thosttraderapiJNI.CThostFtdcMarginModelField_MarginModelID_set(swigCPtr, this, value);
	}

	public String getMarginModelID() {
		return thosttraderapiJNI.CThostFtdcMarginModelField_MarginModelID_get(swigCPtr, this);
	}

	public void setMarginModelName(String value) {
		thosttraderapiJNI.CThostFtdcMarginModelField_MarginModelName_set(swigCPtr, this, value);
	}

	public String getMarginModelName() {
		return thosttraderapiJNI.CThostFtdcMarginModelField_MarginModelName_get(swigCPtr, this);
	}

	public CThostFtdcMarginModelField() {
		this(thosttraderapiJNI.new_CThostFtdcMarginModelField(), true);
	}

}
