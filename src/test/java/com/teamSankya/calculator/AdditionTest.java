package com.teamSankya.calculator;


import org.junit.Test;

import junit.framework.TestCase;

public class AdditionTest {

	@Test
	public void addIntTest() {
		int sum= Addition.addititon(20, 30);
		TestCase.assertEquals(50, sum);
	}
	
	@Test
	public void addDoTest() {
		double sum1= Addition.addititon(20.25, 30.25);
		TestCase.assertEquals(500.50, sum1);
	}
	

}
