package com.xceder.CTP.api.trade;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u8be2\u4ef7<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thosttraderapi") 
public class CThostFtdcForQuoteField extends StructObject {
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
	/** C type : TThostFtdcOrderRefType */
	@Array({13}) 
	@Field(3) 
	public Pointer<Byte > ForQuoteRef() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcUserIDType */
	@Array({16}) 
	@Field(4) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : TThostFtdcOrderLocalIDType */
	@Array({13}) 
	@Field(5) 
	public Pointer<Byte > ForQuoteLocalID() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : TThostFtdcExchangeIDType */
	@Array({9}) 
	@Field(6) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 6);
	}
	/** C type : TThostFtdcParticipantIDType */
	@Array({11}) 
	@Field(7) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : TThostFtdcClientIDType */
	@Array({11}) 
	@Field(8) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 8);
	}
	/** C type : TThostFtdcExchangeInstIDType */
	@Array({31}) 
	@Field(9) 
	public Pointer<Byte > ExchangeInstID() {
		return this.io.getPointerField(this, 9);
	}
	/** C type : TThostFtdcTraderIDType */
	@Array({21}) 
	@Field(10) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 10);
	}
	/** C type : TThostFtdcInstallIDType */
	@Field(11) 
	public int InstallID() {
		return this.io.getIntField(this, 11);
	}
	/** C type : TThostFtdcInstallIDType */
	@Field(11) 
	public CThostFtdcForQuoteField InstallID(int InstallID) {
		this.io.setIntField(this, 11, InstallID);
		return this;
	}
	/** C type : TThostFtdcDateType */
	@Array({9}) 
	@Field(12) 
	public Pointer<Byte > InsertDate() {
		return this.io.getPointerField(this, 12);
	}
	/** C type : TThostFtdcTimeType */
	@Array({9}) 
	@Field(13) 
	public Pointer<Byte > InsertTime() {
		return this.io.getPointerField(this, 13);
	}
	/** C type : TThostFtdcForQuoteStatusType */
	@Field(14) 
	public byte ForQuoteStatus() {
		return this.io.getByteField(this, 14);
	}
	/** C type : TThostFtdcForQuoteStatusType */
	@Field(14) 
	public CThostFtdcForQuoteField ForQuoteStatus(byte ForQuoteStatus) {
		this.io.setByteField(this, 14, ForQuoteStatus);
		return this;
	}
	/** C type : TThostFtdcFrontIDType */
	@Field(15) 
	public int FrontID() {
		return this.io.getIntField(this, 15);
	}
	/** C type : TThostFtdcFrontIDType */
	@Field(15) 
	public CThostFtdcForQuoteField FrontID(int FrontID) {
		this.io.setIntField(this, 15, FrontID);
		return this;
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(16) 
	public int SessionID() {
		return this.io.getIntField(this, 16);
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(16) 
	public CThostFtdcForQuoteField SessionID(int SessionID) {
		this.io.setIntField(this, 16, SessionID);
		return this;
	}
	/** C type : TThostFtdcErrorMsgType */
	@Array({81}) 
	@Field(17) 
	public Pointer<Byte > StatusMsg() {
		return this.io.getPointerField(this, 17);
	}
	/** C type : TThostFtdcUserIDType */
	@Array({16}) 
	@Field(18) 
	public Pointer<Byte > ActiveUserID() {
		return this.io.getPointerField(this, 18);
	}
	/** C type : TThostFtdcSequenceNoType */
	@Field(19) 
	public int BrokerForQutoSeq() {
		return this.io.getIntField(this, 19);
	}
	/** C type : TThostFtdcSequenceNoType */
	@Field(19) 
	public CThostFtdcForQuoteField BrokerForQutoSeq(int BrokerForQutoSeq) {
		this.io.setIntField(this, 19, BrokerForQutoSeq);
		return this;
	}
	/** C type : TThostFtdcInvestUnitIDType */
	@Array({17}) 
	@Field(20) 
	public Pointer<Byte > InvestUnitID() {
		return this.io.getPointerField(this, 20);
	}
	/** C type : TThostFtdcIPAddressType */
	@Array({16}) 
	@Field(21) 
	public Pointer<Byte > IPAddress() {
		return this.io.getPointerField(this, 21);
	}
	/** C type : TThostFtdcMacAddressType */
	@Array({21}) 
	@Field(22) 
	public Pointer<Byte > MacAddress() {
		return this.io.getPointerField(this, 22);
	}
	public CThostFtdcForQuoteField() {
		super();
	}
	public CThostFtdcForQuoteField(Pointer pointer) {
		super(pointer);
	}
}
