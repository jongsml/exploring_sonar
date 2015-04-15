package nl.hanze.exploring.sonar.design;

import static org.junit.Assert.assertEquals;
import nl.hanze.exploring.sonar.factory.PrintProductFactory;
import nl.hanze.exploring.sonar.factory.ProductFactory;

import org.junit.BeforeClass;
import org.junit.Test;


public class PrintProductFactoryTest {
  

  @Test
  public void getProduct() {
    Product product = PrintProductFactory.getProduct("dvhn", "zdo");
    assertEquals(product, new Product("dvhn", "zdo"));
  }

  @Test
  public void instantiatePrintProductFactory()
  {
	  PrintProductFactory factory = new PrintProductFactory();
	  assertEquals(factory, new PrintProductFactory());
  }

  
}
