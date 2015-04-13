package nl.hanze.exploring.sonar.design;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;


public class ProductTest {
  private static Product product;
  
  @BeforeClass
  public static void initProduct() {
    product = new Product("dvhn","zdo");
  }
  
  @Test
  public void testGetEdition() {
    assertEquals(product.getEdition(), "zdo");
  }
  
  @Test
  public void testGetTitle() {
    assertEquals(product.getTitle(), "dvhn");
  }

}
