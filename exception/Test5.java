package com.raystech.exception;

public class Test5 {
public static void main(String[] args) {
		try {
			String a = "nishant";
			System.out.println(a.charAt(15));

		} catch (StringIndexOutOfBoundsException a) {
			System.out.println("15 number khali hai");
		} finally {
			System.out.println("finally");
			try {
				String b = "akshay";
				System.out.println(b.charAt(8));
			} catch (StringIndexOutOfBoundsException b) {
				System.out.println("8 number khali hai");
			}
		}
	}
}
