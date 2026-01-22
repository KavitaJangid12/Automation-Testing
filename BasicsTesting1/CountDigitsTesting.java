package com.testing.BasicsTesting1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountDigitsTesting {

	@Test 
	public void cntTest( )
	{
		CountDigits cd = new CountDigits( );
		int result = cd.cnt(1234);
		assertEquals(4, result); //import assertEquals
	}


}
