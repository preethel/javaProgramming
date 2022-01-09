package JCode;
public class DataType {
    public static void main(String[] args) {
        boolean a = true; //it can be false, it takes 1 bit
        byte b = 1; // it can be -128 to 127 ingteger value, it takes 1 byte
        short c = 10; // it can be -32,768 to 32,767 integer type valu, it takes 2 byte
        int d = 100; // it can be -2 billion to 2 billion integer type value, it takes 4 byte
        long e = 1000; // it can be -9 quintillion to 9 quintillion integer value, takes 8 bytes 

        float f = 3.141592f; // it is primitive variable also and the fractional number up to 6-7 digits, it takes 4 byte 
        double g = 3.141592653589793; // it contain fractional up to 15 digits, it takes 8 bytes

        char h = 'a'; // it contain only one character type variable, takes 2 bytes
        String name = "Redwan"; // it is references variable and contain paragraph like group of characters

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(name);

        
    }
}
