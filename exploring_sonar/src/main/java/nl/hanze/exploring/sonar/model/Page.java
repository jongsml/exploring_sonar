package nl.hanze.exploring.sonar.model;

import java.util.Date;

public class Page {
  private Print print;
  private String pagecode;
  private Integer pageNumber;
  private Date publicationDate;
  private String fileName;
  public Print getPrint() {
    return print;
  }
  public void setPrint(Print print) {
    this.print = print;
  }
  public String getPagecode() {
    return pagecode;
  }
  public void setPagecode(String pagecode) {
    this.pagecode = pagecode;
  }
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }
  public Date getPublicationDate() {
    return publicationDate;
  }
  public void setPublicationDate(Date publicationDate) {
    this.publicationDate = publicationDate;
  }
  
  
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }
  @Override
  public String toString() {
    return "Page [print=" + print + ", pagecode=" + pagecode + ", pageNumber=" + pageNumber
        + ", publicationDate=" + publicationDate + ", fileName=" + fileName + "]";
  }
  

}
