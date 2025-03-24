/*
 * Activity 4.9.2
 */
public class Hooved extends Animal
{
  public Hooved(String food, boolean nocturnal, 
                double aveLifeSpan)
  {
      super(food, nocturnal, aveLifeSpan);
      System.out.println("The new arrival is a hooved animal!");
      
  }
  public Hooved(){}
  public void forage()
  {
    System.out.println("The hooved animal forages for food.");
  }
}