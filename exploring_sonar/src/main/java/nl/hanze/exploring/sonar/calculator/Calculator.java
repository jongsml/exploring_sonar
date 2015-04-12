package nl.hanze.exploring.sonar.calculator;

import nl.hanze.exploring.sonar.calculator.contract.CalculatorContract;

public class Calculator implements CalculatorContract
{

	@Override
	public int sum(int a, int b) 
	{
		return a + b;		
	}
	

}
