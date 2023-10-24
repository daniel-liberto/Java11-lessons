package lessons2.Lesson12.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of tax payers: ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.printf("Tax payer #%d data: \n", i + 1);
      System.out.print("[I]ndividual or [C]ompany  (i/c)? ");
      char payerType = sc.next().charAt(0);

      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();

      System.out.println("Annual income: ");
      double incomeAnnual = sc.nextDouble();

      if(payerType == 'i' || payerType == 'I'){
        System.out.print("Health expenditures: ");
        double expenditures = sc.nextDouble();

      } else if(payerType == 'c' || payerType == 'C'){
        System.out.print("Number of employees: ");
        int employeeNum = sc.nextInt();

      }
    }


    sc.close();
  }
}
