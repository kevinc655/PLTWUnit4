public class Penguin extends Bird {
    public Penguin(String food, boolean nocturnal, double aveLifeSpan){
        super(food, nocturnal, aveLifeSpan);
        System.out.println("The new arrival is a penguin!");
    }
    public Penguin(){}

    public void speak(){
        System.out.println("The penguin squawks");
    }

    public void fish(){
        System.out.println("The penguin fishes");
    }
}
