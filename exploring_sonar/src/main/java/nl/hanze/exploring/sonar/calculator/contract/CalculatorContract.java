package nl.hanze.exploring.sonar.calculator.contract;
/** contract for the Calculator.
 */
public interface CalculatorContract {
  /** sum of two numbers.
   * @param number1 parameter number1
   * @param number2 parameter number2
   * @return sum result
   */
  int sum(final int number1, final int number2);
}
