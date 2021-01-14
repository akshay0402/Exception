package com.raystech.exception;

public class Test6 {
	public static void main(String[] args) {
	try{String a = "akshay";
	System.out.println(a.charAt(9));
	}catch(StringIndexOutOfBoundsException a) {
		System.out.println("9 number khali hai");
	try {String b = "akshayjadon";	
	System.out.println(b.charAt(15));
	}catch(StringIndexOutOfBoundsException b ) {
		System.out.println(b.getMessage());
	}
	}
	}

}
