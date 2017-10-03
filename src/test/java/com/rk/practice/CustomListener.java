package com.rk.practice;

import java.io.FileWriter;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class CustomListener extends RunListener {
	
	private FileWriter writer = null;

	// When test runner is started
	@Override
	public void testRunStarted(Description description) throws Exception {
		writer = new FileWriter("CustomeLog.log");
		super.testRunStarted(description);
	}
	
	// When test runner is finished
	@Override
	public void testRunFinished(Result result) throws Exception {
		if (writer != null) {
			writer.close();
		}
		super.testRunFinished(result);
	}
	
	// When each test case is started
	@Override
	public void testStarted(Description description) throws Exception {
		writer.write("\n============================================================\n");
		writer.write("Execution of " + description.getMethodName() + " is sarted\n");
		super.testStarted(description);
	}
	
	// When each test case failed
	@Override
	public void testFailure(Failure failure) throws Exception {
		writer.write(failure.getTestHeader() + "\n");
		writer.write(failure.getMessage() + "\n");
		writer.write(failure.getTrace() + "\n");
		super.testFailure(failure);
	}
	
	// When each test case is finished
	@Override
	public void testFinished(Description description) throws Exception {
		writer.write("Execution of " + description.getMethodName() + " is finished\n");
		writer.write("============================================================\n\n");
		super.testFinished(description);
	}
	
	// When each test case is ignored
	@Override
	public void testIgnored(Description description) throws Exception {
		writer.write("Execution of " + description.getMethodName() + " is ignored\n");
		super.testIgnored(description);
	}
	
	
	// 
	@Override
	public void testAssumptionFailure(Failure failure) {
		// TODO Auto-generated method stub
		super.testAssumptionFailure(failure);
	}
}
