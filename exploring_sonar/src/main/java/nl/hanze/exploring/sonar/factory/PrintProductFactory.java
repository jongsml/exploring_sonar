package nl.hanze.exploring.sonar.factory;

import nl.hanze.exploring.sonar.design.Print;
import nl.hanze.exploring.sonar.design.PrintProduct;
import nl.hanze.exploring.sonar.design.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PrintProductFactory {
  
  public static PrintProduct getPrintProduct(Product product) {
    if (getPrintMap().containsKey(product.getTitle() + product.getEdition())) {
      return new PrintProduct(product,getPrintMap().get(product.getTitle() + product.getEdition()));
    }
    return null;
  }

  private static Map<String,List<Print>> getPrintMap() {
    Map<String,List<Print>> printMap = new HashMap<>();
    List<Print> dvhnZdoList = new ArrayList<>();
    dvhnZdoList.add(PrintFactory.getPrint("dg", "zdo"));
    dvhnZdoList.add(PrintFactory.getPrint("bd", "vrz"));
    printMap.put("dvhnzdo",dvhnZdoList);
    List<Print> lcZuiList = new ArrayList<>();
    lcZuiList.add(PrintFactory.getPrint("dl", "zui"));
    lcZuiList.add(PrintFactory.getPrint("bl", "wcz"));
    printMap.put("lczui",lcZuiList);
    return printMap;
  }

}
