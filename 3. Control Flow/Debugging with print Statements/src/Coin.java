import java.util.Random;

public class Coin {
    public final static int Heads=0;
    public final  static int Tails=1;

    private int faceUp;

    public Coin(){
        flip();
    }
    public void flip(){
        Random rand=new Random();
        faceUp=rand.nextInt(2);
    }
    public String getFaceUp(){
        if(faceUp==Heads){
            return "Heads";
        }
        else if(faceUp==Tails){
            return "Tails";
        }
        else{
            return "Invalid";
        }
    }
}
