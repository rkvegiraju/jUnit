package com.rk.practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runners.model.TestTimedOutException;

public class ExpectedTimeoutTestCase {

	@Test(timeout=1000)
	public void testDevideZero () {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		assertEquals(3, Calculate.devide(10, 3), 0.05);
	}

	@Test(expected=TestTimedOutException.class, timeout=10)
	public void testDevideZero2 () throws InterruptedException {
		Thread.sleep(100);
		assertEquals(3, Calculate.devide(10, 3), 0.05);
	}

}
