package JCode;

public class TwoDArray {
    public static void main(String[] args) {
        // 2D array = an array of arrays

        String[][] names = new String[3][3];

    
        //it declaring rows length 3 and collums length 3 

        names[0][0] = "Ziddi1";
        names[0][1] = "Ziddi2";
        names[0][2] = "Ziddi3";
        names[1][0] = "Ziddi4";
        names[1][1] = "Ziddi5";
        names[1][2] = "Ziddi6";
        names[2][0] = "Ziddi7";
        names[2][1] = "Ziddi8";
        names[2][2] = "Ziddi9";
        

        /*
                Ziddi1 Ziddi2 Ziddi3 
                Ziddi4 Ziddi5 Ziddi6
                Ziddi7 Ziddi8 Ziddi9

        */

        for(int i=0; i<names.length; i++){
            for(int j=0; j<names[i].length; j++){
                System.out.printf(names[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
