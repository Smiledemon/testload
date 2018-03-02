package com.xceder.CTP.api.trade;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u7ecf\u7eaa\u516c\u53f8\u53ef\u63d0\u8d44\u91d1\u7b97\u6cd5\u8868<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thosttraderapi") 
public class CThostFtdcBrokerWithdrawAlgorithmField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcAlgorithmType */
	@Field(1) 
	public byte WithdrawAlgorithm() {
		return this.io.getByteField(this, 1);
	}
	/** C type : TThostFtdcAlgorithmType */
	@Field(1) 
	public CThostFtdcBrokerWithdrawAlgorithmField WithdrawAlgorithm(byte WithdrawAlgorithm) {
		this.io.setByteField(this, 1, WithdrawAlgorithm);
		return this;
	}
	/** C type : TThostFtdcRatioType */
	@Field(2) 
	public double UsingRatio() {
		return this.io.getDoubleField(this, 2);
	}
	/** C type : TThostFtdcRatioType */
	@Field(2) 
	public CThostFtdcBrokerWithdrawAlgorithmField UsingRatio(double UsingRatio) {
		this.io.setDoubleField(this, 2, UsingRatio);
		return this;
	}
	/** C type : TThostFtdcIncludeCloseProfitType */
	@Field(3) 
	public byte IncludeCloseProfit() {
		return this.io.getByteField(this, 3);
	}
	/** C type : TThostFtdcIncludeCloseProfitType */
	@Field(3) 
	public CThostFtdcBrokerWithdrawAlgorithmField IncludeCloseProfit(byte IncludeCloseProfit) {
		this.io.setByteField(this, 3, IncludeCloseProfit);
		return this;
	}
	/** C type : TThostFtdcAllWithoutTradeType */
	@Field(4) 
	public byte AllWithoutTrade() {
		return this.io.getByteField(this, 4);
	}
	/** C type : TThostFtdcAllWithoutTradeType */
	@Field(4) 
	public CThostFtdcBrokerWithdrawAlgorithmField AllWithoutTrade(byte AllWithoutTrade) {
		this.io.setByteField(this, 4, AllWithoutTrade);
		return this;
	}
	/** C type : TThostFtdcIncludeCloseProfitType */
	@Field(5) 
	public byte AvailIncludeCloseProfit() {
		return this.io.getByteField(this, 5);
	}
	/** C type : TThostFtdcIncludeCloseProfitType */
	@Field(5) 
	public CThostFtdcBrokerWithdrawAlgorithmField AvailIncludeCloseProfit(byte AvailIncludeCloseProfit) {
		this.io.setByteField(this, 5, AvailIncludeCloseProfit);
		return this;
	}
	/** C type : TThostFtdcBoolType */
	@Field(6) 
	public int IsBrokerUserEvent() {
		return this.io.getIntField(this, 6);
	}
	/** C type : TThostFtdcBoolType */
	@Field(6) 
	public CThostFtdcBrokerWithdrawAlgorithmField IsBrokerUserEvent(int IsBrokerUserEvent) {
		this.io.setIntField(this, 6, IsBrokerUserEvent);
		return this;
	}
	/** C type : TThostFtdcCurrencyIDType */
	@Array({4}) 
	@Field(7) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : TThostFtdcRatioType */
	@Field(8) 
	public double FundMortgageRatio() {
		return this.io.getDoubleField(this, 8);
	}
	/** C type : TThostFtdcRatioType */
	@Field(8) 
	public CThostFtdcBrokerWithdrawAlgorithmField FundMortgageRatio(double FundMortgageRatio) {
		this.io.setDoubleField(this, 8, FundMortgageRatio);
		return this;
	}
	/** C type : TThostFtdcBalanceAlgorithmType */
	@Field(9) 
	public byte BalanceAlgorithm() {
		return this.io.getByteField(this, 9);
	}
	/** C type : TThostFtdcBalanceAlgorithmType */
	@Field(9) 
	public CThostFtdcBrokerWithdrawAlgorithmField BalanceAlgorithm(byte BalanceAlgorithm) {
		this.io.setByteField(this, 9, BalanceAlgorithm);
		return this;
	}
	public CThostFtdcBrokerWithdrawAlgorithmField() {
		super();
	}
	public CThostFtdcBrokerWithdrawAlgorithmField(Pointer pointer) {
		super(pointer);
	}
}
