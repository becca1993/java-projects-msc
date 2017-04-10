package uk.ac.qub.UpdatedCalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Testing {
	
	CalculatorMethods cm = new CalculatorMethods();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAddMe() { //Testing AddMe method
		
		int num1, num2; //Setting up ints to test
		num1 = 1; //num1 is 1
		num2 = 2; //num2 is 2
		int expected = 3; //Expected value of addition method
		int actual = cm.addMe(num1, num2); //Actual value of addition method - invoke method
		assertEquals(expected, actual); //assertEquals method on the two values.
	}

	@Test
	/**
	 * Testing AddMeThree method. Should add up three numbers and return the results.
	 */
	public void testAddMeThree() {
		int num1, num2, num3; //Setting up ints to test
		num1 = 1; //num1 is 1 
		num2 = 2; //num2 is 2
		num3 = 3; //num3 is 3
		int expected = 6; //Expected value of addition method
		int actual = cm.addMeThree(num1, num2, num3); //Actual value of addition method - invoke method
		assertEquals(expected, actual); //assertEquals method on the two values
	}

	/**
	 * Testing subtractMe method. Should substract two numbers and return the results.
	 */
	@Test
	public void testSubtractMe() {
		int num1, num2; //Setting up ints to test
		num1 = 10; //num1 is 10
		num2 = 5; //num2 is 5
		int expected = 5; //Expected value of subtraction method
		int actual = cm.subtractMe(num1, num2); //Actual value of subtraction method - invoke method
		assertEquals(expected, actual); //assertEquals method on the two values to see if the two values are the same. If not, should fail.
	}

	/**
	 * Testing subtractMeThree method. Should subtract three numbers and return the results.
	 */
	@Test
	public void testSubtractMeThree() {
		int num1, num2, num3, actual, expected; //Setting up ints to test
		num1 = 20;
		num2 = 5;
		num3 = 5;
		expected = 10; //Expected value for the subtraction method
		actual = cm.subtractMeThree(num1, num2, num3); //Actual value of subtraction method - invoke method
		assertEquals(expected, actual); //assertEquals method on the two values to see if the two values are the same. If not, should fail.
	}

	/**
	 * Testing multiplyMe method. Should multiply two numbers and return the results
	 */
	@Test
	public void testMultiplyMe() {
		int num1, num2, actual, expected; //Setting up ints to test
		num1 = 2;
		num2 = 5;
		expected = 10; //Expected value for the multiply method
		actual = cm.multiplyMe(num1, num2); //Actual value of multiply method - invoke method
		assertEquals(expected, actual); //assertEquals method on the two values to see if the two values are the same. If not, should fail.
	}
 /**
  * This method is testing the divideMe method. Happy case. Should divide two numbers and return the results
  */
	@Test
	public void testDivideMe() {
		int num1, num2, actual, expected; //Setting up ints to test
		num1 = 10;
		num2 = 2;
		expected = 5; //Expected value for the dividing method
		actual = cm.divideMe(num1, num2); //Actual value of divide method - invoke method
		assertEquals(expected, actual); //assertEquals method on the two values to see if the two values are the same. If not, should fail.
	}
	
	/**
	 * Testing handling of division by zero. Should fail with an ArithmeticException
	 */
	@Test(expected=java.lang.ArithmeticException.class)
	public void testDivideMeFail(){
		int num1, num2;
		num1 = 0;
		num2 = 10;
		int actual = cm.divideMe(num1, num2);
	}


	/**
	 * Testing setting of memory var
	 */
	@Test
	public void testMemory() {
	
		int expected, actual;
		
		expected = 1;
		actual = cm.setMemory(expected);
		assertEquals(expected, actual);
	
	}

	/**
	 * Testing adding to memory value.
	 */
	@Test
	public void testAddToMemory() {
		int num1, memory, expected, actual;
		num1 = 2;
		memory = 1;
		expected = 3;
		actual = cm.addToMemory(num1, memory);
		assertEquals(expected, actual);
	}
/**
 * Testing recall of memory var. Should print out whatever user has placed into memory
 */
	@Test
	public void testRecallMemory() {
		cm.setMemory(2);
		cm.recallMemory();
		
		
		
	}

	/**
	 * Testing clearing memory var, should return 0
	 */
	@Test
	public void testClearMemory() {
		int actual, expected, memory;
		expected = 0;
		memory = 1;
		actual = cm.clearMemory(memory);
		assertEquals(expected, actual);
	}

	/**
	 * Testing square root function
	 */
	@Test
	public void testFindSquareRoot() {
		int actual, expected, num1;
		num1 = 100;
		expected = 10;
		actual = cm.findSquareRoot(num1);
		assertEquals(expected, actual);
		
	}

}
