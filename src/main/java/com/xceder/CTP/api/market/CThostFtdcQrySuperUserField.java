package com.xceder.CTP.api.market;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u67e5\u8be2\u7ba1\u7406\u7528\u6237<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcQrySuperUserField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcUserIDType */
	@Array({16}) 
	@Field(0) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 0);
	}
	public CThostFtdcQrySuperUserField() {
		super();
	}
	public CThostFtdcQrySuperUserField(Pointer pointer) {
		super(pointer);
	}
}
