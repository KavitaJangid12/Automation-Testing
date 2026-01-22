package com.testing.BasicsTesting1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FourTesting {

	@Test
	public void primenTest() {
		Four f = new Four();
		boolean result = f.primen(97);
		assertEquals(97,result);
	}

}
