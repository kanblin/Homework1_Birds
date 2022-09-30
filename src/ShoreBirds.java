
/**
 * Shorebird class adds the shore of which a shorebird can be found
 */

public class ShoreBirds extends Birds{
  private String shore;

  public String getShore() {
    return shore;
  }

  public void setShore(String shore) {
    this.shore = shore;
  }

  public ShoreBirds(String name, String location, String diet, String description) {
    super(name, location, diet, description);
  }

  public ShoreBirds(String name, String location, String diet, String description, Boolean predator, Boolean flight, Boolean extinct, String shore) {
    super(name, location, diet, description, predator, flight, extinct);
    this.shore = shore;
  }


  @Override
  public String toString() {
    return "Shorebird{" +
            super.toString() +
            "Shore area ='" + shore + '\'' +
            '}';
  }
}
