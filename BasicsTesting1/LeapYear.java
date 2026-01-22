package com.testing.BasicsTesting1;

public class LeapYear {
	public boolean leap(int year) {
		if((year%4==0 && year%100!=0)|| year%400==0) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not a leap year");
		}
		return true;
	}
	public static void main(String[] args) {
		LeapYear  ly= new LeapYear();
		ly.leap(2005);
	}
}
