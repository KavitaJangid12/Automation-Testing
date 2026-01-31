package com.example;

public class StringIndexOutOfBoundsEx {

	public static void main(String[] args) {
		String name="ramu";
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(3));

		try {
		System.out.println(name.charAt(10));
		}
		catch(Exception ex) {
			System.out.println(ex);
		}

		
	}

}
