package com.simplilearn.tests;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class NestedRepeatedTests {

	@BeforeEach
	void beforeEach() {
		System.out.println("Before Each of NestedRepeatedTests (Outer class)");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("After Each of NestedRepeatedTests (Outer class)");
	}
	
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before All  of NestedRepeatedTests (Outer class)");
	}
	
	@Nested
	class A {
		
		@BeforeEach
		void beforeEach() {
			System.out.println("Before Each of A");
		}
		
		@Test
		void testSampleMEthod() {
			System.out.println("Test executed from Nested inner class");
		}
		
		@AfterEach
		void afterEach() {
			System.out.println("After Each of A");
		}
	}

}
