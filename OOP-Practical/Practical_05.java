/*5: Write a program to print following triangle with character ‘A’ for n rows, n is to be passed as command line argument.
A  A A A
A  A A 
A A
A */

public class Practical_05 {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("A ");
            }
            System.out.println("");
        }
    }
}

