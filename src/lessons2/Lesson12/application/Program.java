package lessons2.Lesson12.application;

import lessons2.Lesson12.entities.Company;
import lessons2.Lesson12.entities.Individual;
import lessons2.Lesson12.entities.Payer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of tax payers: ");
    int n = sc.nextInt();

    List<Payer> payerList = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      System.out.printf("\nTax payer #%d data: \n", i + 1);
      System.out.print("[I]ndividual or [C]ompany  (i/c)? ");
      char payerType = sc.next().charAt(0);

      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();

      System.out.print("Annual income: ");
      double incomeAnnual = sc.nextDouble();

      if(payerType == 'i' || payerType == 'I'){
        System.out.print("Health expenditures: ");
        double expenditures = sc.nextDouble();
        payerList.add(new Individual(name, incomeAnnual,expenditures ));
      } else if(payerType == 'c' || payerType == 'C'){
        System.out.print("Number of employees: ");
        int employeeNum = sc.nextInt();
        payerList.add(new Company(name, incomeAnnual, employeeNum));
      }
    }
    double finalResult = 0;
    System.out.println("\nTAXES PAID: ");
    for (Payer person: payerList
         ) {
      System.out.println(person.totalTax());
      finalResult += person.currentTax();
    }

    System.out.printf("\nTOTAL TAXES: $%.2f", finalResult);

    sc.close();
  }
}
