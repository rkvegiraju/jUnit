package com.rk.practice;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class OutputStreamTest {
	
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    public void cleanUpStreams() {
        outContent.reset();
    }

    @Test
	public void testingPrint(){
		String name = "RK";
		setUpStreams();
		PrintName.printHello(name);
        assertEquals(outContent.toString(),"Hello " + name);
        cleanUpStreams();  
        		
		
	}
	
}
