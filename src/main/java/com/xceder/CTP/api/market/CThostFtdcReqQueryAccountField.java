package com.xceder.ctp.api.market;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:7474</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcReqQueryAccountField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeCodeType
	 */
	@Array({7}) 
	@Field(0) 
	public Pointer<Byte > TradeCode() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankIDType
	 */
	@Array({4}) 
	@Field(1) 
	public Pointer<Byte > BankID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankBrchIDType
	 */
	@Array({5}) 
	@Field(2) 
	public Pointer<Byte > BankBranchID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(3) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcFutureBranchIDType
	 */
	@Array({31}) 
	@Field(4) 
	public Pointer<Byte > BrokerBranchID() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeDateType
	 */
	@Array({9}) 
	@Field(5) 
	public Pointer<Byte > TradeDate() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeTimeType
	 */
	@Array({9}) 
	@Field(6) 
	public Pointer<Byte > TradeTime() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankSerialType
	 */
	@Array({13}) 
	@Field(7) 
	public Pointer<Byte > BankSerial() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeDateType
	 */
	@Array({9}) 
	@Field(8) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSerialType
	 */
	@Field(9) 
	public int PlateSerial() {
		return this.io.getIntField(this, 9);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSerialType
	 */
	@Field(9) 
	public CThostFtdcReqQueryAccountField PlateSerial(int PlateSerial) {
		this.io.setIntField(this, 9, PlateSerial);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcLastFragmentType
	 */
	@Field(10) 
	public byte LastFragment() {
		return this.io.getByteField(this, 10);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcLastFragmentType
	 */
	@Field(10) 
	public CThostFtdcReqQueryAccountField LastFragment(byte LastFragment) {
		this.io.setByteField(this, 10, LastFragment);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(11) 
	public int SessionID() {
		return this.io.getIntField(this, 11);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(11) 
	public CThostFtdcReqQueryAccountField SessionID(int SessionID) {
		this.io.setIntField(this, 11, SessionID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIndividualNameType
	 */
	@Array({51}) 
	@Field(12) 
	public Pointer<Byte > CustomerName() {
		return this.io.getPointerField(this, 12);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIdCardTypeType
	 */
	@Field(13) 
	public byte IdCardType() {
		return this.io.getByteField(this, 13);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIdCardTypeType
	 */
	@Field(13) 
	public CThostFtdcReqQueryAccountField IdCardType(byte IdCardType) {
		this.io.setByteField(this, 13, IdCardType);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIdentifiedCardNoType
	 */
	@Array({51}) 
	@Field(14) 
	public Pointer<Byte > IdentifiedCardNo() {
		return this.io.getPointerField(this, 14);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCustTypeType
	 */
	@Field(15) 
	public byte CustType() {
		return this.io.getByteField(this, 15);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCustTypeType
	 */
	@Field(15) 
	public CThostFtdcReqQueryAccountField CustType(byte CustType) {
		this.io.setByteField(this, 15, CustType);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankAccountType
	 */
	@Array({41}) 
	@Field(16) 
	public Pointer<Byte > BankAccount() {
		return this.io.getPointerField(this, 16);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPasswordType
	 */
	@Array({41}) 
	@Field(17) 
	public Pointer<Byte > BankPassWord() {
		return this.io.getPointerField(this, 17);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcAccountIDType
	 */
	@Array({13}) 
	@Field(18) 
	public Pointer<Byte > AccountID() {
		return this.io.getPointerField(this, 18);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPasswordType
	 */
	@Array({41}) 
	@Field(19) 
	public Pointer<Byte > Password() {
		return this.io.getPointerField(this, 19);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcFutureSerialType
	 */
	@Field(20) 
	public int FutureSerial() {
		return this.io.getIntField(this, 20);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcFutureSerialType
	 */
	@Field(20) 
	public CThostFtdcReqQueryAccountField FutureSerial(int FutureSerial) {
		this.io.setIntField(this, 20, FutureSerial);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(21) 
	public int InstallID() {
		return this.io.getIntField(this, 21);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(21) 
	public CThostFtdcReqQueryAccountField InstallID(int InstallID) {
		this.io.setIntField(this, 21, InstallID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(22) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 22);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcYesNoIndicatorType
	 */
	@Field(23) 
	public byte VerifyCertNoFlag() {
		return this.io.getByteField(this, 23);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcYesNoIndicatorType
	 */
	@Field(23) 
	public CThostFtdcReqQueryAccountField VerifyCertNoFlag(byte VerifyCertNoFlag) {
		this.io.setByteField(this, 23, VerifyCertNoFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	@Array({4}) 
	@Field(24) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 24);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDigestType
	 */
	@Array({36}) 
	@Field(25) 
	public Pointer<Byte > Digest() {
		return this.io.getPointerField(this, 25);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankAccTypeType
	 */
	@Field(26) 
	public byte BankAccType() {
		return this.io.getByteField(this, 26);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankAccTypeType
	 */
	@Field(26) 
	public CThostFtdcReqQueryAccountField BankAccType(byte BankAccType) {
		this.io.setByteField(this, 26, BankAccType);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDeviceIDType
	 */
	@Array({3}) 
	@Field(27) 
	public Pointer<Byte > DeviceID() {
		return this.io.getPointerField(this, 27);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankAccTypeType
	 */
	@Field(28) 
	public byte BankSecuAccType() {
		return this.io.getByteField(this, 28);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankAccTypeType
	 */
	@Field(28) 
	public CThostFtdcReqQueryAccountField BankSecuAccType(byte BankSecuAccType) {
		this.io.setByteField(this, 28, BankSecuAccType);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankCodingForFutureType
	 */
	@Array({33}) 
	@Field(29) 
	public Pointer<Byte > BrokerIDByBank() {
		return this.io.getPointerField(this, 29);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankAccountType
	 */
	@Array({41}) 
	@Field(30) 
	public Pointer<Byte > BankSecuAcc() {
		return this.io.getPointerField(this, 30);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPwdFlagType
	 */
	@Field(31) 
	public byte BankPwdFlag() {
		return this.io.getByteField(this, 31);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPwdFlagType
	 */
	@Field(31) 
	public CThostFtdcReqQueryAccountField BankPwdFlag(byte BankPwdFlag) {
		this.io.setByteField(this, 31, BankPwdFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPwdFlagType
	 */
	@Field(32) 
	public byte SecuPwdFlag() {
		return this.io.getByteField(this, 32);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPwdFlagType
	 */
	@Field(32) 
	public CThostFtdcReqQueryAccountField SecuPwdFlag(byte SecuPwdFlag) {
		this.io.setByteField(this, 32, SecuPwdFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOperNoType
	 */
	@Array({17}) 
	@Field(33) 
	public Pointer<Byte > OperNo() {
		return this.io.getPointerField(this, 33);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(34) 
	public int RequestID() {
		return this.io.getIntField(this, 34);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(34) 
	public CThostFtdcReqQueryAccountField RequestID(int RequestID) {
		this.io.setIntField(this, 34, RequestID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffdID<br>
	 * C type : TThostFtdcTIDType
	 */
	@Field(35) 
	public int TID() {
		return this.io.getIntField(this, 35);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffdID<br>
	 * C type : TThostFtdcTIDType
	 */
	@Field(35) 
	public CThostFtdcReqQueryAccountField TID(int TID) {
		this.io.setIntField(this, 35, TID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcLongIndividualNameType
	 */
	@Array({161}) 
	@Field(36) 
	public Pointer<Byte > LongCustomerName() {
		return this.io.getPointerField(this, 36);
	}
	public CThostFtdcReqQueryAccountField() {
		super();
	}
	public CThostFtdcReqQueryAccountField(Pointer pointer) {
		super(pointer);
	}
}
