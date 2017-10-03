package com.rk.practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExpectedExceptionTestCase {

	@Test(expected=ArithmeticException.class)
	public void testDevideZero () {
		assertEquals(3, Calculate.devide(10, 0), 0.05);
	}

}
