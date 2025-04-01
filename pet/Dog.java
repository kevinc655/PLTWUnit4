/* 
 * Activity 4.9.3
 */
public class Dog extends Pet
{
  public Dog(String name)
  {
    super(name);
  }
  
  @Override
  public void speak()
  {
    System.out.println("bark!");
  }
}