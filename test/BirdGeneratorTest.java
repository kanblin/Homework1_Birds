import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirdGeneratorTest {


  @Test
  void randBird() {
    BirdGenerator bg = new BirdGenerator();
    Birds randomBird = bg.randBird();
    System.out.println(randomBird);
    System.out.println(randomBird.getTag());

//    Birds parrot5 = new Parrot("redParrot", "South America", "seeds, fruits, nuts",
//            "Parrots have a short, curved beak and are known for their intelligence and " +
//                    "ability to mimic sounds.", false, true, false, 10,
//            "Hello World");
//
//    System.out.println(parrot5.getTag());
    //    if (parrot5.getTag().equals("misc")) {
//      System.out.println("true lalalal");
//    }
  }
}