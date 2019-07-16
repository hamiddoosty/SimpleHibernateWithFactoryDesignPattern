package com.packtpub.springhibernate.ch03;

public class SetterInfoDBPrinter implements SetterInfoPrinter{
	
	public void print(String methodName, Object oldValue,Object newValue){
		
		System.out.println("From DB   ... ");
	}

}
