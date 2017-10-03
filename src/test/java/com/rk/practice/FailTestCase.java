package com.rk.practice;

import static org.junit.Assert.fail;

import org.junit.Test;

public class FailTestCase {

	@Test
	public void testSum () {
		fail("Test failed");
	}

}
