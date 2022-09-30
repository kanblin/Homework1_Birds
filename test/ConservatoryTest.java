import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConservatoryTest {

  @BeforeEach
  void setUp() {

  }
  BirdGenerator bg = new BirdGenerator();
  Birds randomBird = bg.randBird();

  Conservatory testConserve = new Conservatory();

  Birds eagle = new Birds ("eagle","USA", "rodents, fish", "Eagles are " +
          "large, powerfully built birds of prey, with heavy heads and beaks."
          , true, true, false);

  Birds hawk = new Birds ("hawk", "North America", "rodents, fish, snakes",
          "mainly woodland birds with long tails and high visual acuity. "
          , true, true, false);

  Birds penguin =  new ShoreBirds ("penguin","Southern hemisphere", "" +
          "fish, krill","adorable, aquatic flightless birds",
          false, false, false, "Antarctica Coast");

  Birds duck2 = new Waterfowl("rubberDuck", "Global", "fish, algae, bugs",
          "mostly aquatic birds, and may be found in both fresh water and sea water",
          false, true, false, "rivers, lakes, coasts");

  Birds dodo =  new ShoreBirds ("dodo","island of Mauritius", "nuts, seeds, bulbs, and roots",
          "is a species of flightless alcid that became extinct in the mid-19th century"
          , false, false, true, "N/A");
  @Test
  void createAviary() {

  }

  @Test
  void findAviaryToInsert() {
//    testConserve.createAviary(hawk);

    testConserve.findAviaryToInsert(eagle);
    testConserve.findAviaryToInsert(hawk);
    testConserve.findAviaryToInsert(penguin);
    testConserve.findAviaryToInsert(duck2);
    for (int i = 0; i < 3; i++) {
      testConserve.findAviaryToInsert(eagle);
      testConserve.findAviaryToInsert(hawk);
      testConserve.findAviaryToInsert(penguin);
      testConserve.findAviaryToInsert(duck2);

    }
    testConserve.findAviaryToInsert(dodo);
    System.out.println(testConserve.getTotalBirds());
    System.out.println(testConserve.getAviariesList());
//    System.out.println(testConserve.getCarne());
//    System.out.println(testConserve.getPesc());
  }

  @Test
  void findBird() {
    testConserve.findAviaryToInsert(eagle);
    testConserve.findAviaryToInsert(hawk);
    testConserve.findAviaryToInsert(penguin);
    testConserve.findAviaryToInsert(duck2);
    int shouldBe = testConserve.findBird("eagle");
    assertEquals(1, shouldBe);
    shouldBe = testConserve.findBird("duck");
    assertEquals(0, shouldBe);
    shouldBe = testConserve.findBird("penguin");
    assertEquals(2, shouldBe);


  }
}