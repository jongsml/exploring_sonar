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
  public void initEmptyProductGetEdition() {
    Product empty = new Product();
    assertEquals(empty.getEdition(), null);
  }
  
  @Test
  public void initEmptyProductGetTitle() {
    Product empty = new Product();
    assertEquals(empty.getTitle(), null);
  }
  
  @Test
  public void initEmptyProductSetTitle() {
    Product empty = new Product();
    empty.setTitle("foo");
    assertEquals(empty.getTitle(), "foo");
  }
  
  @Test
  public void initEmptyProductSetEdition() {
    Product empty = new Product();
    empty.setEdition("foo");
    assertEquals(empty.getEdition(), "foo");
  }
  
  
  @Test
  public void testGetTitle() {
    assertEquals(product.getTitle(), "dvhn");
  }

}
