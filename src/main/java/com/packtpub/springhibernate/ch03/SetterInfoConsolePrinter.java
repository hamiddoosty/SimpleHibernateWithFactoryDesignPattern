package com.packtpub.springhibernate.ch03;

public class SetterInfoConsolePrinter implements SetterInfoPrinter {
	
	public void print (String methodName, Object oldValue,Object newValue) {
		System.out.println("[Method= " + methodName + 
				"| old Value= " + oldValue + 
				"| New Value="  + newValue + "]");
	}

}
