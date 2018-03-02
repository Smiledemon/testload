package com.xceder.CTP.api.market;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u6c47\u7387<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcExchangeRateField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcCurrencyIDType */
	@Array({4}) 
	@Field(1) 
	public Pointer<Byte > FromCurrencyID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcCurrencyUnitType */
	@Field(2) 
	public double FromCurrencyUnit() {
		return this.io.getDoubleField(this, 2);
	}
	/** C type : TThostFtdcCurrencyUnitType */
	@Field(2) 
	public CThostFtdcExchangeRateField FromCurrencyUnit(double FromCurrencyUnit) {
		this.io.setDoubleField(this, 2, FromCurrencyUnit);
		return this;
	}
	/** C type : TThostFtdcCurrencyIDType */
	@Array({4}) 
	@Field(3) 
	public Pointer<Byte > ToCurrencyID() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcExchangeRateType */
	@Field(4) 
	public double ExchangeRate() {
		return this.io.getDoubleField(this, 4);
	}
	/** C type : TThostFtdcExchangeRateType */
	@Field(4) 
	public CThostFtdcExchangeRateField ExchangeRate(double ExchangeRate) {
		this.io.setDoubleField(this, 4, ExchangeRate);
		return this;
	}
	public CThostFtdcExchangeRateField() {
		super();
	}
	public CThostFtdcExchangeRateField(Pointer pointer) {
		super(pointer);
	}
}
