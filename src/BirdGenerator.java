
/**
 * Bird generator
 * Will randomly generate a bird from the prepopulated types of birds - the selection has a variety
 * of birds from the assignment description as well as some additional ones.
 *
 * This will mimic the birds being "captured" to be placed into the conservatory.
 */

public class BirdGenerator {

  //predators
  Birds eagle = new Birds ("eagle","USA", "rodents, fish", "Eagles are " +
          "large, powerfully built birds of prey, with heavy heads and beaks."
          , true, true, false);

  Birds hawk = new Birds ("hawk", "North America", "rodents, fish, snakes",
          "mainly woodland birds with long tails and high visual acuity. "
          , true, true, false);

  Birds osprey = new Birds ("osprey", "South America", "fish",
          "is a diurnal, fish-eating bird of prey"
          , true, true, false);

  Birds owl = new Birds ("owl", "Global", "fish, rodents",
          "distinguished by facial disks that frame the eyes and bill"
          , true, true, false);

  //pigeon
  Birds pigeon =  new Birds ("rock dove","Global", "seeds, nuts, grains" ,
          "The world's oldest domesticated bird"
          , false, true, false);

  //extinct
  Birds greatAuk =  new ShoreBirds ("greatAuk","N/A", "fish, crustaceans",
          "is a species of flightless alcid that became extinct in the mid-19th century"
          , false, false, true, "N/A");

  Birds dodo =  new ShoreBirds ("dodo","island of Mauritius", "nuts, seeds, bulbs, and roots",
          "is a species of flightless alcid that became extinct in the mid-19th century"
          , false, false, true, "N/A");

  Birds kiwi =  new Birds ("kiwi","New Zealand", "insect and plants",
          "is a species of flightless alcid that became extinct in the mid-19th century"
          , false, false, true);
  //flightless
  Birds emus =  new Birds ("emus","Australia", "seeds, nuts",
          "Emus are soft-feathered, brown birds with long necks and legs, and can reach up to 1.9 metres"
          , false, false, false);

  Birds ostrich =  new Birds ("ostrich","Africa", "seeds, nuts, fruit, grass",
          "the largest living bird species"
          , false, false, false);


  //flightless and shorebird
  Birds penguin =  new ShoreBirds ("penguin","Southern hemisphere", "" +
          "fish, krill","adorable, aquatic flightless birds",
          false, false, false, "Antarctica Coast");

  //Shorebirds
  Birds hornedPuffin =  new ShoreBirds ("hornedPuffin","North Pacific",
          "fish, crustaceans", "a pelagic seabird that feeds primarily " +
          "by diving for fish", false, true, false, "British Columbia Coast");


  //parrot
  Birds parrot1 = new Parrot("Parrot", "South America", "seeds, fruits, nuts",
          "Parrots have a short, curved beak and are known for their intelligence and " +
                  "ability to mimic sounds.", false, true, false, 10,
          "Hello World");

  Birds parakeet = new Parrot("parakeet", "South America", "seeds, fruits, nuts",
          "parrots of small size, slender build, and long, tapering tails",
          false, true, false, 5,
          "I hate being a pet");


  //Waterfowl
  Birds duck2 = new Waterfowl("duck", "Global", "fish, algae, bugs",
          "mostly aquatic birds, and may be found in both fresh water and sea water",
          false, true, false, "rivers, lakes, coasts");

  Birds goose = new Waterfowl("Canadian Goose", "arctic and temperate regions of North America", "fish,insects",
          "large wild goose with a black head and neck, white cheeks, white under its chin, and a brown body.",
          false, true, false, "great lakes region");

  Birds[] listOfBirds = new Birds[]{eagle, hawk, osprey, owl, pigeon, greatAuk, hornedPuffin,
          penguin, kiwi, emus,ostrich, parrot1, parakeet, duck2, goose};



  public Birds randBird (){
    int min = 0;
    int max = listOfBirds.length - 1;
    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
    return listOfBirds[random_int];

  }







}
