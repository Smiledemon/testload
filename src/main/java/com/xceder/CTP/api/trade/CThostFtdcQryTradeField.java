package com.xceder.CTP.api.trade;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u67e5\u8be2\u6210\u4ea4<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thosttraderapi") 
public class CThostFtdcQryTradeField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcInvestorIDType */
	@Array({13}) 
	@Field(1) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcInstrumentIDType */
	@Array({31}) 
	@Field(2) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcExchangeIDType */
	@Array({9}) 
	@Field(3) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcTradeIDType */
	@Array({21}) 
	@Field(4) 
	public Pointer<Byte > TradeID() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : TThostFtdcTimeType */
	@Array({9}) 
	@Field(5) 
	public Pointer<Byte > TradeTimeStart() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : TThostFtdcTimeType */
	@Array({9}) 
	@Field(6) 
	public Pointer<Byte > TradeTimeEnd() {
		return this.io.getPointerField(this, 6);
	}
	public CThostFtdcQryTradeField() {
		super();
	}
	public CThostFtdcQryTradeField(Pointer pointer) {
		super(pointer);
	}
}
