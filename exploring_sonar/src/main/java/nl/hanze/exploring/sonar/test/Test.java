package nl.hanze.exploring.sonar.test;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import nl.hanze.exploring.sonar.design.Page;
import nl.hanze.exploring.sonar.design.PrintProduct;
import nl.hanze.exploring.sonar.design.Product;
import nl.hanze.exploring.sonar.design.Publication;
import nl.hanze.exploring.sonar.factory.FileListReaderFactory;
import nl.hanze.exploring.sonar.factory.PrintProductFactory;
import nl.hanze.exploring.sonar.factory.ProductFactory;
import nl.hanze.exploring.sonar.factory.PublicationFactory;
import nl.hanze.exploring.sonar.file.FileListReader;

public class Test {
  public static void main(String [] args) throws ParseException {
    Product product = ProductFactory.getProduct("dvhn", "zdo");
    PrintProduct printProduct = PrintProductFactory.getPrintProduct(product);
    System.out.println(printProduct.toString());
    FileListReader fileReader = FileListReaderFactory.getFileListReader();
    System.out.println(fileReader.generateFileList());
    
    Calendar cal = Calendar.getInstance();
    cal.setTime(new Date());
    cal.add(Calendar.DATE,-2);
    
    Publication publication = PublicationFactory.getPublication(printProduct,cal,fileReader.generateFileList());
    for (Page page : publication.getPages())
    {
      System.out.println(page.getFileName());
    }
  }

}
