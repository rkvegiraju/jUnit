package com.rk.practice;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(SimpleTestCase.class, 
				ParameterizedTestCase.class, IgnoreTestCase.class, 
				FailTestCase.class);
		if (result.wasSuccessful()) {
			System.out.println("RunCount : " + result.getRunCount());
			System.out.println("RunTime : " + result.getRunTime());
			System.out.println("IgnoreCount : " + result.getIgnoreCount());
		}
		
		List<Failure> list = result.getFailures();
		for (Failure f : list) {
//			System.out.println("Header : " + f.getTestHeader());
//			System.out.println("Message : " + f.getMessage());
//			//System.out.println("Trace : " + f.getTrace());
//			Description desc = f.getDescription();
//			System.out.println("Disp Name : " + desc.getDisplayName());
//			System.out.println("Disp Name : " + desc.getDisplayName());
			System.out.println(f.toString());
		}
	}
}
