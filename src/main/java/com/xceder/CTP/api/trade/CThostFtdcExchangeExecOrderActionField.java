package com.xceder.CTP.api.trade;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u4ea4\u6613\u6240\u6267\u884c\u5ba3\u544a\u64cd\u4f5c<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thosttraderapi") 
public class CThostFtdcExchangeExecOrderActionField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcExchangeIDType */
	@Array({9}) 
	@Field(0) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcExecOrderSysIDType */
	@Array({21}) 
	@Field(1) 
	public Pointer<Byte > ExecOrderSysID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcActionFlagType */
	@Field(2) 
	public byte ActionFlag() {
		return this.io.getByteField(this, 2);
	}
	/** C type : TThostFtdcActionFlagType */
	@Field(2) 
	public CThostFtdcExchangeExecOrderActionField ActionFlag(byte ActionFlag) {
		this.io.setByteField(this, 2, ActionFlag);
		return this;
	}
	/** C type : TThostFtdcDateType */
	@Array({9}) 
	@Field(3) 
	public Pointer<Byte > ActionDate() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcTimeType */
	@Array({9}) 
	@Field(4) 
	public Pointer<Byte > ActionTime() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : TThostFtdcTraderIDType */
	@Array({21}) 
	@Field(5) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : TThostFtdcInstallIDType */
	@Field(6) 
	public int InstallID() {
		return this.io.getIntField(this, 6);
	}
	/** C type : TThostFtdcInstallIDType */
	@Field(6) 
	public CThostFtdcExchangeExecOrderActionField InstallID(int InstallID) {
		this.io.setIntField(this, 6, InstallID);
		return this;
	}
	/** C type : TThostFtdcOrderLocalIDType */
	@Array({13}) 
	@Field(7) 
	public Pointer<Byte > ExecOrderLocalID() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : TThostFtdcOrderLocalIDType */
	@Array({13}) 
	@Field(8) 
	public Pointer<Byte > ActionLocalID() {
		return this.io.getPointerField(this, 8);
	}
	/** C type : TThostFtdcParticipantIDType */
	@Array({11}) 
	@Field(9) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 9);
	}
	/** C type : TThostFtdcClientIDType */
	@Array({11}) 
	@Field(10) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 10);
	}
	/** C type : TThostFtdcBusinessUnitType */
	@Array({21}) 
	@Field(11) 
	public Pointer<Byte > BusinessUnit() {
		return this.io.getPointerField(this, 11);
	}
	/** C type : TThostFtdcOrderActionStatusType */
	@Field(12) 
	public byte OrderActionStatus() {
		return this.io.getByteField(this, 12);
	}
	/** C type : TThostFtdcOrderActionStatusType */
	@Field(12) 
	public CThostFtdcExchangeExecOrderActionField OrderActionStatus(byte OrderActionStatus) {
		this.io.setByteField(this, 12, OrderActionStatus);
		return this;
	}
	/** C type : TThostFtdcUserIDType */
	@Array({16}) 
	@Field(13) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 13);
	}
	/** C type : TThostFtdcActionTypeType */
	@Field(14) 
	public byte ActionType() {
		return this.io.getByteField(this, 14);
	}
	/** C type : TThostFtdcActionTypeType */
	@Field(14) 
	public CThostFtdcExchangeExecOrderActionField ActionType(byte ActionType) {
		this.io.setByteField(this, 14, ActionType);
		return this;
	}
	/** C type : TThostFtdcBranchIDType */
	@Array({9}) 
	@Field(15) 
	public Pointer<Byte > BranchID() {
		return this.io.getPointerField(this, 15);
	}
	/** C type : TThostFtdcIPAddressType */
	@Array({16}) 
	@Field(16) 
	public Pointer<Byte > IPAddress() {
		return this.io.getPointerField(this, 16);
	}
	/** C type : TThostFtdcMacAddressType */
	@Array({21}) 
	@Field(17) 
	public Pointer<Byte > MacAddress() {
		return this.io.getPointerField(this, 17);
	}
	public CThostFtdcExchangeExecOrderActionField() {
		super();
	}
	public CThostFtdcExchangeExecOrderActionField(Pointer pointer) {
		super(pointer);
	}
}