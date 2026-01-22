package com.testing.BasicsTesting1;

public class ArmstrongNumber {
	public int an(int number)
	{
	int sum = 0;
	if(number !=0){
	int digit = number % 10;
	sum = sum+ digit*digit*digit;
	number = number/10;
	}
	return sum;
	}
}
