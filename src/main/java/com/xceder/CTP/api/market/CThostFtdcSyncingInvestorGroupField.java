package com.xceder.CTP.api.market;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u6b63\u5728\u540c\u6b65\u4e2d\u7684\u6295\u8d44\u8005\u5206\u7ec4<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcSyncingInvestorGroupField extends StructObject {
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
	public Pointer<Byte > InvestorGroupID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcInvestorGroupNameType */
	@Array({41}) 
	@Field(2) 
	public Pointer<Byte > InvestorGroupName() {
		return this.io.getPointerField(this, 2);
	}
	public CThostFtdcSyncingInvestorGroupField() {
		super();
	}
	public CThostFtdcSyncingInvestorGroupField(Pointer pointer) {
		super(pointer);
	}
}
