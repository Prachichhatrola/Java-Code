import java.util.Random;

public class GenerateRandomNumbers {
    public static void main(String[] args) {
        int[] randomNumbers = generateRandomNumbers(10, 1, 100);

        System.out.print("Random numbers: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
    }

    public static int[] generateRandomNumbers(int size, int min, int max) {
        Random random = new Random();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(max - min + 1) + min;
        }

        return numbers;
    }
}
