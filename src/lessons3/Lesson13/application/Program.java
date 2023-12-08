package lessons3.Lesson13.application;

import lessons3.Lesson13.services.BrazilInterestService;
import lessons3.Lesson13.services.InterestService;
import lessons3.Lesson13.services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.print("Amount: ");
    double amount = sc.nextDouble();

    System.out.print("Months: ");
    int months = sc.nextInt();

    InterestService brInterestFee = new BrazilInterestService(2.0);
    double brazilPayment = brInterestFee.payment(amount, months);

    System.out.println("\nBrazil Payment after " + months + " months:");
    System.out.printf("%.2f%n", brazilPayment);

    InterestService usaInterestFee = new UsaInterestService(1.0);
    double usaPayment = usaInterestFee.payment(amount, months);

    System.out.println("\nUsa Payment after " + months + " months:");
    System.out.printf("%.2f%n", usaPayment);

    sc.close();
  }
}
