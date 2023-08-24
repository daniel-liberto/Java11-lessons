package lessons.Lesson13.application;

import lessons.Lesson13.entities.Customer;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Customer user1 = new Customer();

    System.out.println("\n*═════════════════*");
    System.out.println(" Welcome to JBank!");
    System.out.println("*═════════════════*");
    System.out.println("\nCreate account section");
    System.out.print("Enter account number (4 digits): ");
    user1.setAccNumber(sc.nextInt());

    sc.nextLine();
    System.out.print("Enter your name: ");
    user1.setAccName(sc.nextLine());

    System.out.println("How much do you wanna charge as a first deposit? (0 for nothing) ");
    user1.depBalance(sc.nextDouble());

    System.out.println("\n╔═════════════════════*");
    System.out.println("║ Account data info: ");
    System.out.printf("║ Account number: %d%n", user1.getAccNumber());
    System.out.printf("║ Owner name: %s%n", user1.getAccName());
    System.out.printf("║ Account balance: $%.2f%n", user1.getAccBalance());
    System.out.println("╚═════════════════════════════════*");

    boolean quitLoop = true;
    while (quitLoop) {
      boolean quitOperation = true;
      while (quitOperation) {
        System.out.println("\nWanna do deposit or withdraw operation?");
        System.out.println("1 for Deposit\n2 for Withdraw");
        int response = sc.nextInt();
        if (response == 1) {
          System.out.printf("\nCurrent account balance: $%.2f%n", user1.getAccBalance());
          System.out.print("How much do you wanna deposit? ");
          user1.depBalance(sc.nextDouble());
          System.out.println("\nSuccessfully operation!");
          System.out.println("*═════════════════════════*");
          System.out.printf("NEW account balance: $%.2f%n", user1.getAccBalance());
          System.out.println("*═════════════════════════*");
          quitOperation = false;
        } else if (response == 2) {
          System.out.printf("\nCurrent account balance: $%.2f%n", user1.getAccBalance());
          System.out.println("This bank charges a fee of 5 dollars for withdraw");
          System.out.print("How much do you wanna withdraw? ");
          Object verification = user1.wthBalance(sc.nextDouble());
          if (verification == "fail") {
            System.out.println("\nERROR: You can't withdraw that amount.");
            System.out.println("═════════════════════════");
          }
          else {
            System.out.println("\nSuccessfully operation!");
            System.out.println("*═════════════════════════*");
            System.out.printf("NEW account balance: $%.2f%n", user1.getAccBalance());
            System.out.println("*═════════════════════════*");
            quitOperation = false;
          }
        } else {
          System.out.println("\n*ERROR: Invalid character, type a valid option*");
          System.out.println("═════════════════════════");
        }
      }

      boolean quitAnswer = true;
      while (quitAnswer) {
        System.out.println("Wanna do another operation? \n1 for yes\n0 for no");
        int answer = sc.nextInt();
        if (answer == 1) {
          for (int i = 0; i < 50; i++) {
            System.out.println();
          }
          quitAnswer = false;
        }
        else if (answer == 0) {
          quitLoop = false;
          quitAnswer = false;
          for (int i = 0; i < 50; i++) {
            System.out.println();
          }
          System.out.println("Thank you for using our bank system!");
        }
        else {
          System.out.println("\nERROR: Wrong character");
          System.out.println("═════════════════════════");
        }
      }

    }

  }
}
