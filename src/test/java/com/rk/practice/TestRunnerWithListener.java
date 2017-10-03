package com.rk.practice;

import org.junit.runner.JUnitCore;

public class TestRunnerWithListener {
	
	public static void main(String[] args) {
		JUnitCore core = new JUnitCore();
		core.addListener(new CustomListener());
		core.run(SimpleTestCase.class, 
				ParameterizedTestCase.class, IgnoreTestCase.class, 
				FailTestCase.class);
	}
}
