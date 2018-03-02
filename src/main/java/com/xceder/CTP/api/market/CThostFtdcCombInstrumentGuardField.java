package com.xceder.CTP.api.market;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u7ec4\u5408\u5408\u7ea6\u5b89\u5168\u7cfb\u6570<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcCombInstrumentGuardField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcInstrumentIDType */
	@Array({31}) 
	@Field(1) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcRatioType */
	@Field(2) 
	public double GuarantRatio() {
		return this.io.getDoubleField(this, 2);
	}
	/** C type : TThostFtdcRatioType */
	@Field(2) 
	public CThostFtdcCombInstrumentGuardField GuarantRatio(double GuarantRatio) {
		this.io.setDoubleField(this, 2, GuarantRatio);
		return this;
	}
	public CThostFtdcCombInstrumentGuardField() {
		super();
	}
	public CThostFtdcCombInstrumentGuardField(Pointer pointer) {
		super(pointer);
	}
}
