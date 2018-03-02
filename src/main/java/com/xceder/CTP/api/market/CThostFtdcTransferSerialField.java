package com.xceder.CTP.api.market;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u94f6\u671f\u8f6c\u8d26\u4ea4\u6613\u6d41\u6c34\u8868<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcTransferSerialField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcPlateSerialType */
	@Field(0) 
	public int PlateSerial() {
		return this.io.getIntField(this, 0);
	}
	/** C type : TThostFtdcPlateSerialType */
	@Field(0) 
	public CThostFtdcTransferSerialField PlateSerial(int PlateSerial) {
		this.io.setIntField(this, 0, PlateSerial);
		return this;
	}
	/** C type : TThostFtdcTradeDateType */
	@Array({9}) 
	@Field(1) 
	public Pointer<Byte > TradeDate() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcDateType */
	@Array({9}) 
	@Field(2) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcTradeTimeType */
	@Array({9}) 
	@Field(3) 
	public Pointer<Byte > TradeTime() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcTradeCodeType */
	@Array({7}) 
	@Field(4) 
	public Pointer<Byte > TradeCode() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(5) 
	public int SessionID() {
		return this.io.getIntField(this, 5);
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(5) 
	public CThostFtdcTransferSerialField SessionID(int SessionID) {
		this.io.setIntField(this, 5, SessionID);
		return this;
	}
	/** C type : TThostFtdcBankIDType */
	@Array({4}) 
	@Field(6) 
	public Pointer<Byte > BankID() {
		return this.io.getPointerField(this, 6);
	}
	/** C type : TThostFtdcBankBrchIDType */
	@Array({5}) 
	@Field(7) 
	public Pointer<Byte > BankBranchID() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : TThostFtdcBankAccTypeType */
	@Field(8) 
	public byte BankAccType() {
		return this.io.getByteField(this, 8);
	}
	/** C type : TThostFtdcBankAccTypeType */
	@Field(8) 
	public CThostFtdcTransferSerialField BankAccType(byte BankAccType) {
		this.io.setByteField(this, 8, BankAccType);
		return this;
	}
	/** C type : TThostFtdcBankAccountType */
	@Array({41}) 
	@Field(9) 
	public Pointer<Byte > BankAccount() {
		return this.io.getPointerField(this, 9);
	}
	/** C type : TThostFtdcBankSerialType */
	@Array({13}) 
	@Field(10) 
	public Pointer<Byte > BankSerial() {
		return this.io.getPointerField(this, 10);
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(11) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 11);
	}
	/** C type : TThostFtdcFutureBranchIDType */
	@Array({31}) 
	@Field(12) 
	public Pointer<Byte > BrokerBranchID() {
		return this.io.getPointerField(this, 12);
	}
	/** C type : TThostFtdcFutureAccTypeType */
	@Field(13) 
	public byte FutureAccType() {
		return this.io.getByteField(this, 13);
	}
	/** C type : TThostFtdcFutureAccTypeType */
	@Field(13) 
	public CThostFtdcTransferSerialField FutureAccType(byte FutureAccType) {
		this.io.setByteField(this, 13, FutureAccType);
		return this;
	}
	/** C type : TThostFtdcAccountIDType */
	@Array({13}) 
	@Field(14) 
	public Pointer<Byte > AccountID() {
		return this.io.getPointerField(this, 14);
	}
	/** C type : TThostFtdcInvestorIDType */
	@Array({13}) 
	@Field(15) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 15);
	}
	/** C type : TThostFtdcFutureSerialType */
	@Field(16) 
	public int FutureSerial() {
		return this.io.getIntField(this, 16);
	}
	/** C type : TThostFtdcFutureSerialType */
	@Field(16) 
	public CThostFtdcTransferSerialField FutureSerial(int FutureSerial) {
		this.io.setIntField(this, 16, FutureSerial);
		return this;
	}
	/** C type : TThostFtdcIdCardTypeType */
	@Field(17) 
	public byte IdCardType() {
		return this.io.getByteField(this, 17);
	}
	/** C type : TThostFtdcIdCardTypeType */
	@Field(17) 
	public CThostFtdcTransferSerialField IdCardType(byte IdCardType) {
		this.io.setByteField(this, 17, IdCardType);
		return this;
	}
	/** C type : TThostFtdcIdentifiedCardNoType */
	@Array({51}) 
	@Field(18) 
	public Pointer<Byte > IdentifiedCardNo() {
		return this.io.getPointerField(this, 18);
	}
	/** C type : TThostFtdcCurrencyIDType */
	@Array({4}) 
	@Field(19) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 19);
	}
	/** C type : TThostFtdcTradeAmountType */
	@Field(20) 
	public double TradeAmount() {
		return this.io.getDoubleField(this, 20);
	}
	/** C type : TThostFtdcTradeAmountType */
	@Field(20) 
	public CThostFtdcTransferSerialField TradeAmount(double TradeAmount) {
		this.io.setDoubleField(this, 20, TradeAmount);
		return this;
	}
	/** C type : TThostFtdcCustFeeType */
	@Field(21) 
	public double CustFee() {
		return this.io.getDoubleField(this, 21);
	}
	/** C type : TThostFtdcCustFeeType */
	@Field(21) 
	public CThostFtdcTransferSerialField CustFee(double CustFee) {
		this.io.setDoubleField(this, 21, CustFee);
		return this;
	}
	/** C type : TThostFtdcFutureFeeType */
	@Field(22) 
	public double BrokerFee() {
		return this.io.getDoubleField(this, 22);
	}
	/** C type : TThostFtdcFutureFeeType */
	@Field(22) 
	public CThostFtdcTransferSerialField BrokerFee(double BrokerFee) {
		this.io.setDoubleField(this, 22, BrokerFee);
		return this;
	}
	/** C type : TThostFtdcAvailabilityFlagType */
	@Field(23) 
	public byte AvailabilityFlag() {
		return this.io.getByteField(this, 23);
	}
	/** C type : TThostFtdcAvailabilityFlagType */
	@Field(23) 
	public CThostFtdcTransferSerialField AvailabilityFlag(byte AvailabilityFlag) {
		this.io.setByteField(this, 23, AvailabilityFlag);
		return this;
	}
	/** C type : TThostFtdcOperatorCodeType */
	@Array({17}) 
	@Field(24) 
	public Pointer<Byte > OperatorCode() {
		return this.io.getPointerField(this, 24);
	}
	/** C type : TThostFtdcBankAccountType */
	@Array({41}) 
	@Field(25) 
	public Pointer<Byte > BankNewAccount() {
		return this.io.getPointerField(this, 25);
	}
	/** C type : TThostFtdcErrorIDType */
	@Field(26) 
	public int ErrorID() {
		return this.io.getIntField(this, 26);
	}
	/** C type : TThostFtdcErrorIDType */
	@Field(26) 
	public CThostFtdcTransferSerialField ErrorID(int ErrorID) {
		this.io.setIntField(this, 26, ErrorID);
		return this;
	}
	/** C type : TThostFtdcErrorMsgType */
	@Array({81}) 
	@Field(27) 
	public Pointer<Byte > ErrorMsg() {
		return this.io.getPointerField(this, 27);
	}
	public CThostFtdcTransferSerialField() {
		super();
	}
	public CThostFtdcTransferSerialField(Pointer pointer) {
		super(pointer);
	}
}
