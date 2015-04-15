package nl.hanze.exploring.sonar.model;

import java.util.List;

public class PrintProduct {
  private Product product;
  private List<Print> printList;
  public PrintProduct(Product product, List<Print> list) {
    this.product = product;
    this.printList = list;
  }
  public Product getProduct() {
    return product;
  }
  public void setProduct(Product product) {
    this.product = product;
  }
  public List<Print> getPrintList() {
    return printList;
  }
  public void setPrintList(List<Print> printList) {
    this.printList = printList;
  }
  @Override
  public String toString() {
    return "PrintProduct [product=" + product + ", printList=" + printList + "]";
  }
  
  

}
