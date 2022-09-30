import java.util.ArrayList;
import java.util.List;

/**
 *  Aviary Class
 *  each aviary houses up to 5 birds of a particular type based on the regulations of the
 *  conservatory.
 */

public class Aviary {
  //id number of aviary also track cannot have more than 20 in a conservatory
  private int id;
  //Someway of labeling aviary once the 1st bird goes in as pred , waterfowl, flightless , or other
  private String aviaryType;
  //a list to show what birds are in particular aviary and keep at 5 or less
  private List<Birds> birdsInAviary = new ArrayList<Birds>();

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getAviaryType() {
    if (!birdsInAviary.isEmpty()) {
      return birdsInAviary.get(0).getTag();
    }
    return "";
//    return aviaryType;
  }

  public void setAviaryType(String aviaryType) {
    this.aviaryType = aviaryType;
  }

  public List<Birds> getBirdsInAviary() {
    return birdsInAviary;
  }

  public void setBirdsInAviary(List<Birds> birdsInAviary) {
    this.birdsInAviary = birdsInAviary;
  }

  /**
   * printSign methods prints out the aviary
   */
  public void printSign() {
     String avId = "Aviary id: " + id + " aviaryType: " + aviaryType + " birdsInAviary: " + birdsInAviary ;
    System.out.println(avId);
  }

  @Override
  public String toString() {
    return "Aviary{" +
            "id=" + id +
            ", aviaryType='" + aviaryType + '\'' +
            ", birdsInAviary=" + birdsInAviary +
            '}';
  }

}
