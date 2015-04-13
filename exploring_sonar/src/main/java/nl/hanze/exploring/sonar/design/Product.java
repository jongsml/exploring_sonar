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
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((edition == null) ? 0 : edition.hashCode());
    result = prime * result + ((title == null) ? 0 : title.hashCode());
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Product other = (Product) obj;
    if (edition == null) {
      if (other.edition != null)
        return false;
    } else if (!edition.equals(other.edition))
      return false;
    if (title == null) {
      if (other.title != null)
        return false;
    } else if (!title.equals(other.title))
      return false;
    return true;
  }
 

}
