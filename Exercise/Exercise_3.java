import java.util.Scanner;
import java.util.Random;

public class Exercise_3 {
    public static void main(String[] args) {

        /*
         * Create a class Game, which allows a user to play "Guess the Number" game
         * once. Game should have the following methods:
         * 1. Constructor to generate therandom number
         * 2. takeUserInput() to take a user input of number
         * 3. isCorrectNumber() to detect whether the number ended by the useris true
         * 4. getter and setter for noOfGuesses
         * Use Properties such as noOfGuesses(int), etc to get this task done!
         */

        Game myGame = new Game();

        boolean playGame = true;

        int userNumber;

        while (playGame == true) {

            userNumber = myGame.takeUserInput();

            boolean myBool = myGame.isCorrectNumber(userNumber);

            if (myBool == true) {

                System.out.print("Guessed in ");

                myGame.getNumberOfGuesses();

                System.out.print(" Guesses");

                System.out.println("");

                playGame = false;

                break;

            }

            else {

                playGame = true;

            }

        }

    }

}

class Game {

    private int computerNumber;

    private int numberOfGuesses = 0;

    Scanner sc = new Scanner(System.in);

    Random rn = new Random();

    public Game() {

        computerNumber = rn.nextInt(101);

    }

    public int takeUserInput() {

        System.out.println("Guess the number (1-100) : ");

        int userNumber = sc.nextInt();

        return userNumber;

    }

    public boolean isCorrectNumber(int myNum) {

        int flag = 0;

        if (myNum <= 100 && myNum >= 0) {

            setNumberOfGuesses();

            if (myNum == computerNumber) {

                System.out.println("You guessed it right. The number is " + myNum);

                flag = 1;

                sc.close();

            }

            else if (myNum < computerNumber) {

                System.out.println("Your number is less than the actual number");

            }

            else if (myNum > computerNumber) {

                System.out.println("Your number is greater than the actual number");

            }

        }

        else {

            System.out.println("Please enter in range 0-100");

        }

        if (flag == 1) {

            return true;

        }

        else {

            return false;

        }

    }

    public void setNumberOfGuesses() {

        numberOfGuesses++;

    }

    public void getNumberOfGuesses() {

        System.out.print(numberOfGuesses);

    }

}
