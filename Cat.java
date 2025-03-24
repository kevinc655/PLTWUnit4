/* 
 * Activity 4.9.3
 */
public class Cat extends Pet
{
  public Cat(String name)
  {
    super(name);
  }

  @Override
  public void speak()
  {
    System.out.println("meow!");
  }
  
}