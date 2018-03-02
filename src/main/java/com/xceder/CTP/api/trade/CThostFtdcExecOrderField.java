package com.xceder.CTP.api.trade;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u6267\u884c\u5ba3\u544a<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thosttraderapi") 
public class CThostFtdcExecOrderField extends StructObject {
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
	public Pointer<Byte > ExecOrderRef() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcUserIDType */
	@Array({16}) 
	@Field(4) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : TThostFtdcVolumeType */
	@Field(5) 
	public int Volume() {
		return this.io.getIntField(this, 5);
	}
	/** C type : TThostFtdcVolumeType */
	@Field(5) 
	public CThostFtdcExecOrderField Volume(int Volume) {
		this.io.setIntField(this, 5, Volume);
		return this;
	}
	/** C type : TThostFtdcRequestIDType */
	@Field(6) 
	public int RequestID() {
		return this.io.getIntField(this, 6);
	}
	/** C type : TThostFtdcRequestIDType */
	@Field(6) 
	public CThostFtdcExecOrderField RequestID(int RequestID) {
		this.io.setIntField(this, 6, RequestID);
		return this;
	}
	/** C type : TThostFtdcBusinessUnitType */
	@Array({21}) 
	@Field(7) 
	public Pointer<Byte > BusinessUnit() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : TThostFtdcOffsetFlagType */
	@Field(8) 
	public byte OffsetFlag() {
		return this.io.getByteField(this, 8);
	}
	/** C type : TThostFtdcOffsetFlagType */
	@Field(8) 
	public CThostFtdcExecOrderField OffsetFlag(byte OffsetFlag) {
		this.io.setByteField(this, 8, OffsetFlag);
		return this;
	}
	/** C type : TThostFtdcHedgeFlagType */
	@Field(9) 
	public byte HedgeFlag() {
		return this.io.getByteField(this, 9);
	}
	/** C type : TThostFtdcHedgeFlagType */
	@Field(9) 
	public CThostFtdcExecOrderField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 9, HedgeFlag);
		return this;
	}
	/** C type : TThostFtdcActionTypeType */
	@Field(10) 
	public byte ActionType() {
		return this.io.getByteField(this, 10);
	}
	/** C type : TThostFtdcActionTypeType */
	@Field(10) 
	public CThostFtdcExecOrderField ActionType(byte ActionType) {
		this.io.setByteField(this, 10, ActionType);
		return this;
	}
	/** C type : TThostFtdcPosiDirectionType */
	@Field(11) 
	public byte PosiDirection() {
		return this.io.getByteField(this, 11);
	}
	/** C type : TThostFtdcPosiDirectionType */
	@Field(11) 
	public CThostFtdcExecOrderField PosiDirection(byte PosiDirection) {
		this.io.setByteField(this, 11, PosiDirection);
		return this;
	}
	/** C type : TThostFtdcExecOrderPositionFlagType */
	@Field(12) 
	public byte ReservePositionFlag() {
		return this.io.getByteField(this, 12);
	}
	/** C type : TThostFtdcExecOrderPositionFlagType */
	@Field(12) 
	public CThostFtdcExecOrderField ReservePositionFlag(byte ReservePositionFlag) {
		this.io.setByteField(this, 12, ReservePositionFlag);
		return this;
	}
	/** C type : TThostFtdcExecOrderCloseFlagType */
	@Field(13) 
	public byte CloseFlag() {
		return this.io.getByteField(this, 13);
	}
	/** C type : TThostFtdcExecOrderCloseFlagType */
	@Field(13) 
	public CThostFtdcExecOrderField CloseFlag(byte CloseFlag) {
		this.io.setByteField(this, 13, CloseFlag);
		return this;
	}
	/** C type : TThostFtdcOrderLocalIDType */
	@Array({13}) 
	@Field(14) 
	public Pointer<Byte > ExecOrderLocalID() {
		return this.io.getPointerField(this, 14);
	}
	/** C type : TThostFtdcExchangeIDType */
	@Array({9}) 
	@Field(15) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 15);
	}
	/** C type : TThostFtdcParticipantIDType */
	@Array({11}) 
	@Field(16) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 16);
	}
	/** C type : TThostFtdcClientIDType */
	@Array({11}) 
	@Field(17) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 17);
	}
	/** C type : TThostFtdcExchangeInstIDType */
	@Array({31}) 
	@Field(18) 
	public Pointer<Byte > ExchangeInstID() {
		return this.io.getPointerField(this, 18);
	}
	/** C type : TThostFtdcTraderIDType */
	@Array({21}) 
	@Field(19) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 19);
	}
	/** C type : TThostFtdcInstallIDType */
	@Field(20) 
	public int InstallID() {
		return this.io.getIntField(this, 20);
	}
	/** C type : TThostFtdcInstallIDType */
	@Field(20) 
	public CThostFtdcExecOrderField InstallID(int InstallID) {
		this.io.setIntField(this, 20, InstallID);
		return this;
	}
	/** C type : TThostFtdcOrderSubmitStatusType */
	@Field(21) 
	public byte OrderSubmitStatus() {
		return this.io.getByteField(this, 21);
	}
	/** C type : TThostFtdcOrderSubmitStatusType */
	@Field(21) 
	public CThostFtdcExecOrderField OrderSubmitStatus(byte OrderSubmitStatus) {
		this.io.setByteField(this, 21, OrderSubmitStatus);
		return this;
	}
	/** C type : TThostFtdcSequenceNoType */
	@Field(22) 
	public int NotifySequence() {
		return this.io.getIntField(this, 22);
	}
	/** C type : TThostFtdcSequenceNoType */
	@Field(22) 
	public CThostFtdcExecOrderField NotifySequence(int NotifySequence) {
		this.io.setIntField(this, 22, NotifySequence);
		return this;
	}
	/** C type : TThostFtdcDateType */
	@Array({9}) 
	@Field(23) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 23);
	}
	/** C type : TThostFtdcSettlementIDType */
	@Field(24) 
	public int SettlementID() {
		return this.io.getIntField(this, 24);
	}
	/** C type : TThostFtdcSettlementIDType */
	@Field(24) 
	public CThostFtdcExecOrderField SettlementID(int SettlementID) {
		this.io.setIntField(this, 24, SettlementID);
		return this;
	}
	/** C type : TThostFtdcExecOrderSysIDType */
	@Array({21}) 
	@Field(25) 
	public Pointer<Byte > ExecOrderSysID() {
		return this.io.getPointerField(this, 25);
	}
	/** C type : TThostFtdcDateType */
	@Array({9}) 
	@Field(26) 
	public Pointer<Byte > InsertDate() {
		return this.io.getPointerField(this, 26);
	}
	/** C type : TThostFtdcTimeType */
	@Array({9}) 
	@Field(27) 
	public Pointer<Byte > InsertTime() {
		return this.io.getPointerField(this, 27);
	}
	/** C type : TThostFtdcTimeType */
	@Array({9}) 
	@Field(28) 
	public Pointer<Byte > CancelTime() {
		return this.io.getPointerField(this, 28);
	}
	/** C type : TThostFtdcExecResultType */
	@Field(29) 
	public byte ExecResult() {
		return this.io.getByteField(this, 29);
	}
	/** C type : TThostFtdcExecResultType */
	@Field(29) 
	public CThostFtdcExecOrderField ExecResult(byte ExecResult) {
		this.io.setByteField(this, 29, ExecResult);
		return this;
	}
	/** C type : TThostFtdcParticipantIDType */
	@Array({11}) 
	@Field(30) 
	public Pointer<Byte > ClearingPartID() {
		return this.io.getPointerField(this, 30);
	}
	/** C type : TThostFtdcSequenceNoType */
	@Field(31) 
	public int SequenceNo() {
		return this.io.getIntField(this, 31);
	}
	/** C type : TThostFtdcSequenceNoType */
	@Field(31) 
	public CThostFtdcExecOrderField SequenceNo(int SequenceNo) {
		this.io.setIntField(this, 31, SequenceNo);
		return this;
	}
	/** C type : TThostFtdcFrontIDType */
	@Field(32) 
	public int FrontID() {
		return this.io.getIntField(this, 32);
	}
	/** C type : TThostFtdcFrontIDType */
	@Field(32) 
	public CThostFtdcExecOrderField FrontID(int FrontID) {
		this.io.setIntField(this, 32, FrontID);
		return this;
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(33) 
	public int SessionID() {
		return this.io.getIntField(this, 33);
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(33) 
	public CThostFtdcExecOrderField SessionID(int SessionID) {
		this.io.setIntField(this, 33, SessionID);
		return this;
	}
	/** C type : TThostFtdcProductInfoType */
	@Array({11}) 
	@Field(34) 
	public Pointer<Byte > UserProductInfo() {
		return this.io.getPointerField(this, 34);
	}
	/** C type : TThostFtdcErrorMsgType */
	@Array({81}) 
	@Field(35) 
	public Pointer<Byte > StatusMsg() {
		return this.io.getPointerField(this, 35);
	}
	/** C type : TThostFtdcUserIDType */
	@Array({16}) 
	@Field(36) 
	public Pointer<Byte > ActiveUserID() {
		return this.io.getPointerField(this, 36);
	}
	/** C type : TThostFtdcSequenceNoType */
	@Field(37) 
	public int BrokerExecOrderSeq() {
		return this.io.getIntField(this, 37);
	}
	/** C type : TThostFtdcSequenceNoType */
	@Field(37) 
	public CThostFtdcExecOrderField BrokerExecOrderSeq(int BrokerExecOrderSeq) {
		this.io.setIntField(this, 37, BrokerExecOrderSeq);
		return this;
	}
	/** C type : TThostFtdcBranchIDType */
	@Array({9}) 
	@Field(38) 
	public Pointer<Byte > BranchID() {
		return this.io.getPointerField(this, 38);
	}
	/** C type : TThostFtdcInvestUnitIDType */
	@Array({17}) 
	@Field(39) 
	public Pointer<Byte > InvestUnitID() {
		return this.io.getPointerField(this, 39);
	}
	/** C type : TThostFtdcAccountIDType */
	@Array({13}) 
	@Field(40) 
	public Pointer<Byte > AccountID() {
		return this.io.getPointerField(this, 40);
	}
	/** C type : TThostFtdcCurrencyIDType */
	@Array({4}) 
	@Field(41) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 41);
	}
	/** C type : TThostFtdcIPAddressType */
	@Array({16}) 
	@Field(42) 
	public Pointer<Byte > IPAddress() {
		return this.io.getPointerField(this, 42);
	}
	/** C type : TThostFtdcMacAddressType */
	@Array({21}) 
	@Field(43) 
	public Pointer<Byte > MacAddress() {
		return this.io.getPointerField(this, 43);
	}
	public CThostFtdcExecOrderField() {
		super();
	}
	public CThostFtdcExecOrderField(Pointer pointer) {
		super(pointer);
	}
}
