package JCode;

import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        //while loop = execute a block of code as long as a it's condition remains true

        Scanner scan = new Scanner(System.in);

        String name = "";

        while(name==""){
            System.out.println("Enter Your name:");
            name = scan.nextLine();
        }
        System.out.println("Hi "+name);

        scan.close();
    }
}
