package com.raystech.exception;

public class Test2 {
public static void main(String[] args) {
	try{String c="akshay";

	try {String d = "akshayjadon";	
			System.out.println(d.charAt(12));
			System.out.println(c.charAt(7));
	}catch( Exception e) {
		    System.out.println("7 number khali hai");
		    System.out.println("12 number khali hai");
	}finally {
		    System.out.println("finally");}
	}
	finally {
	     	System.out.println("finally 2");
	}


	}
}
