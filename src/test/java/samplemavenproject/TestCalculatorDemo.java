package samplemavenproject;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculatorDemo {

	//CalculatorMaven c1=new CalculatorMaven();
	
	@Test
	public void testAdd() {
		CalculatorMaven c1=new CalculatorMaven(0,0);
		int expectedResult = 30;
		int actualResult = c1.add(15,15);
		assertEquals(expectedResult,actualResult);
	}
	@Test
	public void testSub() {
		CalculatorMaven c2=new CalculatorMaven(0,0);
		int expectedResult = 5;
		int actualResult = c2.sub(15,10);
		assertEquals(expectedResult,actualResult,1);
	}
	@Test
	public void testMul() {
		CalculatorMaven c3=new CalculatorMaven(0,0);
		int expectedResult = 30;
		int actualResult = c3.mul(15,2);
		assertEquals(expectedResult,actualResult,1);
	}
	@Test
	public void testDiv() {
		CalculatorMaven c4=new CalculatorMaven(0,0);
		int expectedResult = 5;
		int actualResult = c4.div(30,6);
		assertEquals(expectedResult,actualResult,1);
	}
}
	




