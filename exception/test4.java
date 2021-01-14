package com.raystech.exception;

public class test4 {
	
	public static void main(String[] args) {
	try{	String a = "akshay jadon";
	        String b = "akshaypal jadon";
		    System.out.println(a.charAt(12));
	        System.out.println(b.charAt(15));
	}catch(Exception e){
		    System.out.println("12 number khali hai ");
		    System.out.println("15 number khali hai");
	}finally{
		    System.out.println("finally1");
		    System.out.println("finally2");
	}	

}
}