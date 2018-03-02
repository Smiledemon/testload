package com.xceder.CTP.api.market;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u5f53\u524d\u65f6\u95f4<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcCurrentTimeField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcDateType */
	@Array({9}) 
	@Field(0) 
	public Pointer<Byte > CurrDate() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcTimeType */
	@Array({9}) 
	@Field(1) 
	public Pointer<Byte > CurrTime() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcMillisecType */
	@Field(2) 
	public int CurrMillisec() {
		return this.io.getIntField(this, 2);
	}
	/** C type : TThostFtdcMillisecType */
	@Field(2) 
	public CThostFtdcCurrentTimeField CurrMillisec(int CurrMillisec) {
		this.io.setIntField(this, 2, CurrMillisec);
		return this;
	}
	/** C type : TThostFtdcDateType */
	@Array({9}) 
	@Field(3) 
	public Pointer<Byte > ActionDay() {
		return this.io.getPointerField(this, 3);
	}
	public CThostFtdcCurrentTimeField() {
		super();
	}
	public CThostFtdcCurrentTimeField(Pointer pointer) {
		super(pointer);
	}
}
