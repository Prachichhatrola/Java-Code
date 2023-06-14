public class Practical_09 {
    public static void main(String[] args) {
        double sum = 0;

        while (sum <= 20) {
            double randomNumber = Math.random();
            sum += randomNumber;
            System.out.println("Generated number: " + randomNumber);
            System.out.println("Running sum: " + sum);
            System.out.println("-------------------");
        }

        System.out.println("Sum exceeded 20. Terminating the program.");
    }
}
