// Initial attempt did not use.

//public class Bird {
//  private String name;
//  private Boolean predator;
//  private Boolean flight;
//  private Boolean extinct;
//  private Boolean waterFowl;
//  private Boolean shorebird;
//  private Boolean parrot;
//  private String location;
//  private String diet;
//  private String description;
//
//  //number of wings?? why bother
//
//  public String getName() {
//    return name;
//  }
//
//  public void setName(String name) {
//    this.name = name;
//  }
//
//  public Boolean getPredator() {
//    return predator;
//  }
//
//  public void setPredator(Boolean predator) {
//    this.predator = predator;
//  }
//
//  public Boolean getFlight() {
//    return flight;
//  }
//
//  public void setFlight(Boolean flight) {
//    this.flight = flight;
//  }
//
//  public Boolean getExtinct() {
//    return extinct;
//  }
//
//  public void setExtinct(Boolean extinct) {
//    this.extinct = extinct;
//  }
//
//  public Boolean getWaterFowl() {
//    return waterFowl;
//  }
//
//  public void setWaterFowl(Boolean waterFowl) {
//    this.waterFowl = waterFowl;
//  }
//
//  public Boolean getShorebird() {
//    return shorebird;
//  }
//
//  public void setShorebird(Boolean shorebird) {
//    this.shorebird = shorebird;
//  }
//
//  public Boolean getParrot() {
//    return parrot;
//  }
//
//  public void setParrot(Boolean parrot) {
//    this.parrot = parrot;
//  }
//
//  public String getLocation() {
//    return location;
//  }
//
//  public void setLocation(String location) {
//    this.location = location;
//  }
//
//  public String getDiet() {
//    return diet;
//  }
//
//  public void setDiet(String diet) {
//    this.diet = diet;
//  }
//
//  public String getDescription() {
//    return description;
//  }
//
//  public void setDescription(String description) {
//    this.description = description;
//  }
//
//
//  //recommendation to track parrot saying?
//
//  public Bird(String name, Boolean predator, Boolean flight, Boolean extinct,
//              Boolean waterFowl, Boolean shorebird, Boolean parrot,
//              String location, String diet, String description) {
//    this.name = name;
//    this.predator = predator;
//    this.flight = flight;
//    this.extinct = extinct;
//    this.waterFowl = waterFowl;
//    this.shorebird = shorebird;
//    this.parrot = parrot;
//    this.location = location;
//    this.diet = diet;
//    this.description = description;
//  }
//
//  public Bird(String name) {
//    this.name = name;
//    this.predator = false;
//    this.flight = false;
//    this.extinct = false;
//    this.waterFowl = false;
//    this.shorebird = false;
//    this.parrot = false;
//    this.location = "location";
//    this.diet = "diet";
//    this.description = "description";
//  }
//
//  @Override
//  public String toString() {
//    return "Bird{" +
//            "name='" + name + '\'' +
//            ", location='" + location + '\'' +
//            ", diet='" + diet + '\'' +
//            ", description='" + description + '\'' +
//            '}';
//  }
//}


//  //predators
//  Bird eagle = new Bird ("eagle", true, true, false, false,
//          false,false,"USA", "rodents, fish", "Eagles are " +
//          "large, powerfully built birds of prey, with heavy heads and beaks.");
//
//  Bird hawk = new Bird ("hawk", true, true, false, false,
//          false,false,"North America", "rodents, fish, snakes",
//          "mainly woodland birds with long tails and high visual acuity. ");
//
//  Bird osprey = new Bird ("osprey", true, true, false, false,
//          false,false,"South America", "fish",
//          "distinguished by facial disks that frame the eyes and bill");
//
//  Bird owl = new Bird ("owl", true, true, false, false,
//          false,false,"Global", "fish, rodents",
//          "is a diurnal, fish-eating bird of prey");
//
//  //pigeon
//  Bird pigeon =  new Bird ("pigeon", false, true, false, false,
//          false,false,"Global", "seeds, nuts" ,
//          "he world's oldest domesticated bird");
//
//  //extinct
//  Bird greatAuk =  new Bird ("greatAuk", false, false, true, false,
//          true,false,"N/A", "seeds, nuts",
//          "is a species of flightless alcid that became extinct in the mid-19th century");
//
//
//  //Shorebirds
//  Bird hornedPuffin =  new Bird ("hornedPuffin", false, true, false,
//          false, true,false,"North Pacific", "fish, crustaceans",
//          "a pelagic seabird that feeds primarily by diving for fish");
//
//  //flightless
//  Bird kiwi =  new Bird ("kiwi", false, true, false, false,
//          false,false,"New Zealand", "seeds, nuts",
//          "is a species of flightless alcid that became extinct in the mid-19th century");
//
//
//  //parrots
//  Bird parrot = new Bird ("parrot", false, true, false, false,
//          false,true, "South America", "fruit",
//          "Parrots have a short, curved beak and are known for their intelligence and " +
//                  "ability to mimic sounds.");
//
//  Bird parakeet = new Bird ("parakeet", false, true, false, false,
//          false,true, "South America", "fruit",
//          "small to medium-sized species of parrot");
//
//  //waterfowl
//  Bird duck = new Bird ("duck", false, true, false, true,
//          false,false, "Every body of water", "grasses, aquatic plants, fish",
//          "mostly aquatic birds, and may be found in both fresh water and sea water");
//
////    parrot.parrotBird(parrot, "hello world");
////    Bird[] listOfBirds = new Bird[]{eagle, hawk, osprey, owl, pigeon, greatAuk, hornedPuffin,
////            kiwi, parrot, parakeet, duck};
////
//
//
////    System.out.println(eagle);