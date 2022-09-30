import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class AviaryTest {

  BirdGenerator bg = new BirdGenerator();
  Aviary aviaryTest = new Aviary();

  @BeforeEach
  void setUp() {

  }

  @org.junit.jupiter.api.Test
  void printSign() {
    aviaryTest.setId(1);

    Birds randomBird = bg.randBird();
    System.out.println(randomBird);
    System.out.println(randomBird.getTag());
    aviaryTest.getBirdsInAviary().add(randomBird);

    randomBird = bg.randBird();
    aviaryTest.getBirdsInAviary().add(randomBird);

    System.out.println(aviaryTest.toString());


  }
}