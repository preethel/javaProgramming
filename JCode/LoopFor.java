package JCode;

import java.util.Scanner;

public class LoopFor {
    
    public static void main(String[] args) {
        // for loop = execute a block of code a limited amount of times

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter a number of Printing your msg.");
        int n = scan.nextInt();

        scan.nextLine();
        System.out.println(
        "Please Enter Your massage"
        );

        String msg = scan.nextLine();

        for(int i=0; i<=n; i++){
            System.out.println(msg);
            for(int j=10; j>=0; j-=2){
                System.out.println(j);
            }
        }
        System.out.println("Happy New Year");
        

        
        scan.close();
    }
}
