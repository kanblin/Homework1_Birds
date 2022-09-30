
/**
 *  Waterfowl similar to shorebirds adds what body of water it is near
 */

public class Waterfowl extends Birds {
  private String waterLocale;

  public Waterfowl(String name, String location, String diet, String description) {
    super(name, location, diet, description);
  }

  public Waterfowl(String name, String location, String diet, String description, Boolean predator, Boolean flight, Boolean extinct, String waterLocale) {
    super(name, location, diet, description, predator, flight, extinct);
    this.waterLocale = waterLocale;
  }

  public String getWaterLocale() {
    return waterLocale;
  }

  public void setWaterLocale(String waterLocale) {
    this.waterLocale = waterLocale;
  }

  @Override
  public String getTag(){
    if (this.getExtinct()) {
      return "extinct";
    }
    return "Waterfowl";
  }
  @Override
  public String toString() {
    return "Waterfowl{" +
            super.toString() +
            "region of water='" + waterLocale + '\'' +
            '}';
  }
}
