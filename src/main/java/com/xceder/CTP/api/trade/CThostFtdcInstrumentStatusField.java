package com.xceder.CTP.api.trade;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u5408\u7ea6\u72b6\u6001<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thosttraderapi") 
public class CThostFtdcInstrumentStatusField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcExchangeIDType */
	@Array({9}) 
	@Field(0) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcExchangeInstIDType */
	@Array({31}) 
	@Field(1) 
	public Pointer<Byte > ExchangeInstID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcSettlementGroupIDType */
	@Array({9}) 
	@Field(2) 
	public Pointer<Byte > SettlementGroupID() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcInstrumentIDType */
	@Array({31}) 
	@Field(3) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcInstrumentStatusType */
	@Field(4) 
	public byte InstrumentStatus() {
		return this.io.getByteField(this, 4);
	}
	/** C type : TThostFtdcInstrumentStatusType */
	@Field(4) 
	public CThostFtdcInstrumentStatusField InstrumentStatus(byte InstrumentStatus) {
		this.io.setByteField(this, 4, InstrumentStatus);
		return this;
	}
	/** C type : TThostFtdcTradingSegmentSNType */
	@Field(5) 
	public int TradingSegmentSN() {
		return this.io.getIntField(this, 5);
	}
	/** C type : TThostFtdcTradingSegmentSNType */
	@Field(5) 
	public CThostFtdcInstrumentStatusField TradingSegmentSN(int TradingSegmentSN) {
		this.io.setIntField(this, 5, TradingSegmentSN);
		return this;
	}
	/** C type : TThostFtdcTimeType */
	@Array({9}) 
	@Field(6) 
	public Pointer<Byte > EnterTime() {
		return this.io.getPointerField(this, 6);
	}
	/** C type : TThostFtdcInstStatusEnterReasonType */
	@Field(7) 
	public byte EnterReason() {
		return this.io.getByteField(this, 7);
	}
	/** C type : TThostFtdcInstStatusEnterReasonType */
	@Field(7) 
	public CThostFtdcInstrumentStatusField EnterReason(byte EnterReason) {
		this.io.setByteField(this, 7, EnterReason);
		return this;
	}
	public CThostFtdcInstrumentStatusField() {
		super();
	}
	public CThostFtdcInstrumentStatusField(Pointer pointer) {
		super(pointer);
	}
}
