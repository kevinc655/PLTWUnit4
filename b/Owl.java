public class Owl extends Bird {
    public Owl(String food, boolean nocturnal, double aveLifeSpan){
        super(food, nocturnal, aveLifeSpan);
        System.out.println("The new arrival is an owl!");
    }
    public Owl(){}

    public void speak(){
        System.out.println("The owl screeches");
    }

    public void hunt(){
        System.out.println("The owl hunts");
    }
    
}
