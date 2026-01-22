package com.testing.BasicsTesting1;

public class Reverse {
	public int revNum(int number)//eg:1234
	{
		int rev = 0;
		while(number !=0)
		{
			int digit = number % 10; //get the last digit
			rev = rev*10+digit; //4321
			number = number / 10; //remove the last digit
		}
		return rev;
	}


}
