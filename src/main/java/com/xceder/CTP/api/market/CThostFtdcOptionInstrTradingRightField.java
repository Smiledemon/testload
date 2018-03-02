package com.xceder.CTP.api.market;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u6295\u8d44\u8005\u671f\u6743\u5408\u7ea6\u4ea4\u6613\u6743\u9650<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcOptionInstrTradingRightField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcInstrumentIDType */
	@Array({31}) 
	@Field(0) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcInvestorRangeType */
	@Field(1) 
	public byte InvestorRange() {
		return this.io.getByteField(this, 1);
	}
	/** C type : TThostFtdcInvestorRangeType */
	@Field(1) 
	public CThostFtdcOptionInstrTradingRightField InvestorRange(byte InvestorRange) {
		this.io.setByteField(this, 1, InvestorRange);
		return this;
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(2) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcInvestorIDType */
	@Array({13}) 
	@Field(3) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcDirectionType */
	@Field(4) 
	public byte Direction() {
		return this.io.getByteField(this, 4);
	}
	/** C type : TThostFtdcDirectionType */
	@Field(4) 
	public CThostFtdcOptionInstrTradingRightField Direction(byte Direction) {
		this.io.setByteField(this, 4, Direction);
		return this;
	}
	/** C type : TThostFtdcTradingRightType */
	@Field(5) 
	public byte TradingRight() {
		return this.io.getByteField(this, 5);
	}
	/** C type : TThostFtdcTradingRightType */
	@Field(5) 
	public CThostFtdcOptionInstrTradingRightField TradingRight(byte TradingRight) {
		this.io.setByteField(this, 5, TradingRight);
		return this;
	}
	public CThostFtdcOptionInstrTradingRightField() {
		super();
	}
	public CThostFtdcOptionInstrTradingRightField(Pointer pointer) {
		super(pointer);
	}
}
