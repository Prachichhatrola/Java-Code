import java.util.Scanner;
public class Chapter2PS {
    public static void main(String[] args) {
        
    /*Q.1 : What will be the result of the following expression 
        float = 7/4*9/2  */

    float a = 7/4.0f*9/2.0f;
    System.out.println(a);

    /*Q.2 : Write a java program to enerypt a grade by adding 8 to it. decrypt it to show the correct grade.*/

    char grade = 'B';
    grade = (char)(grade + 8);
    System.out.println(grade);
    //Decrypting the grade
    grade = (char)(grade - 8);
    System.out.println(grade);

    /*Q.3 : Use comparison operators to find out whether a given number is greater than the user enterd number or not.*/

    Scanner scanner = new Scanner(System.in);
    int p = scanner.nextInt();
    System.out.println(p>8);

        scanner.close();

    /*Q.4 : Write the following expression in a java program:
      (v^2 - u^2)/2as*/

    float a=2,s=2,v=8,u=2;
    float exp = (v*v-u*u)/(2*a*s);
    System.out.println(exp);

    /*Q.5 : Find the value of the following expression:
      int x = 7
      int a =7.49/7+35/7
      value of a ?*/

    System.out.println(7*49/7+35/7);
    
    }
}
