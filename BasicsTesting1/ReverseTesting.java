package com.testing.BasicsTesting1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseTesting {

	@Test 
	public void revNumTest( )
	{
		Reverse r = new Reverse( );
		int result = r.revNum(1234);
		assertEquals(4321,result); //import assertEquals
	}

}
