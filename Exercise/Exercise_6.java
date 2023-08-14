package com.company;

import java.util.InputMismatchException;

import java.util.Scanner;

class InvalidInputException extends InputMismatchException {

    @Override

    public String toString() {

        return "Not a valid operation";

    }

    @Override

    public String getMessage() {

        return "Pls enter a valid operation";

    }

}

class ZeroException extends ArithmeticException {

    @Override

    public String toString() {

        return "Cannot divide by 0";

    }

    @Override

    public String getMessage() {

        return "Enter a number other than 0";

    }

}

class MaxInputException extends InputMismatchException {

    @Override

    public String toString() {

        return "Number can't exceed 100000";

    }

    @Override

    public String getMessage() {

        return "Pls enter a number <= to 100000";

    }

}

class MaxMultiplierReachedException extends ArithmeticException {

    @Override

    public String toString() {

        return "Cannot multiply by a number > 7000";

    }

    @Override

    public String getMessage() {

        return "Pls enter a number <=7000";

    }

}

public class Exercise_6 {

    public static void main(String[] args) {

        int a, b;

        long sol;

        char op;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");

        a = sc.nextInt();

        b = sc.nextInt();

        if (a > 100000 || b > 100000)

            throw new MaxInputException();

        System.out.println("Enter the operation sign: ");

        op = sc.next().charAt(0);

        switch (op)

        {

            case '+':

                sol = a + b;

                break;

            case '-':

                sol = a - b;

                break;

            case '/':

                if (b == 0)

                    throw new ZeroException();

                else

                    sol = a / b;

                break;

            case '*':

                if (a > 7000 || b > 7000)

                    throw new MaxMultiplierReachedException();

                else

                    sol = a * b;

                break;

            default:

                throw new InvalidInputException();

        }

        System.out.println("The ans is: " + sol);

    }

}

