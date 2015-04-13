package nl.hanze.exploring.sonar.factory;

import java.text.ParseException;
import java.util.Calendar;
import java.util.List;

import nl.hanze.exploring.sonar.design.PrintProduct;
import nl.hanze.exploring.sonar.design.Publication;

public class PublicationFactory {

  public static Publication getPublication(PrintProduct printProduct, Calendar cal,
      List<String> generateFileList) throws ParseException {
    Publication publication = new Publication(printProduct,cal.getTime());
    publication.setPages(PageFactory.getPages(generateFileList,printProduct.getPrintList(),cal.getTime()));
    return publication;
  }


}
