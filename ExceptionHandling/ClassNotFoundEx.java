package com.example;

public class ClassNotFoundEx {
	public static void main(String[] args) {
		try {
		Class.forName("ABC");
		}
		catch(Exception ae) {
			System.out.println(ae);
		}
	}

}
