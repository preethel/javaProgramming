package JCode;

import java.util.Scanner;

public class Operator {

    public static void main(String[] args) {
        //logical operators = used to connect two or expression 


        //------example--------

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the temp.");
        int temp = scan.nextInt(); 
        if(temp>30){
            System.out.println("It is hot outside");
        }
        else if(temp>=20 && temp<=30){
            System.out.println("It is warm");
        }
        else{
            System.out.println("It is hot");
        }


        //------example--------

        Scanner scanner = new Scanner(System.in);


        System.out.println("For quit press Q or q");
        String response = scanner.next();


        if(response.equals("q") || response.equals("Q")){
            System.out.println("You quit the game.");
        }
        else{
            System.out.println("You are playing the game");
        }

        scan.close();
        scanner.close();
    }
}
