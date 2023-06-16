import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your age");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();

        switch(age){
          case 18:
          System.out.println("You are going to become am Adult!");
          break;
          case 23:
          System.out.println("You are going to join a job!");
          break;
          case 60:
          System.out.println("You are going to grt retired!");
          break;
          default:
          System.out.println("Enjoy your life!");

                scanner.close();
        }
        System.out.println("Thanks for using my java code");

    
        /* 
        if (age>56){
            System.out.println("You are experinced!");
        }
        else if(age>46){
            System.out.println("You are semi-experinced!");
        }
        else if(age>36){
            System.out.println("You are semi-semi experinced!");
        }
        else{
            System.out.println("Ypu are not experinced!");
        }
        */

    }
}
