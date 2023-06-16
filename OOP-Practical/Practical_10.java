/*10: Write an application that generates the first 15 numbers in the Fibonacci series.  */

public class Practical_10 {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1)
            return n;
        else {
            int x = fibonacci(n - 1) + fibonacci(n - 2);
            return x;
        }
    }

    public static void main(String[] args) {

        int fibonacci_len = 15;
        System.out.print("Fibonacci Series of " + fibonacci_len + " numbers is: \n");

        for (int i = 0; i <= fibonacci_len; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
