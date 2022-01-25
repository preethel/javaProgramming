package JCode;

import java.util.Scanner;

class LogicalOparator{
    public static void main(String[] args) {
        //&& (AND) both must be true
        //|| (OR) one must be true
        //! (NOT) reverses boolean values of conditions
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter Your age:");
    int age = scan.nextInt();

    if(age<18){
        System.out.println("Your are Teenager.");
    }
    else if(age>=18 && age<70){
        System.out.println("You are adult.");
        
    }
    else{
        System.out.println("Hi boomber.");
    }


        scan.close();
    }
}