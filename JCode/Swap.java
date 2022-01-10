package JCode;

public class Swap {
    public static void main(String[] args) {
        int x = 10; //initialed a variable and stored a value, it can be any type of variable
        int y = 20; // initialed an another variable and stored a value, it can be any type of variable 

        int temp = 0; // initialed an another variable for temporary variable which contains a temporary variable 
        //now we swap the value x into y, and y into x 

        temp = x; // here we stored x variable into temp
        x = y; // here we stored y variable into x
        y = temp; // here we stored temp variable into y, which was stored in x

        System.out.println("x="+x+"\ny="+y);
    }
    
}
