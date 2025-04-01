/*
 * Activity 4.9.2
 */

import java.util.ArrayList;

public class ZooKeeperRunner
{
  public static void main(String[] args)
  { 
    ArrayList<Animal> zoo = new ArrayList<Animal>();
    zoo.add(new Elephant());
    zoo.add(new Deer());
    zoo.add(new Giraffe());
    zoo.add(new Gorilla());
    zoo.add(new Hippo());
    zoo.add(new Lion());
    zoo.add(new Monkey());
    zoo.add(new Owl());
    zoo.add(new Penguin());
    zoo.add(new Tiger());

    for (Animal animal: zoo){
      animal.speak();
    }

    // Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
    // elephant.trumpet();
    // elephant.eat();

    // Tiger tiger = new Tiger("meat", true, 17.0);
    // tiger.swim();
    // tiger.huntAlone();
    // tiger.eat();

    // Gorilla gorilla = new Gorilla();

    // Giraffe giraffe = new Giraffe("leaves", false, 25.0);
    // giraffe.eat();

    // Hippo hippo = new Hippo();
    // hippo.eat();

    // Penguin penguin = new Penguin();
    // penguin.fish();
    // Owl owl = new Owl();
    // owl.hunt();
    // Owl owl2 = new Owl("mice,insects", true, 4.0);
    // owl2.eat();

  }
}