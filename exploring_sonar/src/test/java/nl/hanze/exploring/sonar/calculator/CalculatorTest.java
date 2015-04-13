package nl.hanze.exploring.sonar.calculator;

import static org.junit.Assert.assertEquals;

import nl.hanze.exploring.sonar.calculator.contract.CalculatorContract;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**@author leon.
 *
 */
public class CalculatorTest {
/** calculator instance object.
 * 
 */
  private static CalculatorContract calculator;

  /** init the calculator.
 */
  @BeforeClass
  public static void initCalculator() {
    calculator = new Calculator();
  }
/** display a message before the test starts.
 */
  @Before
  public final void beforeEachTest() {
    System.out.println("This is executed before each Test");
  }
  /**testSum function.
   */
  @Test
  public void testSum() {
   
    int amount = 7;
    int result = calculator.sum(3, 4);
    assertEquals(amount, result);
  }
}
