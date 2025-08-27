
import java.util.Random;

public class Dado {
    private int[] lados = {1,2,3,4,5,6};

    public int girar(){
        Random random = new Random();
        int numerorandomico = random.nextInt(6);
        return lados[numerorandomico];
    }
}
