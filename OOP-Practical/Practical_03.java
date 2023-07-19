// 3: Write a program that displays the value of 2 raised to the power 12.

public class Practical_03 {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 12;

        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("2 raised to the power of 12 is: " + result);
    }
}


