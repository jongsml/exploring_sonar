package nl.hanze.exploring.sonar.design;

public class Print {
  private String section;
  private String zone;
  
  public Print(String section, String zone) {
    this.section = section;
    this.zone = zone;
  }
  public String getSection() {
    return section;
  }
  public void setSection(String section) {
    this.section = section;
  }
  public String getZone() {
    return zone;
  }
  public void setZone(String zone) {
    this.zone = zone;
  }
  @Override
  public String toString() {
    return "Print [section=" + section + ", zone=" + zone + "]";
  }
  
  

}
