package lessons.Lesson30.application;

import lessons.Lesson30.entities.Employee;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("How many employees will be registered? ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int id;
      System.out.printf("Employee #%d: %n", i + 1);

      List<Employee> employee = null;
      do {
        System.out.print("id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.println("Salary: ");
        Double salary = sc.nextDouble();
//        employee.add(i, id);
      } while (employee.get(i).getId() != id);

      System.out.println("Enter the employee id that will have salary increase: ");
//      salary.set(id, sc.nextDouble());
      System.out.println("Enter the percentage: ");
//      double result = (salary.get(id) / 100) * sc.nextDouble();
//      salary.set(id, result);

      System.out.println("List of employees: ");
      System.out.println("[ID]  [NAME]   [SALARY]");
//      for (String user_id : name) {
//        System.out.printf("%d, %s, %.2f", name.indexOf(user_id), user_id, salary.get(name.indexOf(user_id)));
//      }
    }
  }
}
