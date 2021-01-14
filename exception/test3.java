package com.raystech.exception;

public class test3 {
	public static void main(String[] args) {
	try {
int a = 500;
int b =0;
double c = a/b;
System.out.println(c);
}catch(ArithmeticException d) {
	System.out.println("b ki value choti hai");
	
}
}}