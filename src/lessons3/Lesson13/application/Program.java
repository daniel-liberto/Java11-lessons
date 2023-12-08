package lessons3.Lesson13.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.println("Amount: ");
    double amount = sc.nextDouble();

    System.out.println("Months: ");
    int months = sc.nextInt();
  }
}
