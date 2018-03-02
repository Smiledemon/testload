package com.xceder.CTP.api.market;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u9a8c\u8bc1\u671f\u8d27\u8d44\u91d1\u5bc6\u7801\u548c\u5ba2\u6237\u4fe1\u606f<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcDepositResultInformField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcDepositSeqNoType */
	@Array({15}) 
	@Field(0) 
	public Pointer<Byte > DepositSeqNo() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(1) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcInvestorIDType */
	@Array({13}) 
	@Field(2) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(3) 
	public double Deposit() {
		return this.io.getDoubleField(this, 3);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(3) 
	public CThostFtdcDepositResultInformField Deposit(double Deposit) {
		this.io.setDoubleField(this, 3, Deposit);
		return this;
	}
	/** C type : TThostFtdcRequestIDType */
	@Field(4) 
	public int RequestID() {
		return this.io.getIntField(this, 4);
	}
	/** C type : TThostFtdcRequestIDType */
	@Field(4) 
	public CThostFtdcDepositResultInformField RequestID(int RequestID) {
		this.io.setIntField(this, 4, RequestID);
		return this;
	}
	/** C type : TThostFtdcReturnCodeType */
	@Array({7}) 
	@Field(5) 
	public Pointer<Byte > ReturnCode() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : TThostFtdcDescrInfoForReturnCodeType */
	@Array({129}) 
	@Field(6) 
	public Pointer<Byte > DescrInfoForReturnCode() {
		return this.io.getPointerField(this, 6);
	}
	public CThostFtdcDepositResultInformField() {
		super();
	}
	public CThostFtdcDepositResultInformField(Pointer pointer) {
		super(pointer);
	}
}
