package com.rk.practice;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({SimpleTestCase.class, ParameterizedTestCase.class})
public class TestSuite {

}
