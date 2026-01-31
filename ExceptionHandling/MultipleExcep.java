package com.example;

public class MultipleExcep {
	public static void main(String[] args) {
		try {
		int result=10/0;
		int[] numbers = {1,2,3};
		System.out.println(numbers[5]);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		catch(ArrayIndexOutOfBoundsException ae1) {
			System.out.println(ae1);
		}
	}

}
