/*
 * Activity 4.9.3
 */
public class Boot extends LakeObject
{
    public Boot(){
        super.setCost(0);
    }
    @Override
    public String say(){
        return "You caught a boot!";
    }

    @Override
    public boolean wasCaught(Hook h){
        return true;
    }

}
