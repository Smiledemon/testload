package com.xceder.CTP.api.market;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u5f53\u524d\u62a5\u5355\u624b\u7eed\u8d39\u7684\u8be6\u7ec6\u5185\u5bb9<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcInstrumentOrderCommRateField extends StructObject {
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
	public CThostFtdcInstrumentOrderCommRateField InvestorRange(byte InvestorRange) {
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
	/** C type : TThostFtdcHedgeFlagType */
	@Field(4) 
	public byte HedgeFlag() {
		return this.io.getByteField(this, 4);
	}
	/** C type : TThostFtdcHedgeFlagType */
	@Field(4) 
	public CThostFtdcInstrumentOrderCommRateField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 4, HedgeFlag);
		return this;
	}
	/** C type : TThostFtdcRatioType */
	@Field(5) 
	public double OrderCommByVolume() {
		return this.io.getDoubleField(this, 5);
	}
	/** C type : TThostFtdcRatioType */
	@Field(5) 
	public CThostFtdcInstrumentOrderCommRateField OrderCommByVolume(double OrderCommByVolume) {
		this.io.setDoubleField(this, 5, OrderCommByVolume);
		return this;
	}
	/** C type : TThostFtdcRatioType */
	@Field(6) 
	public double OrderActionCommByVolume() {
		return this.io.getDoubleField(this, 6);
	}
	/** C type : TThostFtdcRatioType */
	@Field(6) 
	public CThostFtdcInstrumentOrderCommRateField OrderActionCommByVolume(double OrderActionCommByVolume) {
		this.io.setDoubleField(this, 6, OrderActionCommByVolume);
		return this;
	}
	public CThostFtdcInstrumentOrderCommRateField() {
		super();
	}
	public CThostFtdcInstrumentOrderCommRateField(Pointer pointer) {
		super(pointer);
	}
}
