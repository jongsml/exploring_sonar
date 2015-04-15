package nl.hanze.exploring.sonar.factory;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import nl.hanze.exploring.sonar.design.Page;
import nl.hanze.exploring.sonar.design.Print;

public class PageFactory {
	
	private PageFactory() {
		
	}


  public static List<Page> getPages(List<String> generateFileList, List<Print> printList, Date date) throws ParseException {
    List<Page> pageList = new ArrayList<>();
    for (String filename : generateFileList)
    {
      for (Print print : printList)
      {
        Page page = getPage(filename,print,date);
        if (page != null)
          pageList.add(page);

      }
    }
    return pageList;
  }

  private static Page getPage(String filename,Print print,Date date) throws ParseException {
    if (filename.toLowerCase().indexOf("cci") > 0 && 
        filename.toLowerCase().indexOf(print.getSection().toLowerCase()) > 0 &&
        filename.toLowerCase().indexOf(print.getZone().toLowerCase()) > 0)
        {
          return EditorialPageFactory.getEditorialPage(filename, print,date);
        }
    return null;
  }
   


}
