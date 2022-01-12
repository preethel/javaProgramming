package JCode;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random();

        int x;
        do{
        x = random.nextInt(9);
        System.out.println(x);
        }while (x>0);

       
        
    }
}
