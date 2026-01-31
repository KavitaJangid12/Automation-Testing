package com.example;

public class NullPointer {
	public static void main(String[] args) {
		String name=null;
		try {
			System.out.println(name.length());
		}
		catch(NullPointerException ae) {
			System.out.println(ae);

		}
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
	}

}
