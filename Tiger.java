public class Tiger extends Feline {
    public Tiger(String food, boolean nocturnal, double aveLifeSpan){
        super(food, nocturnal, aveLifeSpan);
        System.out.println("The new arrival is a tiger!");
    }

    public Tiger(){}
    
    public void huntAlone(){
        System.out.println("The tiger hunts alone");
    }

    public void swim(){
        System.out.println("The tiger swims");
    }
}
