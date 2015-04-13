package nl.hanze.exploring.sonar.design;

public class Product {
  private String title;
  private String edition;
  
  public Product() {
    
  }
/** constructor to create a product.
 * @param title parameter
 * @param edition parameter
 */
  public Product(String title, String edition) {
    this.title = title;
    this.edition = edition;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getEdition() {
    return edition;
  }

  public void setEdition(String edition) {
    this.edition = edition;
  }
 

}
