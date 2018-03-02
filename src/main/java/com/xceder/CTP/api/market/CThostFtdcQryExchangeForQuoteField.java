package com.xceder.CTP.api.market;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u4ea4\u6613\u6240\u8be2\u4ef7\u67e5\u8be2<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcQryExchangeForQuoteField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcParticipantIDType */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcClientIDType */
	@Array({11}) 
	@Field(1) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcExchangeInstIDType */
	@Array({31}) 
	@Field(2) 
	public Pointer<Byte > ExchangeInstID() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcExchangeIDType */
	@Array({9}) 
	@Field(3) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcTraderIDType */
	@Array({21}) 
	@Field(4) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 4);
	}
	public CThostFtdcQryExchangeForQuoteField() {
		super();
	}
	public CThostFtdcQryExchangeForQuoteField(Pointer pointer) {
		super(pointer);
	}
}
