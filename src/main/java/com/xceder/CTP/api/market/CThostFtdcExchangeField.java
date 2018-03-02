package com.xceder.CTP.api.market;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u4ea4\u6613\u6240<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcExchangeField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcExchangeIDType */
	@Array({9}) 
	@Field(0) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcExchangeNameType */
	@Array({61}) 
	@Field(1) 
	public Pointer<Byte > ExchangeName() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcExchangePropertyType */
	@Field(2) 
	public byte ExchangeProperty() {
		return this.io.getByteField(this, 2);
	}
	/** C type : TThostFtdcExchangePropertyType */
	@Field(2) 
	public CThostFtdcExchangeField ExchangeProperty(byte ExchangeProperty) {
		this.io.setByteField(this, 2, ExchangeProperty);
		return this;
	}
	public CThostFtdcExchangeField() {
		super();
	}
	public CThostFtdcExchangeField(Pointer pointer) {
		super(pointer);
	}
}
