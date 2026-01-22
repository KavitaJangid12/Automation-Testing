package com.testing.BasicsTesting1;

public class Palindrome {
//	public static void main(String[] args) {
//	String str ="dad";
//	String rev = "";
//	for(int i=str.length()-1;i>=0;i--) {
//		rev = rev+str.charAt(i);
//	}
//	if(str.equals(rev)) {
//		System.out.println("Palindrome");
//	} else {
//		System.out.println("Not a palindrome");
//	}
//
//}
	public boolean palindromestring(String str) {
		boolean isPalindrome = true;
		String rev ="";
		for(int i = str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			isPalindrome = true;
		} else {
			isPalindrome = false;
		}
		return isPalindrome;
	}
	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		boolean b = p.palindromestring("hih");
		if(b) {
			System.out.println("Palindrome");
			} else {
				System.out.println("Not a palindrome");
			}
		}
	}
