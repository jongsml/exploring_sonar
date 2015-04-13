package nl.hanze.exploring.sonar.factory;

import nl.hanze.exploring.sonar.design.Product;

import java.util.HashMap;
import java.util.Map;


public class ProductFactory {
  /** getProduct for the factory.
   * @param title title parameter
   * @param edition edition parameter
   * @return product
   */
  public static Product getProduct(String title,String edition) {
    if (getTitleMap().containsKey(title + edition)) {
      return new Product(title,edition);
    }
    return null;
  }

  private static Map<String,String> getTitleMap() {
    Map<String,String> titles = new HashMap<>();
    titles.put("lcnoo", "lc");
    titles.put("dvhnzdo", "dvhn");
    return titles;
  }

}
