package com.xceder.CTP.api.trade;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u5408\u7ea6\u624b\u7eed\u8d39\u7387<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thosttraderapi") 
public class CThostFtdcInstrumentCommissionRateField extends StructObject {
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
	public CThostFtdcInstrumentCommissionRateField InvestorRange(byte InvestorRange) {
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
	/** C type : TThostFtdcRatioType */
	@Field(4) 
	public double OpenRatioByMoney() {
		return this.io.getDoubleField(this, 4);
	}
	/** C type : TThostFtdcRatioType */
	@Field(4) 
	public CThostFtdcInstrumentCommissionRateField OpenRatioByMoney(double OpenRatioByMoney) {
		this.io.setDoubleField(this, 4, OpenRatioByMoney);
		return this;
	}
	/** C type : TThostFtdcRatioType */
	@Field(5) 
	public double OpenRatioByVolume() {
		return this.io.getDoubleField(this, 5);
	}
	/** C type : TThostFtdcRatioType */
	@Field(5) 
	public CThostFtdcInstrumentCommissionRateField OpenRatioByVolume(double OpenRatioByVolume) {
		this.io.setDoubleField(this, 5, OpenRatioByVolume);
		return this;
	}
	/** C type : TThostFtdcRatioType */
	@Field(6) 
	public double CloseRatioByMoney() {
		return this.io.getDoubleField(this, 6);
	}
	/** C type : TThostFtdcRatioType */
	@Field(6) 
	public CThostFtdcInstrumentCommissionRateField CloseRatioByMoney(double CloseRatioByMoney) {
		this.io.setDoubleField(this, 6, CloseRatioByMoney);
		return this;
	}
	/** C type : TThostFtdcRatioType */
	@Field(7) 
	public double CloseRatioByVolume() {
		return this.io.getDoubleField(this, 7);
	}
	/** C type : TThostFtdcRatioType */
	@Field(7) 
	public CThostFtdcInstrumentCommissionRateField CloseRatioByVolume(double CloseRatioByVolume) {
		this.io.setDoubleField(this, 7, CloseRatioByVolume);
		return this;
	}
	/** C type : TThostFtdcRatioType */
	@Field(8) 
	public double CloseTodayRatioByMoney() {
		return this.io.getDoubleField(this, 8);
	}
	/** C type : TThostFtdcRatioType */
	@Field(8) 
	public CThostFtdcInstrumentCommissionRateField CloseTodayRatioByMoney(double CloseTodayRatioByMoney) {
		this.io.setDoubleField(this, 8, CloseTodayRatioByMoney);
		return this;
	}
	/** C type : TThostFtdcRatioType */
	@Field(9) 
	public double CloseTodayRatioByVolume() {
		return this.io.getDoubleField(this, 9);
	}
	/** C type : TThostFtdcRatioType */
	@Field(9) 
	public CThostFtdcInstrumentCommissionRateField CloseTodayRatioByVolume(double CloseTodayRatioByVolume) {
		this.io.setDoubleField(this, 9, CloseTodayRatioByVolume);
		return this;
	}
	public CThostFtdcInstrumentCommissionRateField() {
		super();
	}
	public CThostFtdcInstrumentCommissionRateField(Pointer pointer) {
		super(pointer);
	}
}
