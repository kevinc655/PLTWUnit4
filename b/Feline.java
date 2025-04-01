public class Feline extends Animal {
    public Feline(String food, boolean nocturnal, 
    double aveLifeSpan)
    {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("The new arrival is a feline!");
    }
    public Feline(){}
    
    public void speak(){
        roar();
    }

    public void roar(){
        System.out.println("The feline roars");
    }
    
    public void growl(){
        System.out.println("The feline growls");
    }
}
