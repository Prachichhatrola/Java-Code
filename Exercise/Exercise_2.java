import java.util.*;

class Exercise_2 {
  static int user = 0;
  static int computer = 0;

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    String choice[] = { "Rock", "Paper", "Scissors" };
    int i = 0;
    while (i < 3) {
      int compChoice = getComp();
      System.out.print("User: ");
      String userString = scanner.nextLine();
      int userChoice = userString.equals(choice[0]) ? 0 : (userString.equals(choice[1]) ? 1 : 2);
      getDecision(compChoice, userChoice);
      System.out.println("Computer: " + choice[compChoice]);
      System.out.println("User: " + user + " Comp: " + computer);
      i++;
    }
    getResult();

    scanner.close();
  }

  public static int getComp() {
    Random obj = new Random();
    int move = obj.nextInt(3);
    return move;
  }

  public static void getDecision(int choice1, int choice2) {
    if (choice1 == choice2)
      System.out.print("Tie=> ");
    else {
      switch (choice1) {
        case 0:
          if (choice2 == 2)
            computer += 1;
          else
            user += 1;
          break;

        case 1:
          if (choice2 == 0)
            computer += 1;
          else
            user += 1;
          break;

        case 2:
          if (choice2 == 1)
            computer += 1;
          else
            user += 1;
          break;
      }
    }
  }

  public static void getResult() {
    if (user > computer)
      System.out.println("User Wins");
    else if (computer > user)
      System.out.println("Computer wins");
    else
      System.out.println("It is a tie");
  }
}

