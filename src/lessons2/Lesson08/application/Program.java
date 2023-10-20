package lessons2.Lesson08.application;

import lessons2.Lesson08.entities.Account;
import lessons2.Lesson08.entities.BusinessAccount;
import lessons2.Lesson08.entities.SavingsAccount;

import java.util.Locale;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Account acc = new Account(1001, "Alex", 0.0);
    BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

    // UP-CASTING
    Account acc1 = bacc;
    System.out.println("Business balance: $" + acc1.getBalance());

    // UPCASTING DIRECT INSTANCE
    Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
    // UPCASTING DIRECT INSTANCE 2
    Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

    // DOWN-CASTING WRONG INSTANCE
    // BusinessAccount acc4 = acc2;

    // DOWN-CASTING CORRECT INSTANCE
    BusinessAccount acc4 = (BusinessAccount) acc2;

    // USING SUBCLASS METHOD WITH DOWN-CASTING:

    // acc2 is a normal account and don't have loan method
    // acc2.loan(100.0);

    // Down-casting to make acc2(normal account) to use loan method
    ((BusinessAccount) acc2).loan(100.0);

    // acc4 can use loan method freely because is a BusinessAccount
    acc4.loan(100.0);

    // This will generate an error, because acc3 is a SavingsAccount
    // BusinessAccount acc5 = (BusinessAccount)acc3;

    // Verifying if Account is a BusinessAccount to prevent errors
    if (acc3 instanceof BusinessAccount){
      BusinessAccount acc5 = (BusinessAccount) acc3;
      acc5.loan(200.0);
      System.out.println("Loan successfully!");
    } else if (acc3 instanceof SavingsAccount){
      SavingsAccount acc5 = (SavingsAccount) acc3;
      acc5.updateBalance();
      System.out.println("Your balance is updated!");
    }

    // OVERRIDE LESSON

    // NORMAL ACCOUNT HAVE 5 DOLLARS OF TAX ON WITHDRAW
    Account acc6 = new Account(1005, "Alex", 1000.0);
    acc6.withdraw(200.0);
    System.out.println(acc6.getBalance());

    // SAVINGS ACCOUNT HAVE NO TAX WHEN WITHDRAW
    Account acc7 = new SavingsAccount(1006, "Maria", 1000.0, 0.01);
    acc7.withdraw(200.0);
    System.out.println(acc7.getBalance());

  }
}
