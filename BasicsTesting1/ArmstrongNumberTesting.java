package com.testing.BasicsTesting1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArmstrongNumberTesting {

	@Test 
	public void anTest(){

		ArmstrongNumber a = new ArmstrongNumber();
		int result = a.an(153);
		assertEquals(153, result); 

	}
}
