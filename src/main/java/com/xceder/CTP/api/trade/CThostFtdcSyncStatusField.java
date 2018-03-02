package com.xceder.CTP.api.trade;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u6570\u636e\u540c\u6b65\u72b6\u6001<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thosttraderapi") 
public class CThostFtdcSyncStatusField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcDateType */
	@Array({9}) 
	@Field(0) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcDataSyncStatusType */
	@Field(1) 
	public byte DataSyncStatus() {
		return this.io.getByteField(this, 1);
	}
	/** C type : TThostFtdcDataSyncStatusType */
	@Field(1) 
	public CThostFtdcSyncStatusField DataSyncStatus(byte DataSyncStatus) {
		this.io.setByteField(this, 1, DataSyncStatus);
		return this;
	}
	public CThostFtdcSyncStatusField() {
		super();
	}
	public CThostFtdcSyncStatusField(Pointer pointer) {
		super(pointer);
	}
}
