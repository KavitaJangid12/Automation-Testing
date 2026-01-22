package com.testing.BasicsTesting1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTesting {

	@Test
	public void addTest() {
//		fail("Not yet implemented");
		
		Calculator c = new Calculator( );
		int result = c.add(10,20);
		assertEquals(30,result);

	}
}
	
