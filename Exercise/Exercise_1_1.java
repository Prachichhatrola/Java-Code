//Write a program to calculate percentage of a given student in CBSE board exam. his marks from 5 subjects must be taken as input from the keyboard(Marks are out of 100).

import java.util.Scanner;
public class Exercise_1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter subject 1 marks:");
        int a = sc.nextInt();
        System.out.println("Enter subject 2 marks:");
        int b = sc.nextInt();
        System.out.println("Enter subject 3 marks:");
        int c = sc.nextInt();
        System.out.println("Enter subject 4 marks:");
        int d = sc.nextInt();
        System.out.println("Enter subject 5 marks:");
        int e = sc.nextInt();
        int percentage = (a+b+c+d+e)/5;
        System.out.println("The percentage of these marks is");
        System.out.println(percentage);
    }
}

