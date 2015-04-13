package nl.hanze.exploring.sonar.factory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import nl.hanze.exploring.sonar.design.Page;
import nl.hanze.exploring.sonar.design.Print;

public class EditorialPageFactory {
  public static Page getEditorialPage(String filename,Print print,Date date) throws ParseException {
    String parts[] = filename.split("_");
    Page page = new Page();
    page.setFileName(filename);
    page.setPagecode(parts[1]);
    page.setPageNumber(new Integer(parts[2]));
    DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    page.setPublicationDate(df.parse(parts[0]));
    String date1 = df.format(date);
    String date2 = df.format(page.getPublicationDate());
    page.setPrint(print);
    
    if (date1.equalsIgnoreCase(date2))
      return page;

    
    return null;
  }


}
