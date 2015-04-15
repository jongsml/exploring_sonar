package nl.hanze.exploring.sonar.design;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import nl.hanze.exploring.sonar.factory.ProductFactory;

import org.junit.BeforeClass;
import org.junit.Test;


public class ProductFactoryTest {
  

  @Test
  public void getProduct() {
    Product product = ProductFactory.getProduct("dvhn", "zdo");
    assertEquals(product, new Product("dvhn", "zdo"));
  }

  @Test
  public void getTitleMap() {
    Map<String, String> productMap = ProductFactory.getTitleMap();
    assertEquals(productMap.size(), 2);
  }

}
