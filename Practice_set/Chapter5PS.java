public class Chapter5PS {
    public static void main(String[] args) {
        //Problem 1 : Write a program to print the following pattern
        //* * * *
        //* * *
        //* *
        //*

        int p = 4; 
        for(int i=p; i>0; i--){
            for(int j=0;j<i;j++){
            System.out.print("*");
        }
            System.out.print("\n");
        }

        //Problem 2: Write a program to sum first n even numbers using for loop.

        int sum =0;
        int n=3;
        for(int i=0;i<n;i++){
            sum = sum + (2*n);
        }
        System.out.println("Sum of even numbers is: ");
        System.out.println(sum);

        //Problem 3 : Write a program to print multiplication table of a given number n.

        int m = 5;
        for(int k=1; k<=10; k++){
            System.out.printf("%d * %d = %d\n", m, k, m*k);
        }

        //Problem 4 : Write a program to print multiplication table of 10 in reverse order.

        int q = 10;
        for(int r=10; r>=1; r--){
            System.out.printf("%d * %d = %d\n", q, r, q*r);
        }

        //Problem 5 : Write a program to find factorial of a given number using for loop.

        int h,fact=1;
        int number = 5;
        for(h=1;h<=number;h++){
            fact=fact*h;
        }
        System.out.println("Factorial of "+number+" is: "+fact);

        //Problem 6 : Repeat 5 using while loop.

        int a = 5;
        int g = 1;
        int factorial = 1;
        while(g<=a){
            factorial *= g;
            g++;
        }
        System.out.println(factorial);

        //Problem 7 : Repeat 1 using for/while loop.

        //Problem 8 : What can be done using one type of loop can also be done using the other two types of loops - True or False. --> True

        //Problem 9 : Write a program to calculate the sum of the numbers occuring in the multiplication table of 8.

        int e = 8;
        for(int k=1; k<=10; k++){
            System.out.printf("%d * %d = %d\n", e, k, e*k);
        }

        //Problem 10 : Write a program to print multiplication table of 10 in reverse order.

        int z = 10;
        int sum1 = 0;
        for(int l=1; l<=10; l++){
            sum1 += z*l;
        }
        System.out.println(sum1);

        //Problem 11 : A do while loop is executed:
        // 1] At least once --> True
        // 2] at least twice
        // 3] at most once

        //Problem 12 : Repeat 2 using while loop .

        int o = 2;
        int sum2 = 0;
        int count = 0;
        while(count<10){
            if(n%2==0){
                count++;
                sum2 = sum2 + n;
                System.out.println("#"+count+"is: "+o);
            }
            o++;
        }
        System.out.println("Even numbers sum is: "+sum2);
    }
}
