package JCode;

import java.util.Scanner;

public class MathClass {

    public static void main(String[] args) {
        double x = 3.14;
        double y = -12;
        double z = Math.min(x, y);

        System.out.println(z);
        System.out.println("Absolute value:"+Math.abs(1233.867));
        System.out.println("Floor value: "+Math.floor(43.9));
        System.out.println("Floor ceil: "+Math.ceil(43.9));
        System.out.println("Next Down: "+Math.nextDown(43));
        System.out.println("cos 90: "+Math.cos(180));
        System.out.println("Pi: "+Math.PI);


        //hypotenuse 

        Scanner scan = new Scanner(System.in);

        System.out.println("-----Hypotenuse------");
        System.out.println("Enter side X:");

        double a = scan.nextDouble();

        System.out.println("Enter side Y:");
        double b = scan.nextDouble();

        double c = Math.sqrt((a*a)+(b*b));

        System.out.println("The hypotenuse is : "+c);
        
        scan.close();


        
    }
    
}
