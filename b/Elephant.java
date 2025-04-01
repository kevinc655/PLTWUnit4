public class Elephant extends Animal {
    public Elephant(String food, boolean nocturnal, 
                double aveLifeSpan)
    {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("The new arrival is an elephant!");
        
    }
    public Elephant(){}

    public void speak(){
        trumpet();
    }
    public void trumpet(){
        System.out.println("The elephant trumpets");
    }

    public void forage(){
        System.out.println("The elephant forages");
    }
}
