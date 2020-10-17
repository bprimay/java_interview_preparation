package com.bps;

public class ExampleOne {

	public static void main(String[] args) {
		
		Demo d = new Demo();
		
		// this line gives The method displayMethod(Object) is ambiguous 
		//for the type Demo
		//d.displayMethod(null); 
		
		Object n = null;
		//Object block print
		d.displayMethod(n);
		
		//String block print
		d.displayMethod((String)n); 
		//Inetger block will print
		d.displayMethod((Integer)n); 
	}

	
	
}
