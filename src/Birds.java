
/**
 * Birds Class defines Birds as an abstract class
 * The information requested are basic to most all birds -e.g final number of wings.
 */

public class Birds {

  private String name;
  private String location;
  private String diet;
  private String description;
  private Boolean predator;
  private Boolean flight;
  private Boolean extinct;
  private final int numberWings = 2;
  private String tag;
  /**
   * getTag function allows us to tag a bird type and allow us to place in the correct avairy
   * precluding birdkeepers from mixing untenable populations.
   */
  public String getTag() {
    if (this.getExtinct()) {
      tag = "extinct";
      return tag;
    } else if (this.getPredator()) {
      tag = "predator";
      return tag;
    } else if (!this.getFlight()) {
      tag = "Flightless";
      return tag;
    }
    return tag = "misc";
  }

  public void setTag() {
    if (this.getExtinct()) {
      this.tag = "extinct";
      return ;
    } else if (this.getPredator()) {
      this.tag = "predator";
      return;
    } else if (!this.getFlight()) {
      this.tag = "Flightless";
      return;
    }
    this.tag = "misc";
  }

  public int getNumberWings() {
    return numberWings;
  }
  public String getName() {
    return name;
  }

  public Boolean getPredator() {
    return predator;
  }

  public void setPredator(Boolean predator) {
    this.predator = predator;
  }

  public Boolean getFlight() {
    return flight;
  }

  public void setFlight(Boolean flight) {
    this.flight = flight;
  }

  public Boolean getExtinct() {
    return extinct;
  }

  public void setExtinct(Boolean extinct) {
    this.extinct = extinct;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getDiet() {
    return diet;
  }

  public void setDiet(String diet) {
    this.diet = diet;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Birds(String name, String location, String diet, String description) {
    this.name = name;
    this.location = location;
    this.diet = diet;
    this.description = description;
    this.predator = false;
    this.flight = true;
    this.extinct = false;
  }

  public Birds(String name, String location, String diet, String description, Boolean predator, Boolean flight, Boolean extinct) {
    this.name = name;
    this.location = location;
    this.diet = diet;
    this.description = description;
    this.predator = predator;
    this.flight = flight;
    this.extinct = extinct;
  }

  @Override
  public String toString() {
    return "Birds{" +
            "name='" + name + '\'' +
            ", location='" + location + '\'' +
            ", diet='" + diet + '\'' +
            ", description='" + description + '\'' +
            '}';
  }

  public int compareTo (Birds otherBird) {
    return this.name.compareTo(otherBird.getName());
  }

}
