/*8: Write a program that outputs a table of numbers. Each line in the table contains three entries: the number, its square, and its cube. Begin with 1 and end with 10. */

public class Practical_08 {
    public static void main(String[] args) {
        System.out.println("Number\tSquare\tCube");

        for (int number = 1; number <= 10; number++) {
            int square = number * number;
            int cube = number * number * number;

            System.out.println(number + "\t" + square + "\t" + cube);
        }
    }
}
