package com.rk.practice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SimpleTestCase {

	@Test
	public void testSum () {
		assertEquals(13, Calculate.sum(10, 3));
		assertNotEquals(10, Calculate.sum(10, 3));

		assertTrue(13 == Calculate.sum(10, 3));
		assertFalse(10 == Calculate.sum(10, 3));

		assertSame(13, Calculate.sum(10, 3));
		assertNotSame(10, Calculate.sum(10, 3));
	}
	
	@Test
	public void testDevide () {
		assertEquals(3, Calculate.devide(10, 3), 0.05);
		assertNotEquals(10, Calculate.devide(10, 3));

		//assertTrue(3.3 == Calculate.devide(10, 3));
		assertFalse(10 == Calculate.devide(10, 3));

		//assertSame(13, Calculate.devide(10, 3));
		assertNotSame(10, Calculate.devide(10, 3));
	}

//	@Test
//	public void testDevideZero () {
//		assertEquals(3.3, Calculate.devide(10, 0), 0.05);
//	}

}
