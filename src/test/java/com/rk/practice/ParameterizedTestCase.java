package com.rk.practice;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTestCase {
	
	protected int a;
	protected int b;
	protected int expected;
	
	public ParameterizedTestCase(int a, int b, int expeacted) {
		this.a = a;
		this.b = b;
		this.expected = expeacted;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {1, 1, 2},
            {2, 2, 4},
            {8, 2, 10},
            {4, 5, 9},
            {5, 5, 10}
        });
	}

	@Test
	public void testSum () {
		assertEquals(expected, Calculate.sum(a, b));
	}
}
