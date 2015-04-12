package nl.hanze.exploring.sonar.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import nl.hanze.exploring.sonar.calculator.contract.CalculatorContract;

public class CalculatorTest 
{
	private static CalculatorContract calculator;

	@BeforeClass
	public static void initCalculator()
	{
		calculator = new Calculator();
	}
	
	 @Before
	 public void beforeEachTest() 
	 {
		 System.out.println("This is executed before each Test");
	 }
	 
	 @Test
	 public void testSum() 
	 {
		 int result = calculator.sum(3, 4);
	     assertEquals(7, result);
	 }
	
}
