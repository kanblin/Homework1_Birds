import java.util.Scanner;
/**
 *  Main driver
 *  running main will ask how many birds are needing housed - will not allow over a hundred
 *  it will auto organize the birds into the conservatory and associated aviaries.
 *  From there it will prompt the user on what information they seek.
 */
public class Main {


  public static void main(String[] args) {
    BirdGenerator birdGen = new BirdGenerator();
    Conservatory birdZoo = new Conservatory();
    Boolean cont = true;
    int choice;
    int aChoice;
    String birdSearch;

    Scanner sc = new Scanner(System.in);
    System.out.println("How many birds are we housing? Conservatory can only house up to 100");

    int numBirds = Integer.parseInt(sc.nextLine());  // Read user input
    if (numBirds > 100) throw new IllegalArgumentException("over capacity");

    for (int i = 0; i < numBirds; i++) {
      Birds birdie = birdGen.randBird();
      birdZoo.findAviaryToInsert(birdie);
    }

    while(cont) {
      System.out.println("Select \n " +
              "1) Look up a bird \n " +
              "2) List of all Avaries \n " +
              "3) Print particular Aviary information \n " +
              "4) Print list of all bird in conservatory\n " +
              "5) Print food supply needs\n " +
              "6) Quit\n");

      choice = Integer.parseInt(sc.nextLine());
      switch (choice) {
        case 1:
          System.out.println("Type in name of bird e.g. eagle, hawk, osprey, owl, pigeon, hornedPuffin,\n" +
                  " emus, ostrich, Parrot, parakeet, duck, Canadian Goose");
          birdSearch = sc.nextLine();
          birdZoo.findBird(birdSearch);
          break;
        case 2:
          birdZoo.printAvariesList();
          break;
        case 3:
          System.out.println("Type in Aviary id number 1 - " + (birdZoo.getNumAviaries()) +"\n");
          aChoice = Integer.parseInt(sc.nextLine());
          birdZoo.getAviariesList().get(aChoice - 1).printSign();
          break;
        case 4:
          birdZoo.printAllBirds();
          break;
        case 5:
          birdZoo.printFoodSupply();
          break;
        case 6:
          cont = false;
          break;
      }
    }
  }
}
