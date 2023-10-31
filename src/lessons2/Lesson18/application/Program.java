package lessons2.Lesson18.application;

import lessons2.Lesson18.model.entities.Account;
import lessons2.Lesson18.model.exceptions.WithdrawException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    try {
      System.out.println("Enter account data: ");
      System.out.print("Number: ");
      int number = sc.nextInt();
      System.out.print("Holder name: ");
      sc.nextLine();
      String holderName = sc.nextLine();
      System.out.print("Initial balance: ");
      double initialBalance = sc.nextDouble();
      System.out.print("Withdraw limit: ");
      double withdrawLimit = sc.nextDouble();
      Account acc = new Account(number, holderName, initialBalance, withdrawLimit);

      System.out.print("\nEnter the amount for withdraw: ");
      double amount = sc.nextDouble();
      acc.withdraw(amount);

      System.out.println("New balance: " + acc.getBalance());
    } catch (WithdrawException withdrawException){
      System.out.println("Withdraw error: " + withdrawException.getMessage());

    } catch (RuntimeException runtimeException){
      System.out.println("Unexpected error");
    }


    sc.close();
  }
}
