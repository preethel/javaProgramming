package JCode;

import java.util.Random;
import java.util.Scanner;

public class LoopDo {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int temp;
        int result=0;
        System.out.println("Make sure you are not Robot.");
        do{
            int x = rand.nextInt(30)+1;
            System.out.println("\n"+x);

            System.out.println("+");

            int y = rand.nextInt(20)+1;
            System.out.println(y);

            System.out.println("-----");
            temp = x+y;
            result = scan.nextInt();
            
        }while(result!=temp);

        System.out.println("Thank you!");
        scan.close();
        
    }
    
}
