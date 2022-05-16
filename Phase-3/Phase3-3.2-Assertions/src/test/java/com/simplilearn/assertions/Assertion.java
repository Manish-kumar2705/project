package com.simplilearn.assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
public class Assertion {

	@Test
	public void asserTests() {
		String str = null;
		String str1 = "Some Value";
		
		Assertions.assertTrue(4>0);
		Assertions.assertNull(str);
		
		Assertions.assertSame(str, str);
		Assertions.assertNotSame(str, str1);
		
		Assertions.assertEquals(3,3);
		
		
		String[] a1  = {"A", "B"};
		String[] a2 = {"C"};
		
		Assertions.assertEquals(a1, a1);
		
		
		Assertions.assertThrows(RuntimeException.class, () -> {
			throw new RuntimeException();
		});
		
	}
}
