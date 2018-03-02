package com.xceder.CTP.api.trade;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u6279\u91cf\u62a5\u5355\u64cd\u4f5c<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thosttraderapi") 
public class CThostFtdcBatchOrderActionField extends StructObject {
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
	public CThostFtdcBatchOrderActionField OrderActionRef(int OrderActionRef) {
		this.io.setIntField(this, 2, OrderActionRef);
		return this;
	}
	/** C type : TThostFtdcRequestIDType */
	@Field(3) 
	public int RequestID() {
		return this.io.getIntField(this, 3);
	}
	/** C type : TThostFtdcRequestIDType */
	@Field(3) 
	public CThostFtdcBatchOrderActionField RequestID(int RequestID) {
		this.io.setIntField(this, 3, RequestID);
		return this;
	}
	/** C type : TThostFtdcFrontIDType */
	@Field(4) 
	public int FrontID() {
		return this.io.getIntField(this, 4);
	}
	/** C type : TThostFtdcFrontIDType */
	@Field(4) 
	public CThostFtdcBatchOrderActionField FrontID(int FrontID) {
		this.io.setIntField(this, 4, FrontID);
		return this;
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(5) 
	public int SessionID() {
		return this.io.getIntField(this, 5);
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(5) 
	public CThostFtdcBatchOrderActionField SessionID(int SessionID) {
		this.io.setIntField(this, 5, SessionID);
		return this;
	}
	/** C type : TThostFtdcExchangeIDType */
	@Array({9}) 
	@Field(6) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 6);
	}
	/** C type : TThostFtdcDateType */
	@Array({9}) 
	@Field(7) 
	public Pointer<Byte > ActionDate() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : TThostFtdcTimeType */
	@Array({9}) 
	@Field(8) 
	public Pointer<Byte > ActionTime() {
		return this.io.getPointerField(this, 8);
	}
	/** C type : TThostFtdcTraderIDType */
	@Array({21}) 
	@Field(9) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 9);
	}
	/** C type : TThostFtdcInstallIDType */
	@Field(10) 
	public int InstallID() {
		return this.io.getIntField(this, 10);
	}
	/** C type : TThostFtdcInstallIDType */
	@Field(10) 
	public CThostFtdcBatchOrderActionField InstallID(int InstallID) {
		this.io.setIntField(this, 10, InstallID);
		return this;
	}
	/** C type : TThostFtdcOrderLocalIDType */
	@Array({13}) 
	@Field(11) 
	public Pointer<Byte > ActionLocalID() {
		return this.io.getPointerField(this, 11);
	}
	/** C type : TThostFtdcParticipantIDType */
	@Array({11}) 
	@Field(12) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 12);
	}
	/** C type : TThostFtdcClientIDType */
	@Array({11}) 
	@Field(13) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 13);
	}
	/** C type : TThostFtdcBusinessUnitType */
	@Array({21}) 
	@Field(14) 
	public Pointer<Byte > BusinessUnit() {
		return this.io.getPointerField(this, 14);
	}
	/** C type : TThostFtdcOrderActionStatusType */
	@Field(15) 
	public byte OrderActionStatus() {
		return this.io.getByteField(this, 15);
	}
	/** C type : TThostFtdcOrderActionStatusType */
	@Field(15) 
	public CThostFtdcBatchOrderActionField OrderActionStatus(byte OrderActionStatus) {
		this.io.setByteField(this, 15, OrderActionStatus);
		return this;
	}
	/** C type : TThostFtdcUserIDType */
	@Array({16}) 
	@Field(16) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 16);
	}
	/** C type : TThostFtdcErrorMsgType */
	@Array({81}) 
	@Field(17) 
	public Pointer<Byte > StatusMsg() {
		return this.io.getPointerField(this, 17);
	}
	/** C type : TThostFtdcInvestUnitIDType */
	@Array({17}) 
	@Field(18) 
	public Pointer<Byte > InvestUnitID() {
		return this.io.getPointerField(this, 18);
	}
	/** C type : TThostFtdcIPAddressType */
	@Array({16}) 
	@Field(19) 
	public Pointer<Byte > IPAddress() {
		return this.io.getPointerField(this, 19);
	}
	/** C type : TThostFtdcMacAddressType */
	@Array({21}) 
	@Field(20) 
	public Pointer<Byte > MacAddress() {
		return this.io.getPointerField(this, 20);
	}
	public CThostFtdcBatchOrderActionField() {
		super();
	}
	public CThostFtdcBatchOrderActionField(Pointer pointer) {
		super(pointer);
	}
}
