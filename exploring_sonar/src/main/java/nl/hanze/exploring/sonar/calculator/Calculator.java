package nl.hanze.exploring.sonar.calculator;

import nl.hanze.exploring.sonar.calculator.contract.CalculatorContract;

/** @author leon.
 *
 */
public class Calculator implements CalculatorContract {

  /** sum two numbers with calculator.
   */
  @Override
  public final int sum(final int number1, final int number2) {
    return number1 + number2;
  }
}
