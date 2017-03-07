package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class CalculatorTest {

	private Calculator calculator;
	
	@Before
	public void setup(){
	    calculator = new Calculator();
	
	}
 
	@Test
	public void addTest(){
		assertEquals(4,calculator.add(2, 2));
	}
	// for exercise D 
	@Test 
	public void subtractTest(){
		assertEquals(4,calculator.subtract(6, 2));
	}
	@Test 
	public void multiplyTest(){
		assertEquals(8,calculator.multiply(4, 2));
	}
	@Test 
	public void divideTest(){
		assertEquals(4,calculator.divide(8, 2));
	}
	@Test
	public void isEqualTest1(){
		assertTrue(calculator.isEqual(2, 2));
	}
	@Test
	public void isEqualTest2(){
		assertFalse(calculator.isEqual(3, 2));
}
}
//i think for the method which is isEqualTest2, when i input 3 and 2 to 
//test the isEqual method run the test, it processed 
// successfully, however, if i input two number are the same, it 
// would be error results.