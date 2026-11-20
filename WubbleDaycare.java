public class WubbleDaycare {
   //instance variables
   private String nameOfDaycare;
   private int numOfWubbles;
   private boolean beenFed;
   private double amountOfFood;
   private double budget;
   private int amountOfToys;
   
   //constructors
   public WubbleDaycare(String nameOfDaycare, int numOfWubbles, boolean beenFed, double amountOfFood, double budget, int amountOfToys) {
      this.nameOfDaycare = nameOfDaycare;
      this.numOfWubbles = numOfWubbles;
      this.beenFed = beenFed;
      this.amountOfFood = amountOfFood;
      this.budget = budget;
      this.amountOfToys = amountOfToys;
   }
   
   public WubbleDaycare() {
      nameOfDaycare = "Wibbly Wobbly";
      numOfWubbles = 50;
      beenFed = true;
      amountOfFood = 100.0;
      budget = 300.0;
      amountOfToys = 10;
   }
   
   //methods
   public int wubbleDroppedOff(int amountDroppedOff) {
      numOfWubbles += amountDroppedOff;
      System.out.println("Wubbles have been dropped off. There is now " + numOfWubbles + " wubbles");
      return numOfWubbles;
   }
   
   public void feedWubbles() {
      if (!beenFed) {
         amountOfFood -= numOfWubbles * 2;
         System.out.println("All the wubbles have been fed.");
         System.out.println("You now have " + amountOfFood + " grams of food");
      }
   }
   
   public void buyFood(double gramsOfFoodWanted) {
      amountOfFood += gramsOfFoodWanted;
      budget -= gramsOfFoodWanted * 0.5;
      System.out.println("You now have spent $" + gramsOfFoodWanted * 0.5 + ". You now have $" + budget);
      System.out.print("You now have " + amountOfFood + " grams of food");
   }
   
   public void wubblePickedUp(int amountPickedUp) {
      numOfWubbles -= amountPickedUp;
      System.out.print("There is now " + numOfWubbles + " wubbles in your daycare.");
   }
   
   public void buyToy(int amountOfToysWanted) {
      budget -= amountOfToysWanted * 5;
      System.out.println("You now have $" + budget + ", and " + amountOfToys + " toys.");
   }
}
      