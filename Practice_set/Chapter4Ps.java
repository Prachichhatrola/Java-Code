import java.util.Scanner;

public class Chapter4Ps {
    public static void main(String[] args) {
        //Problem 1 : What will be the output of this program:
        int a = 10;
        if(a=11)
        System.out.println("I am 11");
        else
        System.out.println("I am not 11");

        int a = 11;
        if(a=11){    //Through an error

        }

        //Problem 2: Write a program to find out whether a student is pass or fail; if it requires total 40% and at least 33% in each subject to pass. assume 3 subjects and take marks as input from the user.
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in physics");
        m1 = sc.nextByte();

        System.out.println("Enter your marks in chemistry");
        m2 = sc.nextByte();

        System.out.println("Enter your marks in mathematics");
        m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Overall percentage is: " + avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations, You have been promoted!");
        }
        else{
            System.out.println("Sorry, You have not been promoted! Please try again.");
        }

        //Problem 3 : Calculate income tax paid by an employee to the government as per the slabs mentioned below:
        //     income slab     Tax
        //     2.5L - 5.0L     5%
        //     5.0L - 10.0L    20%
        //     Above 10.0L     30%
        // Note that there is no tax below 2.5L. Take input amount as an input from the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in Lakhs per annum");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<2.5){
            tax = tax + 0;
        }
        else if(income>2.5f && income<=5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income>5f && income<=10f){
            tax = tax + 0.05f * (0.5f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(income>10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        // }
        System.out.println("The total tax paid by the employeee is: " +tax);

        //Problem 4 : Write a java program to find out the day of the week given the number [1 for monday, 2 for tuesday ... and so on!].
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
            default:
            System.out.println("Invalid choise");
          }

        //Problem 5 : Write a java program to find whether a year entered by the user is a leap year not.
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a year");
       int year=sc.nextInt();
       if(year%400==0){
        System.out.println("This year is a leap year");
       }
       else if(year%4==0){
        System.out.println("This year is a leap year");
       }
       else{
        System.out.println("This year is not a leap year");
       }
    
        //Problem 6 : Write a program to find out the type of website from the url
         .com -> Commercial website
         .org -> organization website
         .in -> indian website
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("This is an organization website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is an commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian website");
        }
        
        }
    }

