package com.xceder.CTP.api.market;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u67e5\u8be2\u6307\u5b9a\u6d41\u6c34\u53f7\u7684\u4ea4\u6613\u7ed3\u679c\u8bf7\u6c42<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcReqQueryTradeResultBySerialField extends StructObject {
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
	public CThostFtdcReqQueryTradeResultBySerialField PlateSerial(int PlateSerial) {
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
	public CThostFtdcReqQueryTradeResultBySerialField LastFragment(byte LastFragment) {
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
	public CThostFtdcReqQueryTradeResultBySerialField SessionID(int SessionID) {
		this.io.setIntField(this, 11, SessionID);
		return this;
	}
	/** C type : TThostFtdcSerialType */
	@Field(12) 
	public int Reference() {
		return this.io.getIntField(this, 12);
	}
	/** C type : TThostFtdcSerialType */
	@Field(12) 
	public CThostFtdcReqQueryTradeResultBySerialField Reference(int Reference) {
		this.io.setIntField(this, 12, Reference);
		return this;
	}
	/** C type : TThostFtdcInstitutionTypeType */
	@Field(13) 
	public byte RefrenceIssureType() {
		return this.io.getByteField(this, 13);
	}
	/** C type : TThostFtdcInstitutionTypeType */
	@Field(13) 
	public CThostFtdcReqQueryTradeResultBySerialField RefrenceIssureType(byte RefrenceIssureType) {
		this.io.setByteField(this, 13, RefrenceIssureType);
		return this;
	}
	/** C type : TThostFtdcOrganCodeType */
	@Array({36}) 
	@Field(14) 
	public Pointer<Byte > RefrenceIssure() {
		return this.io.getPointerField(this, 14);
	}
	/** C type : TThostFtdcIndividualNameType */
	@Array({51}) 
	@Field(15) 
	public Pointer<Byte > CustomerName() {
		return this.io.getPointerField(this, 15);
	}
	/** C type : TThostFtdcIdCardTypeType */
	@Field(16) 
	public byte IdCardType() {
		return this.io.getByteField(this, 16);
	}
	/** C type : TThostFtdcIdCardTypeType */
	@Field(16) 
	public CThostFtdcReqQueryTradeResultBySerialField IdCardType(byte IdCardType) {
		this.io.setByteField(this, 16, IdCardType);
		return this;
	}
	/** C type : TThostFtdcIdentifiedCardNoType */
	@Array({51}) 
	@Field(17) 
	public Pointer<Byte > IdentifiedCardNo() {
		return this.io.getPointerField(this, 17);
	}
	/** C type : TThostFtdcCustTypeType */
	@Field(18) 
	public byte CustType() {
		return this.io.getByteField(this, 18);
	}
	/** C type : TThostFtdcCustTypeType */
	@Field(18) 
	public CThostFtdcReqQueryTradeResultBySerialField CustType(byte CustType) {
		this.io.setByteField(this, 18, CustType);
		return this;
	}
	/** C type : TThostFtdcBankAccountType */
	@Array({41}) 
	@Field(19) 
	public Pointer<Byte > BankAccount() {
		return this.io.getPointerField(this, 19);
	}
	/** C type : TThostFtdcPasswordType */
	@Array({41}) 
	@Field(20) 
	public Pointer<Byte > BankPassWord() {
		return this.io.getPointerField(this, 20);
	}
	/** C type : TThostFtdcAccountIDType */
	@Array({13}) 
	@Field(21) 
	public Pointer<Byte > AccountID() {
		return this.io.getPointerField(this, 21);
	}
	/** C type : TThostFtdcPasswordType */
	@Array({41}) 
	@Field(22) 
	public Pointer<Byte > Password() {
		return this.io.getPointerField(this, 22);
	}
	/** C type : TThostFtdcCurrencyIDType */
	@Array({4}) 
	@Field(23) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 23);
	}
	/** C type : TThostFtdcTradeAmountType */
	@Field(24) 
	public double TradeAmount() {
		return this.io.getDoubleField(this, 24);
	}
	/** C type : TThostFtdcTradeAmountType */
	@Field(24) 
	public CThostFtdcReqQueryTradeResultBySerialField TradeAmount(double TradeAmount) {
		this.io.setDoubleField(this, 24, TradeAmount);
		return this;
	}
	/** C type : TThostFtdcDigestType */
	@Array({36}) 
	@Field(25) 
	public Pointer<Byte > Digest() {
		return this.io.getPointerField(this, 25);
	}
	public CThostFtdcReqQueryTradeResultBySerialField() {
		super();
	}
	public CThostFtdcReqQueryTradeResultBySerialField(Pointer pointer) {
		super(pointer);
	}
}
