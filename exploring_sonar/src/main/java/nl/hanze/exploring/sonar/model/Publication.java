package nl.hanze.exploring.sonar.model;

import java.util.Date;
import java.util.List;

public class Publication {
  private PrintProduct printProduct;
  private Date publicationDate;
  private List<Page> pages;
  public Publication(PrintProduct printProduct, Date publicationDate) {
    this.printProduct = printProduct;
    this.publicationDate = publicationDate;
    
    // TODO Auto-generated constructor stub
  }
  public PrintProduct getPrintProduct() {
    return printProduct;
  }
  public void setPrintProduct(PrintProduct printProduct) {
    this.printProduct = printProduct;
  }
  public Date getPublicationDate() {
    return publicationDate;
  }
  public void setPublicationDate(Date publicationDate) {
    this.publicationDate = publicationDate;
  }
  public List<Page> getPages() {
    return pages;
  }
  public void setPages(List<Page> pages) {
    this.pages = pages;
  }
  @Override
  public String toString() {
    return "Publication [printProduct=" + printProduct + ", publicationDate=" + publicationDate
        + ", pages=" + pages + "]";
  }
  
  

}
