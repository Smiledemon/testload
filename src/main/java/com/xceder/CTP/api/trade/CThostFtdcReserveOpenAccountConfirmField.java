package com.xceder.CTP.api.trade;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u94f6\u671f\u9884\u7ea6\u5f00\u6237\u786e\u8ba4\u8bf7\u6c42<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thosttraderapi") 
public class CThostFtdcReserveOpenAccountConfirmField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcTradeCodeType */
	@Array({7}) 
	@Field(0) 
	public Pointer<Byte > TradeCode() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcBankIDType */
	@Array({4}) 
	@Field(1) 
	public Pointer<Byte > BankID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcBankBrchIDType */
	@Array({5}) 
	@Field(2) 
	public Pointer<Byte > BankBranchID() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(3) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcFutureBranchIDType */
	@Array({31}) 
	@Field(4) 
	public Pointer<Byte > BrokerBranchID() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : TThostFtdcTradeDateType */
	@Array({9}) 
	@Field(5) 
	public Pointer<Byte > TradeDate() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : TThostFtdcTradeTimeType */
	@Array({9}) 
	@Field(6) 
	public Pointer<Byte > TradeTime() {
		return this.io.getPointerField(this, 6);
	}
	/** C type : TThostFtdcBankSerialType */
	@Array({13}) 
	@Field(7) 
	public Pointer<Byte > BankSerial() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : TThostFtdcTradeDateType */
	@Array({9}) 
	@Field(8) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 8);
	}
	/** C type : TThostFtdcSerialType */
	@Field(9) 
	public int PlateSerial() {
		return this.io.getIntField(this, 9);
	}
	/** C type : TThostFtdcSerialType */
	@Field(9) 
	public CThostFtdcReserveOpenAccountConfirmField PlateSerial(int PlateSerial) {
		this.io.setIntField(this, 9, PlateSerial);
		return this;
	}
	/** C type : TThostFtdcLastFragmentType */
	@Field(10) 
	public byte LastFragment() {
		return this.io.getByteField(this, 10);
	}
	/** C type : TThostFtdcLastFragmentType */
	@Field(10) 
	public CThostFtdcReserveOpenAccountConfirmField LastFragment(byte LastFragment) {
		this.io.setByteField(this, 10, LastFragment);
		return this;
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(11) 
	public int SessionID() {
		return this.io.getIntField(this, 11);
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(11) 
	public CThostFtdcReserveOpenAccountConfirmField SessionID(int SessionID) {
		this.io.setIntField(this, 11, SessionID);
		return this;
	}
	/** C type : TThostFtdcIndividualNameType */
	@Array({51}) 
	@Field(12) 
	public Pointer<Byte > CustomerName() {
		return this.io.getPointerField(this, 12);
	}
	/** C type : TThostFtdcIdCardTypeType */
	@Field(13) 
	public byte IdCardType() {
		return this.io.getByteField(this, 13);
	}
	/** C type : TThostFtdcIdCardTypeType */
	@Field(13) 
	public CThostFtdcReserveOpenAccountConfirmField IdCardType(byte IdCardType) {
		this.io.setByteField(this, 13, IdCardType);
		return this;
	}
	/** C type : TThostFtdcIdentifiedCardNoType */
	@Array({51}) 
	@Field(14) 
	public Pointer<Byte > IdentifiedCardNo() {
		return this.io.getPointerField(this, 14);
	}
	/** C type : TThostFtdcGenderType */
	@Field(15) 
	public byte Gender() {
		return this.io.getByteField(this, 15);
	}
	/** C type : TThostFtdcGenderType */
	@Field(15) 
	public CThostFtdcReserveOpenAccountConfirmField Gender(byte Gender) {
		this.io.setByteField(this, 15, Gender);
		return this;
	}
	/** C type : TThostFtdcCountryCodeType */
	@Array({21}) 
	@Field(16) 
	public Pointer<Byte > CountryCode() {
		return this.io.getPointerField(this, 16);
	}
	/** C type : TThostFtdcCustTypeType */
	@Field(17) 
	public byte CustType() {
		return this.io.getByteField(this, 17);
	}
	/** C type : TThostFtdcCustTypeType */
	@Field(17) 
	public CThostFtdcReserveOpenAccountConfirmField CustType(byte CustType) {
		this.io.setByteField(this, 17, CustType);
		return this;
	}
	/** C type : TThostFtdcAddressType */
	@Array({101}) 
	@Field(18) 
	public Pointer<Byte > Address() {
		return this.io.getPointerField(this, 18);
	}
	/** C type : TThostFtdcZipCodeType */
	@Array({7}) 
	@Field(19) 
	public Pointer<Byte > ZipCode() {
		return this.io.getPointerField(this, 19);
	}
	/** C type : TThostFtdcTelephoneType */
	@Array({41}) 
	@Field(20) 
	public Pointer<Byte > Telephone() {
		return this.io.getPointerField(this, 20);
	}
	/** C type : TThostFtdcMobilePhoneType */
	@Array({21}) 
	@Field(21) 
	public Pointer<Byte > MobilePhone() {
		return this.io.getPointerField(this, 21);
	}
	/** C type : TThostFtdcFaxType */
	@Array({41}) 
	@Field(22) 
	public Pointer<Byte > Fax() {
		return this.io.getPointerField(this, 22);
	}
	/** C type : TThostFtdcEMailType */
	@Array({41}) 
	@Field(23) 
	public Pointer<Byte > EMail() {
		return this.io.getPointerField(this, 23);
	}
	/** C type : TThostFtdcMoneyAccountStatusType */
	@Field(24) 
	public byte MoneyAccountStatus() {
		return this.io.getByteField(this, 24);
	}
	/** C type : TThostFtdcMoneyAccountStatusType */
	@Field(24) 
	public CThostFtdcReserveOpenAccountConfirmField MoneyAccountStatus(byte MoneyAccountStatus) {
		this.io.setByteField(this, 24, MoneyAccountStatus);
		return this;
	}
	/** C type : TThostFtdcBankAccountType */
	@Array({41}) 
	@Field(25) 
	public Pointer<Byte > BankAccount() {
		return this.io.getPointerField(this, 25);
	}
	/** C type : TThostFtdcPasswordType */
	@Array({41}) 
	@Field(26) 
	public Pointer<Byte > BankPassWord() {
		return this.io.getPointerField(this, 26);
	}
	/** C type : TThostFtdcInstallIDType */
	@Field(27) 
	public int InstallID() {
		return this.io.getIntField(this, 27);
	}
	/** C type : TThostFtdcInstallIDType */
	@Field(27) 
	public CThostFtdcReserveOpenAccountConfirmField InstallID(int InstallID) {
		this.io.setIntField(this, 27, InstallID);
		return this;
	}
	/** C type : TThostFtdcYesNoIndicatorType */
	@Field(28) 
	public byte VerifyCertNoFlag() {
		return this.io.getByteField(this, 28);
	}
	/** C type : TThostFtdcYesNoIndicatorType */
	@Field(28) 
	public CThostFtdcReserveOpenAccountConfirmField VerifyCertNoFlag(byte VerifyCertNoFlag) {
		this.io.setByteField(this, 28, VerifyCertNoFlag);
		return this;
	}
	/** C type : TThostFtdcCurrencyIDType */
	@Array({4}) 
	@Field(29) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 29);
	}
	/** C type : TThostFtdcDigestType */
	@Array({36}) 
	@Field(30) 
	public Pointer<Byte > Digest() {
		return this.io.getPointerField(this, 30);
	}
	/** C type : TThostFtdcBankAccTypeType */
	@Field(31) 
	public byte BankAccType() {
		return this.io.getByteField(this, 31);
	}
	/** C type : TThostFtdcBankAccTypeType */
	@Field(31) 
	public CThostFtdcReserveOpenAccountConfirmField BankAccType(byte BankAccType) {
		this.io.setByteField(this, 31, BankAccType);
		return this;
	}
	/** C type : TThostFtdcBankCodingForFutureType */
	@Array({33}) 
	@Field(32) 
	public Pointer<Byte > BrokerIDByBank() {
		return this.io.getPointerField(this, 32);
	}
	/** C type : TThostFtdcTIDType */
	@Field(33) 
	public int TID() {
		return this.io.getIntField(this, 33);
	}
	/** C type : TThostFtdcTIDType */
	@Field(33) 
	public CThostFtdcReserveOpenAccountConfirmField TID(int TID) {
		this.io.setIntField(this, 33, TID);
		return this;
	}
	/** C type : TThostFtdcAccountIDType */
	@Array({13}) 
	@Field(34) 
	public Pointer<Byte > AccountID() {
		return this.io.getPointerField(this, 34);
	}
	/** C type : TThostFtdcPasswordType */
	@Array({41}) 
	@Field(35) 
	public Pointer<Byte > Password() {
		return this.io.getPointerField(this, 35);
	}
	/** C type : TThostFtdcBankSerialType */
	@Array({13}) 
	@Field(36) 
	public Pointer<Byte > BankReserveOpenSeq() {
		return this.io.getPointerField(this, 36);
	}
	/** C type : TThostFtdcTradeDateType */
	@Array({9}) 
	@Field(37) 
	public Pointer<Byte > BookDate() {
		return this.io.getPointerField(this, 37);
	}
	/** C type : TThostFtdcPasswordType */
	@Array({41}) 
	@Field(38) 
	public Pointer<Byte > BookPsw() {
		return this.io.getPointerField(this, 38);
	}
	/** C type : TThostFtdcErrorIDType */
	@Field(39) 
	public int ErrorID() {
		return this.io.getIntField(this, 39);
	}
	/** C type : TThostFtdcErrorIDType */
	@Field(39) 
	public CThostFtdcReserveOpenAccountConfirmField ErrorID(int ErrorID) {
		this.io.setIntField(this, 39, ErrorID);
		return this;
	}
	/** C type : TThostFtdcErrorMsgType */
	@Array({81}) 
	@Field(40) 
	public Pointer<Byte > ErrorMsg() {
		return this.io.getPointerField(this, 40);
	}
	public CThostFtdcReserveOpenAccountConfirmField() {
		super();
	}
	public CThostFtdcReserveOpenAccountConfirmField(Pointer pointer) {
		super(pointer);
	}
}
