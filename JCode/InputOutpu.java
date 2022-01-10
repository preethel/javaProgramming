package JCode;

import java.util.Scanner;

public class InputOutpu {

        public static void main(String[] args) {
            System.out.println("What is your name?");//display ta massage under double cotation ""
            Scanner scan = new Scanner(System.in);
    
            String name = scan.nextLine();//scanner started but dosen't stopped 
    
            System.out.println("What is your age?");
            int age = scan.nextInt();//in this case we scan the integer number so we dont need nextLine() break
    
            System.out.println("What is your address?");
            //Here we scan a new string so at frist start scan.nextLine()
            scan.nextLine();
    
            String address = scan.nextLine();
            //Here we display the information via taking inputs from user
            System.out.println("Hi, "+name+"\nYou are"+age+ "years old"+"\nYou are from "+address);
    
    
    
            scan.close();//Here we should use close() for closing the scanning process
    
    
            
        }
    
}
