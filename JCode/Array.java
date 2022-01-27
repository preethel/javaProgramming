package JCode;

import java.util.Scanner;

public class Array {
    
    //arry = used to store multiple values in a single variable
    public static void main(String[] args) {

    
    
        String[] names = {"Redwan","Azam","Ziddi"}; //declaration array

        System.out.println(names[0]+","+names[1]); //printing with index 

        for(int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }

        //input from user 

        System.out.println("How many names do you want to enter?");
        Scanner scan = new Scanner(System.in);

        int length = scan.nextInt();
        
        String[] name = new String[length];

        for(int i=0; i<length; i++){
            System.out.println("Enter "+(i+1)+" Index:");
            name[i] = scan.next();
        }

        for(int i=0; i<length; i++){

            System.out.println(
                "Index "+(i+1)+": "+name[i]
            );
        }
        scan.close();
    }

}
