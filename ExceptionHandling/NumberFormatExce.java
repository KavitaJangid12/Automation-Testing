package com.example;

public class NumberFormatExce {

	public static void main(String[] args) {
		String name="ramu";
		try {
		int i=Integer.parseInt(name);
		}
		catch(Exception ae) {
			System.out.println(ae);
		}
	}

}
