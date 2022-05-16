package com.selenium;

import org.testng.annotations.Test;

public class GroupTest {

	 @Test(priority='1', groups="UnitTest")
		public void testcase1()
		{
			System.out.println("testcases for unit Testing");
		}

	    @Test(priority='2' , groups="UnitTest")
		public void testcase2()
		{
			System.out.println("testcases for unit Testing");
		}
	    @Test(priority='1', groups="IntegrationTest")
		public void testcase3()
		{
			System.out.println("testcases for Integration Testing");
		}
	    @Test(priority='2', groups="IntegrationTest")
		public void testcase4()
		{
			System.out.println("testcases for Integration Testing");
		}
	    @Test(priority='1', groups="RegressionTest")
		public void testcase5()
		{
			System.out.println("testcases for regression Testing");
		}
	    @Test(priority='2', groups="RegressionTest")
		public void testcase6()
		{
			System.out.println("testcases for regression Testing");
		}
		
}
