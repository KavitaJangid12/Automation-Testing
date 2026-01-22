package com.testing.BasicsTesting1;

public class Four {
	public boolean primen(int number) {
	
		boolean isPrime = true;
		if(number<=1) {
			isPrime=false;
		}
		else {
			for(int i=2; i<=Math.sqrt(number);i++) {
				if(number % i==0) {
					isPrime = false;
				}
			}
			if(isPrime) {
				System.out.println("It is a prime number");
			}
			else {
				System.out.println("Not a prime number");
			}
		}
		return isPrime;
	}
	public static void main(String[] args) {
		Four f = new Four();
		f.primen(12);

	}
}
