package CSC2HW4;
import java.util.Random;

public class Tools {
    public static int randomNum(){
        Random rand = new Random();
        int num = rand.nextInt(10);
        return num;
    }
}
