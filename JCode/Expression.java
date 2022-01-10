package JCode;

public class Expression {
    public static void main(String[] args) {
        // expression = operands & operators 
        // oparands = values, variables, numbers, quantity
        // oparetors = + - * / % 

        double friends = 10;

        friends --; 
        System.out.println(friends);
        friends ++; 
        System.out.println(friends);
        --friends; 
        System.out.println(friends);
        ++friends; 
        System.out.println(friends);

        
        friends = (Double) friends / 3;
        System.out.println(friends);
    }
}
