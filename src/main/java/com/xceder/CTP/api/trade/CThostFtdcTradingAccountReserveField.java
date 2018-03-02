package com.xceder.CTP.api.trade;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u8d44\u91d1\u8d26\u6237\u57fa\u672c\u51c6\u5907\u91d1<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thosttraderapi") 
public class CThostFtdcTradingAccountReserveField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcAccountIDType */
	@Array({13}) 
	@Field(1) 
	public Pointer<Byte > AccountID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(2) 
	public double Reserve() {
		return this.io.getDoubleField(this, 2);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(2) 
	public CThostFtdcTradingAccountReserveField Reserve(double Reserve) {
		this.io.setDoubleField(this, 2, Reserve);
		return this;
	}
	/** C type : TThostFtdcCurrencyIDType */
	@Array({4}) 
	@Field(3) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 3);
	}
	public CThostFtdcTradingAccountReserveField() {
		super();
	}
	public CThostFtdcTradingAccountReserveField(Pointer pointer) {
		super(pointer);
	}
}
