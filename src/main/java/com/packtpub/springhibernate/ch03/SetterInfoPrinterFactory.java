package com.packtpub.springhibernate.ch03;

public class SetterInfoPrinterFactory {
	
	public static SetterInfoPrinter getSetterInfoPrinter(){
		return new SetterInfoConsolePrinter();
	}

}
