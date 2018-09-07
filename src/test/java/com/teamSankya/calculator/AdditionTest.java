package com.teamSankya.calculator;


import org.junit.Test;

import junit.framework.TestCase;

public class AdditionTest {

	@Test
	public void addIntTest() {
		int sum= Addition.addititon(20, 30);
		TestCase.assertEquals(50, sum);
	}
	
	
	

}
