package lessons.Lesson07.application;

import lessons.Lesson07.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Employee person1 = new Employee();

    System.out.println("What is your name? ");
    person1.Name = sc.nextLine();

    System.out.println("What is your Gross Salary? ");
    person1.GrossSalary = sc.nextDouble();

    System.out.println("What is the tax you paid for? ");
    person1.Tax = sc.nextDouble();

    System.out.printf("Employee: %s, $%.2f%n", person1.Name, person1.NetSalary());

    System.out.println("Which percentage to increase salary? ");
    person1.IncreaseSalary(sc.nextDouble());

    System.out.printf("Updated data: %s, $%.2f", person1.Name, person1.GrossSalary);
  }
}
