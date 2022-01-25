package JCode;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
       double x, y;

       Scanner scan = new Scanner(System.in);

       System.out.println("Calculator");
       
       x = scan.nextDouble();

       char c = scan.next().charAt(0);

       switch(c){
           case '+': 
           
           y = scan.nextDouble();
           System.out.println(x+y);
           break;
           case '-': 

           y = scan.nextDouble();
           System.out.println(x-y);
           break;
           case '*': 
           
           y = scan.nextDouble();
           System.out.println(x*y);
           break;
           case '/': 
           
           y = scan.nextDouble();
           System.out.println(x/y);
           break;
           case '%': 
           
           y = scan.nextDouble();
           System.out.println(x%y);
           break;
       }
       
       

    scan.close();

        
    }
}
