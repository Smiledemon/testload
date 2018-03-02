package com.xceder.CTP.api.trade;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u51b2\u6b63\u54cd\u5e94<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thosttraderapi") 
public class CThostFtdcRspRepealField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcRepealTimeIntervalType */
	@Field(0) 
	public int RepealTimeInterval() {
		return this.io.getIntField(this, 0);
	}
	/** C type : TThostFtdcRepealTimeIntervalType */
	@Field(0) 
	public CThostFtdcRspRepealField RepealTimeInterval(int RepealTimeInterval) {
		this.io.setIntField(this, 0, RepealTimeInterval);
		return this;
	}
	/** C type : TThostFtdcRepealedTimesType */
	@Field(1) 
	public int RepealedTimes() {
		return this.io.getIntField(this, 1);
	}
	/** C type : TThostFtdcRepealedTimesType */
	@Field(1) 
	public CThostFtdcRspRepealField RepealedTimes(int RepealedTimes) {
		this.io.setIntField(this, 1, RepealedTimes);
		return this;
	}
	/** C type : TThostFtdcBankRepealFlagType */
	@Field(2) 
	public byte BankRepealFlag() {
		return this.io.getByteField(this, 2);
	}
	/** C type : TThostFtdcBankRepealFlagType */
	@Field(2) 
	public CThostFtdcRspRepealField BankRepealFlag(byte BankRepealFlag) {
		this.io.setByteField(this, 2, BankRepealFlag);
		return this;
	}
	/** C type : TThostFtdcBrokerRepealFlagType */
	@Field(3) 
	public byte BrokerRepealFlag() {
		return this.io.getByteField(this, 3);
	}
	/** C type : TThostFtdcBrokerRepealFlagType */
	@Field(3) 
	public CThostFtdcRspRepealField BrokerRepealFlag(byte BrokerRepealFlag) {
		this.io.setByteField(this, 3, BrokerRepealFlag);
		return this;
	}
	/** C type : TThostFtdcPlateSerialType */
	@Field(4) 
	public int PlateRepealSerial() {
		return this.io.getIntField(this, 4);
	}
	/** C type : TThostFtdcPlateSerialType */
	@Field(4) 
	public CThostFtdcRspRepealField PlateRepealSerial(int PlateRepealSerial) {
		this.io.setIntField(this, 4, PlateRepealSerial);
		return this;
	}
	/** C type : TThostFtdcBankSerialType */
	@Array({13}) 
	@Field(5) 
	public Pointer<Byte > BankRepealSerial() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : TThostFtdcFutureSerialType */
	@Field(6) 
	public int FutureRepealSerial() {
		return this.io.getIntField(this, 6);
	}
	/** C type : TThostFtdcFutureSerialType */
	@Field(6) 
	public CThostFtdcRspRepealField FutureRepealSerial(int FutureRepealSerial) {
		this.io.setIntField(this, 6, FutureRepealSerial);
		return this;
	}
	/** C type : TThostFtdcTradeCodeType */
	@Array({7}) 
	@Field(7) 
	public Pointer<Byte > TradeCode() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : TThostFtdcBankIDType */
	@Array({4}) 
	@Field(8) 
	public Pointer<Byte > BankID() {
		return this.io.getPointerField(this, 8);
	}
	/** C type : TThostFtdcBankBrchIDType */
	@Array({5}) 
	@Field(9) 
	public Pointer<Byte > BankBranchID() {
		return this.io.getPointerField(this, 9);
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(10) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 10);
	}
	/** C type : TThostFtdcFutureBranchIDType */
	@Array({31}) 
	@Field(11) 
	public Pointer<Byte > BrokerBranchID() {
		return this.io.getPointerField(this, 11);
	}
	/** C type : TThostFtdcTradeDateType */
	@Array({9}) 
	@Field(12) 
	public Pointer<Byte > TradeDate() {
		return this.io.getPointerField(this, 12);
	}
	/** C type : TThostFtdcTradeTimeType */
	@Array({9}) 
	@Field(13) 
	public Pointer<Byte > TradeTime() {
		return this.io.getPointerField(this, 13);
	}
	/** C type : TThostFtdcBankSerialType */
	@Array({13}) 
	@Field(14) 
	public Pointer<Byte > BankSerial() {
		return this.io.getPointerField(this, 14);
	}
	/** C type : TThostFtdcTradeDateType */
	@Array({9}) 
	@Field(15) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 15);
	}
	/** C type : TThostFtdcSerialType */
	@Field(16) 
	public int PlateSerial() {
		return this.io.getIntField(this, 16);
	}
	/** C type : TThostFtdcSerialType */
	@Field(16) 
	public CThostFtdcRspRepealField PlateSerial(int PlateSerial) {
		this.io.setIntField(this, 16, PlateSerial);
		return this;
	}
	/** C type : TThostFtdcLastFragmentType */
	@Field(17) 
	public byte LastFragment() {
		return this.io.getByteField(this, 17);
	}
	/** C type : TThostFtdcLastFragmentType */
	@Field(17) 
	public CThostFtdcRspRepealField LastFragment(byte LastFragment) {
		this.io.setByteField(this, 17, LastFragment);
		return this;
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(18) 
	public int SessionID() {
		return this.io.getIntField(this, 18);
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(18) 
	public CThostFtdcRspRepealField SessionID(int SessionID) {
		this.io.setIntField(this, 18, SessionID);
		return this;
	}
	/** C type : TThostFtdcIndividualNameType */
	@Array({51}) 
	@Field(19) 
	public Pointer<Byte > CustomerName() {
		return this.io.getPointerField(this, 19);
	}
	/** C type : TThostFtdcIdCardTypeType */
	@Field(20) 
	public byte IdCardType() {
		return this.io.getByteField(this, 20);
	}
	/** C type : TThostFtdcIdCardTypeType */
	@Field(20) 
	public CThostFtdcRspRepealField IdCardType(byte IdCardType) {
		this.io.setByteField(this, 20, IdCardType);
		return this;
	}
	/** C type : TThostFtdcIdentifiedCardNoType */
	@Array({51}) 
	@Field(21) 
	public Pointer<Byte > IdentifiedCardNo() {
		return this.io.getPointerField(this, 21);
	}
	/** C type : TThostFtdcCustTypeType */
	@Field(22) 
	public byte CustType() {
		return this.io.getByteField(this, 22);
	}
	/** C type : TThostFtdcCustTypeType */
	@Field(22) 
	public CThostFtdcRspRepealField CustType(byte CustType) {
		this.io.setByteField(this, 22, CustType);
		return this;
	}
	/** C type : TThostFtdcBankAccountType */
	@Array({41}) 
	@Field(23) 
	public Pointer<Byte > BankAccount() {
		return this.io.getPointerField(this, 23);
	}
	/** C type : TThostFtdcPasswordType */
	@Array({41}) 
	@Field(24) 
	public Pointer<Byte > BankPassWord() {
		return this.io.getPointerField(this, 24);
	}
	/** C type : TThostFtdcAccountIDType */
	@Array({13}) 
	@Field(25) 
	public Pointer<Byte > AccountID() {
		return this.io.getPointerField(this, 25);
	}
	/** C type : TThostFtdcPasswordType */
	@Array({41}) 
	@Field(26) 
	public Pointer<Byte > Password() {
		return this.io.getPointerField(this, 26);
	}
	/** C type : TThostFtdcInstallIDType */
	@Field(27) 
	public int InstallID() {
		return this.io.getIntField(this, 27);
	}
	/** C type : TThostFtdcInstallIDType */
	@Field(27) 
	public CThostFtdcRspRepealField InstallID(int InstallID) {
		this.io.setIntField(this, 27, InstallID);
		return this;
	}
	/** C type : TThostFtdcFutureSerialType */
	@Field(28) 
	public int FutureSerial() {
		return this.io.getIntField(this, 28);
	}
	/** C type : TThostFtdcFutureSerialType */
	@Field(28) 
	public CThostFtdcRspRepealField FutureSerial(int FutureSerial) {
		this.io.setIntField(this, 28, FutureSerial);
		return this;
	}
	/** C type : TThostFtdcUserIDType */
	@Array({16}) 
	@Field(29) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 29);
	}
	/** C type : TThostFtdcYesNoIndicatorType */
	@Field(30) 
	public byte VerifyCertNoFlag() {
		return this.io.getByteField(this, 30);
	}
	/** C type : TThostFtdcYesNoIndicatorType */
	@Field(30) 
	public CThostFtdcRspRepealField VerifyCertNoFlag(byte VerifyCertNoFlag) {
		this.io.setByteField(this, 30, VerifyCertNoFlag);
		return this;
	}
	/** C type : TThostFtdcCurrencyIDType */
	@Array({4}) 
	@Field(31) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 31);
	}
	/** C type : TThostFtdcTradeAmountType */
	@Field(32) 
	public double TradeAmount() {
		return this.io.getDoubleField(this, 32);
	}
	/** C type : TThostFtdcTradeAmountType */
	@Field(32) 
	public CThostFtdcRspRepealField TradeAmount(double TradeAmount) {
		this.io.setDoubleField(this, 32, TradeAmount);
		return this;
	}
	/** C type : TThostFtdcTradeAmountType */
	@Field(33) 
	public double FutureFetchAmount() {
		return this.io.getDoubleField(this, 33);
	}
	/** C type : TThostFtdcTradeAmountType */
	@Field(33) 
	public CThostFtdcRspRepealField FutureFetchAmount(double FutureFetchAmount) {
		this.io.setDoubleField(this, 33, FutureFetchAmount);
		return this;
	}
	/** C type : TThostFtdcFeePayFlagType */
	@Field(34) 
	public byte FeePayFlag() {
		return this.io.getByteField(this, 34);
	}
	/** C type : TThostFtdcFeePayFlagType */
	@Field(34) 
	public CThostFtdcRspRepealField FeePayFlag(byte FeePayFlag) {
		this.io.setByteField(this, 34, FeePayFlag);
		return this;
	}
	/** C type : TThostFtdcCustFeeType */
	@Field(35) 
	public double CustFee() {
		return this.io.getDoubleField(this, 35);
	}
	/** C type : TThostFtdcCustFeeType */
	@Field(35) 
	public CThostFtdcRspRepealField CustFee(double CustFee) {
		this.io.setDoubleField(this, 35, CustFee);
		return this;
	}
	/** C type : TThostFtdcFutureFeeType */
	@Field(36) 
	public double BrokerFee() {
		return this.io.getDoubleField(this, 36);
	}
	/** C type : TThostFtdcFutureFeeType */
	@Field(36) 
	public CThostFtdcRspRepealField BrokerFee(double BrokerFee) {
		this.io.setDoubleField(this, 36, BrokerFee);
		return this;
	}
	/** C type : TThostFtdcAddInfoType */
	@Array({129}) 
	@Field(37) 
	public Pointer<Byte > Message() {
		return this.io.getPointerField(this, 37);
	}
	/** C type : TThostFtdcDigestType */
	@Array({36}) 
	@Field(38) 
	public Pointer<Byte > Digest() {
		return this.io.getPointerField(this, 38);
	}
	/** C type : TThostFtdcBankAccTypeType */
	@Field(39) 
	public byte BankAccType() {
		return this.io.getByteField(this, 39);
	}
	/** C type : TThostFtdcBankAccTypeType */
	@Field(39) 
	public CThostFtdcRspRepealField BankAccType(byte BankAccType) {
		this.io.setByteField(this, 39, BankAccType);
		return this;
	}
	/** C type : TThostFtdcDeviceIDType */
	@Array({3}) 
	@Field(40) 
	public Pointer<Byte > DeviceID() {
		return this.io.getPointerField(this, 40);
	}
	/** C type : TThostFtdcBankAccTypeType */
	@Field(41) 
	public byte BankSecuAccType() {
		return this.io.getByteField(this, 41);
	}
	/** C type : TThostFtdcBankAccTypeType */
	@Field(41) 
	public CThostFtdcRspRepealField BankSecuAccType(byte BankSecuAccType) {
		this.io.setByteField(this, 41, BankSecuAccType);
		return this;
	}
	/** C type : TThostFtdcBankCodingForFutureType */
	@Array({33}) 
	@Field(42) 
	public Pointer<Byte > BrokerIDByBank() {
		return this.io.getPointerField(this, 42);
	}
	/** C type : TThostFtdcBankAccountType */
	@Array({41}) 
	@Field(43) 
	public Pointer<Byte > BankSecuAcc() {
		return this.io.getPointerField(this, 43);
	}
	/** C type : TThostFtdcPwdFlagType */
	@Field(44) 
	public byte BankPwdFlag() {
		return this.io.getByteField(this, 44);
	}
	/** C type : TThostFtdcPwdFlagType */
	@Field(44) 
	public CThostFtdcRspRepealField BankPwdFlag(byte BankPwdFlag) {
		this.io.setByteField(this, 44, BankPwdFlag);
		return this;
	}
	/** C type : TThostFtdcPwdFlagType */
	@Field(45) 
	public byte SecuPwdFlag() {
		return this.io.getByteField(this, 45);
	}
	/** C type : TThostFtdcPwdFlagType */
	@Field(45) 
	public CThostFtdcRspRepealField SecuPwdFlag(byte SecuPwdFlag) {
		this.io.setByteField(this, 45, SecuPwdFlag);
		return this;
	}
	/** C type : TThostFtdcOperNoType */
	@Array({17}) 
	@Field(46) 
	public Pointer<Byte > OperNo() {
		return this.io.getPointerField(this, 46);
	}
	/** C type : TThostFtdcRequestIDType */
	@Field(47) 
	public int RequestID() {
		return this.io.getIntField(this, 47);
	}
	/** C type : TThostFtdcRequestIDType */
	@Field(47) 
	public CThostFtdcRspRepealField RequestID(int RequestID) {
		this.io.setIntField(this, 47, RequestID);
		return this;
	}
	/** C type : TThostFtdcTIDType */
	@Field(48) 
	public int TID() {
		return this.io.getIntField(this, 48);
	}
	/** C type : TThostFtdcTIDType */
	@Field(48) 
	public CThostFtdcRspRepealField TID(int TID) {
		this.io.setIntField(this, 48, TID);
		return this;
	}
	/** C type : TThostFtdcTransferStatusType */
	@Field(49) 
	public byte TransferStatus() {
		return this.io.getByteField(this, 49);
	}
	/** C type : TThostFtdcTransferStatusType */
	@Field(49) 
	public CThostFtdcRspRepealField TransferStatus(byte TransferStatus) {
		this.io.setByteField(this, 49, TransferStatus);
		return this;
	}
	/** C type : TThostFtdcErrorIDType */
	@Field(50) 
	public int ErrorID() {
		return this.io.getIntField(this, 50);
	}
	/** C type : TThostFtdcErrorIDType */
	@Field(50) 
	public CThostFtdcRspRepealField ErrorID(int ErrorID) {
		this.io.setIntField(this, 50, ErrorID);
		return this;
	}
	/** C type : TThostFtdcErrorMsgType */
	@Array({81}) 
	@Field(51) 
	public Pointer<Byte > ErrorMsg() {
		return this.io.getPointerField(this, 51);
	}
	public CThostFtdcRspRepealField() {
		super();
	}
	public CThostFtdcRspRepealField(Pointer pointer) {
		super(pointer);
	}
}
