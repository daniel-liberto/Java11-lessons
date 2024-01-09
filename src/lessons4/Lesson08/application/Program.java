package lessons4.Lesson08.application;

import lessons4.Lesson08.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter full file path: ");
    String path = sc.nextLine();

    System.out.print("Enter the salary target value: ");
    double salary = sc.nextDouble();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

      List<Employee> employees = new ArrayList<>();

      String line = br.readLine();
      while (line != null) {
        String[] fields = line.split(",");
        employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
        line = br.readLine();
      }
      Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
      List<String> emails = employees.stream().filter(x -> x.getSalary() > salary).map(x -> x.getEmail()).sorted().collect(Collectors.toList());
      System.out.printf("\nEmail of people whose salary is more than %.2f: \n", salary);
      emails.forEach(System.out::println);

      Double sumSalary = employees.stream().filter(x -> x.getName().toUpperCase().charAt(0) == 'M').map(x -> x.getSalary()).reduce(0.0, (x,y) -> x + y);
      System.out.println("Sum of salary of people whose name starts with 'M': $" + String.format("%.2f", sumSalary));
    } catch (IOException ioException) {
      System.out.println("Error: " + ioException.getMessage());
    }
  }
}
