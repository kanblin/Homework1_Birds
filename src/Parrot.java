
/**
 * Parrot can speak and have vocabulary
 * The description print out will have that additional information.
 */

public class Parrot extends Birds {

  private String favoriteWords;
  private int numWords;

  public Parrot(String name, String location, String diet, String description) {
    super(name, location, diet, description);
  }

  public Parrot(String name, String location, String diet, String description, Boolean predator, Boolean flight, Boolean extinct) {
    super(name, location, diet, description, predator, flight, extinct);
  }

  public Parrot(String name, String location, String diet, String description, Boolean predator, Boolean flight, Boolean extinct, int numWords, String favoriteWords) {
    super(name, location, diet, description, predator, flight, extinct);
    this.numWords = numWords;
    this.favoriteWords = favoriteWords;
  }

  public int getNumWords() {
    return numWords;
  }

  public void setNumWords(int numWords) {
    this.numWords = numWords;
  }

  public String getFavoriteWords() {
    return favoriteWords;
  }

  public void setFavoriteWords(String favoriteWords) {
    this.favoriteWords = favoriteWords;
  }

  @Override
  public String toString() {
    return "Parrot{" +
            super.toString() +
            " vocabulary= " + numWords +
            " favoriteWords='" + favoriteWords + '\'' +
            '}';
  }


}
