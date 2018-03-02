package com.xceder.CTP.api.trade;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u67e5\u8be2\u7528\u6237\u4f1a\u8bdd<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thosttraderapi") 
public class CThostFtdcQryUserSessionField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcFrontIDType */
	@Field(0) 
	public int FrontID() {
		return this.io.getIntField(this, 0);
	}
	/** C type : TThostFtdcFrontIDType */
	@Field(0) 
	public CThostFtdcQryUserSessionField FrontID(int FrontID) {
		this.io.setIntField(this, 0, FrontID);
		return this;
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(1) 
	public int SessionID() {
		return this.io.getIntField(this, 1);
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(1) 
	public CThostFtdcQryUserSessionField SessionID(int SessionID) {
		this.io.setIntField(this, 1, SessionID);
		return this;
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(2) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcUserIDType */
	@Array({16}) 
	@Field(3) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 3);
	}
	public CThostFtdcQryUserSessionField() {
		super();
	}
	public CThostFtdcQryUserSessionField(Pointer pointer) {
		super(pointer);
	}
}
