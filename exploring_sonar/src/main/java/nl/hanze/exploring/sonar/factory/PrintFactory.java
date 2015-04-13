package nl.hanze.exploring.sonar.factory;

import java.util.HashMap;
import java.util.Map;
import nl.hanze.exploring.sonar.design.Print;

public class PrintFactory {
  public static Print getPrint(String section,String zone) {
    if (getPrintMap().containsKey(section + zone)) {
      return new Print(section,zone);
    }
    return null;
  }

  private static Map<String,Print> getPrintMap() {
    Map<String,Print> printMap = new HashMap<>();
    printMap.put("dgzdo", new Print("dg","zdo"));
    printMap.put("bdvrz", new Print("bd","vrz"));

    printMap.put("dlzui", new Print("dl","zui"));
    printMap.put("blwcz", new Print("bl","wcz"));
    
    return printMap;
  }

}
