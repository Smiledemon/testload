package com.xceder.CTP.api.market;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u8f93\u5165\u9884\u57cb\u5355\u64cd\u4f5c<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcParkedOrderActionField extends StructObject {
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
	/** C type : TThostFtdcOrderActionRefType */
	@Field(2) 
	public int OrderActionRef() {
		return this.io.getIntField(this, 2);
	}
	/** C type : TThostFtdcOrderActionRefType */
	@Field(2) 
	public CThostFtdcParkedOrderActionField OrderActionRef(int OrderActionRef) {
		this.io.setIntField(this, 2, OrderActionRef);
		return this;
	}
	/** C type : TThostFtdcOrderRefType */
	@Array({13}) 
	@Field(3) 
	public Pointer<Byte > OrderRef() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcRequestIDType */
	@Field(4) 
	public int RequestID() {
		return this.io.getIntField(this, 4);
	}
	/** C type : TThostFtdcRequestIDType */
	@Field(4) 
	public CThostFtdcParkedOrderActionField RequestID(int RequestID) {
		this.io.setIntField(this, 4, RequestID);
		return this;
	}
	/** C type : TThostFtdcFrontIDType */
	@Field(5) 
	public int FrontID() {
		return this.io.getIntField(this, 5);
	}
	/** C type : TThostFtdcFrontIDType */
	@Field(5) 
	public CThostFtdcParkedOrderActionField FrontID(int FrontID) {
		this.io.setIntField(this, 5, FrontID);
		return this;
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(6) 
	public int SessionID() {
		return this.io.getIntField(this, 6);
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(6) 
	public CThostFtdcParkedOrderActionField SessionID(int SessionID) {
		this.io.setIntField(this, 6, SessionID);
		return this;
	}
	/** C type : TThostFtdcExchangeIDType */
	@Array({9}) 
	@Field(7) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : TThostFtdcOrderSysIDType */
	@Array({21}) 
	@Field(8) 
	public Pointer<Byte > OrderSysID() {
		return this.io.getPointerField(this, 8);
	}
	/** C type : TThostFtdcActionFlagType */
	@Field(9) 
	public byte ActionFlag() {
		return this.io.getByteField(this, 9);
	}
	/** C type : TThostFtdcActionFlagType */
	@Field(9) 
	public CThostFtdcParkedOrderActionField ActionFlag(byte ActionFlag) {
		this.io.setByteField(this, 9, ActionFlag);
		return this;
	}
	/** C type : TThostFtdcPriceType */
	@Field(10) 
	public double LimitPrice() {
		return this.io.getDoubleField(this, 10);
	}
	/** C type : TThostFtdcPriceType */
	@Field(10) 
	public CThostFtdcParkedOrderActionField LimitPrice(double LimitPrice) {
		this.io.setDoubleField(this, 10, LimitPrice);
		return this;
	}
	/** C type : TThostFtdcVolumeType */
	@Field(11) 
	public int VolumeChange() {
		return this.io.getIntField(this, 11);
	}
	/** C type : TThostFtdcVolumeType */
	@Field(11) 
	public CThostFtdcParkedOrderActionField VolumeChange(int VolumeChange) {
		this.io.setIntField(this, 11, VolumeChange);
		return this;
	}
	/** C type : TThostFtdcUserIDType */
	@Array({16}) 
	@Field(12) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 12);
	}
	/** C type : TThostFtdcInstrumentIDType */
	@Array({31}) 
	@Field(13) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 13);
	}
	/** C type : TThostFtdcParkedOrderActionIDType */
	@Array({13}) 
	@Field(14) 
	public Pointer<Byte > ParkedOrderActionID() {
		return this.io.getPointerField(this, 14);
	}
	/** C type : TThostFtdcUserTypeType */
	@Field(15) 
	public byte UserType() {
		return this.io.getByteField(this, 15);
	}
	/** C type : TThostFtdcUserTypeType */
	@Field(15) 
	public CThostFtdcParkedOrderActionField UserType(byte UserType) {
		this.io.setByteField(this, 15, UserType);
		return this;
	}
	/** C type : TThostFtdcParkedOrderStatusType */
	@Field(16) 
	public byte Status() {
		return this.io.getByteField(this, 16);
	}
	/** C type : TThostFtdcParkedOrderStatusType */
	@Field(16) 
	public CThostFtdcParkedOrderActionField Status(byte Status) {
		this.io.setByteField(this, 16, Status);
		return this;
	}
	/** C type : TThostFtdcErrorIDType */
	@Field(17) 
	public int ErrorID() {
		return this.io.getIntField(this, 17);
	}
	/** C type : TThostFtdcErrorIDType */
	@Field(17) 
	public CThostFtdcParkedOrderActionField ErrorID(int ErrorID) {
		this.io.setIntField(this, 17, ErrorID);
		return this;
	}
	/** C type : TThostFtdcErrorMsgType */
	@Array({81}) 
	@Field(18) 
	public Pointer<Byte > ErrorMsg() {
		return this.io.getPointerField(this, 18);
	}
	/** C type : TThostFtdcInvestUnitIDType */
	@Array({17}) 
	@Field(19) 
	public Pointer<Byte > InvestUnitID() {
		return this.io.getPointerField(this, 19);
	}
	/** C type : TThostFtdcIPAddressType */
	@Array({16}) 
	@Field(20) 
	public Pointer<Byte > IPAddress() {
		return this.io.getPointerField(this, 20);
	}
	/** C type : TThostFtdcMacAddressType */
	@Array({21}) 
	@Field(21) 
	public Pointer<Byte > MacAddress() {
		return this.io.getPointerField(this, 21);
	}
	public CThostFtdcParkedOrderActionField() {
		super();
	}
	public CThostFtdcParkedOrderActionField(Pointer pointer) {
		super(pointer);
	}
}
