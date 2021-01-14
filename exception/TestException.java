package com.raystech.exception;

public class TestException {	
	public static void main(String[] args) {
		  try {
			   String s = "ayush";
			   System.out.println(s.length());
			System.out.println(s.charAt(5));
		}catch(StringIndexOutOfBoundsException e) {
		    System.out.println("caharctor galat hai");
		}  finally{
		    	System.out.println("finally shi hai");
		    }   
		}		  
	}


