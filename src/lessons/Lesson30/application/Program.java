package lessons.Lesson30.application;

import lessons.Lesson30.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<Employee> list = new ArrayList<>();

    System.out.print("How many employees will be registered? ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {

      System.out.printf("\nEmployee #%d: %n", i + 1);
      System.out.print("id: ");
      Integer id = sc.nextInt();
      sc.nextLine();
      System.out.print("Name: ");
      String name = sc.nextLine();
      System.out.print("Salary: ");
      Double salary = sc.nextDouble();
      Employee emp = new Employee(id, name, salary);

      list.add(emp);
    }

    System.out.println("Enter the employee id that will have salary increase: ");
    int searchID = sc.nextInt();
    Integer pos = idPosition(list, searchID);
    if (pos == null) {
      System.out.println("This id does not exist!");
    }
    else {
      System.out.println("Enter the percentage: ");
      double percentage = sc.nextDouble();
      list.get(pos).increaseSalary(percentage);
    }

    System.out.println("\nList of employees: ");
    System.out.println("[ID]  [NAME]   [SALARY]");
    for (Employee employee : list) {
      System.out.printf("%d, %s, %.2f%n", employee.getId(), employee.getName(), employee.getSalary());
    }

    sc.close();
  }
  public static Integer idPosition(List<Employee> list, int id) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).getId() == id) {
        return i;
      }
    }
    return null;
  }
}
