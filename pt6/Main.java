
public class Main {
    public static void main(String[] args) {

        int rows = 10;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print("-");
            }
            System.out.print("*");

            for (int k = 1; k < 2 * (i - 1); k++) {
                System.out.print(" ");
            }
            
            

            if (i != 1) {
                System.out.print("*");
            }
            
            for (int c = rows; c > i; c--) {
                System.out.print("-");
            }
            
            System.out.println("");
        }

        
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int k = 1; k < 2 * (i - 1); k++) {
                System.out.print(" ");
            }
            
            if (i != 1) {
                System.out.print("*");
            }
            
            for (int c = rows; c > i; c--) {
                System.out.print("-");
            }
            
            System.out.println("");
        }
    }
}