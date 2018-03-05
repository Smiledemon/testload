package com.xceder.ctp.api.trade;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * UDP\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:8948</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thosttraderapi") 
public class CThostFtdcMulticastGroupInfoField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffdIP\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIPAddressType
	 */
	@Array({16}) 
	@Field(0) 
	public Pointer<Byte > GroupIP() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffdIP\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIPPortType
	 */
	@Field(1) 
	public int GroupPort() {
		return this.io.getIntField(this, 1);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffdIP\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIPPortType
	 */
	@Field(1) 
	public CThostFtdcMulticastGroupInfoField GroupPort(int GroupPort) {
		this.io.setIntField(this, 1, GroupPort);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIPAddressType
	 */
	@Array({16}) 
	@Field(2) 
	public Pointer<Byte > SourceIP() {
		return this.io.getPointerField(this, 2);
	}
	public CThostFtdcMulticastGroupInfoField() {
		super();
	}
	public CThostFtdcMulticastGroupInfoField(Pointer pointer) {
		super(pointer);
	}
}
