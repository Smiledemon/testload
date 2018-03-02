package com.xceder.CTP.api.market;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u67e5\u8be2\u6700\u5927\u62a5\u5355\u6570\u91cf<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcQueryMaxOrderVolumeField extends StructObject {
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
	/** C type : TThostFtdcDirectionType */
	@Field(3) 
	public byte Direction() {
		return this.io.getByteField(this, 3);
	}
	/** C type : TThostFtdcDirectionType */
	@Field(3) 
	public CThostFtdcQueryMaxOrderVolumeField Direction(byte Direction) {
		this.io.setByteField(this, 3, Direction);
		return this;
	}
	/** C type : TThostFtdcOffsetFlagType */
	@Field(4) 
	public byte OffsetFlag() {
		return this.io.getByteField(this, 4);
	}
	/** C type : TThostFtdcOffsetFlagType */
	@Field(4) 
	public CThostFtdcQueryMaxOrderVolumeField OffsetFlag(byte OffsetFlag) {
		this.io.setByteField(this, 4, OffsetFlag);
		return this;
	}
	/** C type : TThostFtdcHedgeFlagType */
	@Field(5) 
	public byte HedgeFlag() {
		return this.io.getByteField(this, 5);
	}
	/** C type : TThostFtdcHedgeFlagType */
	@Field(5) 
	public CThostFtdcQueryMaxOrderVolumeField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 5, HedgeFlag);
		return this;
	}
	/** C type : TThostFtdcVolumeType */
	@Field(6) 
	public int MaxVolume() {
		return this.io.getIntField(this, 6);
	}
	/** C type : TThostFtdcVolumeType */
	@Field(6) 
	public CThostFtdcQueryMaxOrderVolumeField MaxVolume(int MaxVolume) {
		this.io.setIntField(this, 6, MaxVolume);
		return this;
	}
	public CThostFtdcQueryMaxOrderVolumeField() {
		super();
	}
	public CThostFtdcQueryMaxOrderVolumeField(Pointer pointer) {
		super(pointer);
	}
}
