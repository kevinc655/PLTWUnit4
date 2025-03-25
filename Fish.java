/*
 * Activity 4.9.3
 */
public class Fish extends LakeObject
{
    @Override
    public int getCost(){
        return super.getCost()*super.getWeight();
    }
    @Override
    public String say(){
        return "You caught a fish!";
    }

}