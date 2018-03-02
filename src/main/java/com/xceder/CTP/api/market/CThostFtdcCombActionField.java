package com.xceder.CTP.api.market;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u7533\u8bf7\u7ec4\u5408<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcCombActionField extends StructObject {
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
	public Pointer<Byte > CombActionRef() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcUserIDType */
	@Array({16}) 
	@Field(4) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : TThostFtdcDirectionType */
	@Field(5) 
	public byte Direction() {
		return this.io.getByteField(this, 5);
	}
	/** C type : TThostFtdcDirectionType */
	@Field(5) 
	public CThostFtdcCombActionField Direction(byte Direction) {
		this.io.setByteField(this, 5, Direction);
		return this;
	}
	/** C type : TThostFtdcVolumeType */
	@Field(6) 
	public int Volume() {
		return this.io.getIntField(this, 6);
	}
	/** C type : TThostFtdcVolumeType */
	@Field(6) 
	public CThostFtdcCombActionField Volume(int Volume) {
		this.io.setIntField(this, 6, Volume);
		return this;
	}
	/** C type : TThostFtdcCombDirectionType */
	@Field(7) 
	public byte CombDirection() {
		return this.io.getByteField(this, 7);
	}
	/** C type : TThostFtdcCombDirectionType */
	@Field(7) 
	public CThostFtdcCombActionField CombDirection(byte CombDirection) {
		this.io.setByteField(this, 7, CombDirection);
		return this;
	}
	/** C type : TThostFtdcHedgeFlagType */
	@Field(8) 
	public byte HedgeFlag() {
		return this.io.getByteField(this, 8);
	}
	/** C type : TThostFtdcHedgeFlagType */
	@Field(8) 
	public CThostFtdcCombActionField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 8, HedgeFlag);
		return this;
	}
	/** C type : TThostFtdcOrderLocalIDType */
	@Array({13}) 
	@Field(9) 
	public Pointer<Byte > ActionLocalID() {
		return this.io.getPointerField(this, 9);
	}
	/** C type : TThostFtdcExchangeIDType */
	@Array({9}) 
	@Field(10) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 10);
	}
	/** C type : TThostFtdcParticipantIDType */
	@Array({11}) 
	@Field(11) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 11);
	}
	/** C type : TThostFtdcClientIDType */
	@Array({11}) 
	@Field(12) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 12);
	}
	/** C type : TThostFtdcExchangeInstIDType */
	@Array({31}) 
	@Field(13) 
	public Pointer<Byte > ExchangeInstID() {
		return this.io.getPointerField(this, 13);
	}
	/** C type : TThostFtdcTraderIDType */
	@Array({21}) 
	@Field(14) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 14);
	}
	/** C type : TThostFtdcInstallIDType */
	@Field(15) 
	public int InstallID() {
		return this.io.getIntField(this, 15);
	}
	/** C type : TThostFtdcInstallIDType */
	@Field(15) 
	public CThostFtdcCombActionField InstallID(int InstallID) {
		this.io.setIntField(this, 15, InstallID);
		return this;
	}
	/** C type : TThostFtdcOrderActionStatusType */
	@Field(16) 
	public byte ActionStatus() {
		return this.io.getByteField(this, 16);
	}
	/** C type : TThostFtdcOrderActionStatusType */
	@Field(16) 
	public CThostFtdcCombActionField ActionStatus(byte ActionStatus) {
		this.io.setByteField(this, 16, ActionStatus);
		return this;
	}
	/** C type : TThostFtdcSequenceNoType */
	@Field(17) 
	public int NotifySequence() {
		return this.io.getIntField(this, 17);
	}
	/** C type : TThostFtdcSequenceNoType */
	@Field(17) 
	public CThostFtdcCombActionField NotifySequence(int NotifySequence) {
		this.io.setIntField(this, 17, NotifySequence);
		return this;
	}
	/** C type : TThostFtdcDateType */
	@Array({9}) 
	@Field(18) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 18);
	}
	/** C type : TThostFtdcSettlementIDType */
	@Field(19) 
	public int SettlementID() {
		return this.io.getIntField(this, 19);
	}
	/** C type : TThostFtdcSettlementIDType */
	@Field(19) 
	public CThostFtdcCombActionField SettlementID(int SettlementID) {
		this.io.setIntField(this, 19, SettlementID);
		return this;
	}
	/** C type : TThostFtdcSequenceNoType */
	@Field(20) 
	public int SequenceNo() {
		return this.io.getIntField(this, 20);
	}
	/** C type : TThostFtdcSequenceNoType */
	@Field(20) 
	public CThostFtdcCombActionField SequenceNo(int SequenceNo) {
		this.io.setIntField(this, 20, SequenceNo);
		return this;
	}
	/** C type : TThostFtdcFrontIDType */
	@Field(21) 
	public int FrontID() {
		return this.io.getIntField(this, 21);
	}
	/** C type : TThostFtdcFrontIDType */
	@Field(21) 
	public CThostFtdcCombActionField FrontID(int FrontID) {
		this.io.setIntField(this, 21, FrontID);
		return this;
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(22) 
	public int SessionID() {
		return this.io.getIntField(this, 22);
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(22) 
	public CThostFtdcCombActionField SessionID(int SessionID) {
		this.io.setIntField(this, 22, SessionID);
		return this;
	}
	/** C type : TThostFtdcProductInfoType */
	@Array({11}) 
	@Field(23) 
	public Pointer<Byte > UserProductInfo() {
		return this.io.getPointerField(this, 23);
	}
	/** C type : TThostFtdcErrorMsgType */
	@Array({81}) 
	@Field(24) 
	public Pointer<Byte > StatusMsg() {
		return this.io.getPointerField(this, 24);
	}
	/** C type : TThostFtdcIPAddressType */
	@Array({16}) 
	@Field(25) 
	public Pointer<Byte > IPAddress() {
		return this.io.getPointerField(this, 25);
	}
	/** C type : TThostFtdcMacAddressType */
	@Array({21}) 
	@Field(26) 
	public Pointer<Byte > MacAddress() {
		return this.io.getPointerField(this, 26);
	}
	public CThostFtdcCombActionField() {
		super();
	}
	public CThostFtdcCombActionField(Pointer pointer) {
		super(pointer);
	}
}
