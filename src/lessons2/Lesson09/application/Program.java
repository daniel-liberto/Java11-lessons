package lessons2.Lesson09.application;

import lessons2.Lesson09.entities.Employee;
import lessons2.Lesson09.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<Employee> list = new ArrayList<>();

    System.out.println("Enter the number of employees: ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.printf("Employee #%d data: \n", i + 1);
      System.out.println("Outsourced (y/n)? ");
      char ch = sc.next().charAt(0);
      System.out.println("Name: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.println("Hours: ");
      int hours = sc.nextInt();
      System.out.println("Value per hour: ");
      double valuePerHour = sc.nextDouble();

      if(ch == 'y' || ch == 'Y'){
        System.out.println("Additional charge: ");
        double additionalCharge = sc.nextDouble();
        Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
        list.add(emp);
      } else {
        Employee emp = new Employee(name, hours, valuePerHour);
        list.add(emp);
      }
    }


    sc.close();
  }
}
