import java.util.Scanner;

public class Chapter1PS {
    public static void main(String[] args) {
        
    //1. Write a program to sum three numbers in java

    int num1 = 6;
    int num2 = 5;
    int num3 = 7;
    int sum = num1 + num2+ num3;
    System.out.println(sum);

    //2. Write a program to calculate CGPA using marks of three subjects (out of 100).

    float subject1 = 45;
    float subject2 = 95;
    float subject3 = 48;
    float cgpa = (subject1 + subject2 + subject3)/30;
    System.out.println(cgpa);

    //3. Write a java program which asks the user to enter his/her name and greets them with "Hello <name>, have a good day" text.

    System.out.println("What is your name");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();
    System.out.println("Hello " + name + " have a good day!");

        scanner.close();

    //4. Write a java program to convert kilometers to miles.

    Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometers = input.nextDouble();

        double miles = kilometers / 1.609;

        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");

        input.close();

    //5. Write a java program to detect whether a number entered by the user is integer or not. 

    System.out.println("Enter your number");
    Scanner scanner1 = new Scanner(System.in);
    System.out.println(scanner1.hasNextInt());

        scanner1.close();

    }
}
