package lessons2.Lesson05.application;

import lessons2.Lesson05.entities.Department;
import lessons2.Lesson05.entities.HourContract;
import lessons2.Lesson05.entities.Worker;
import lessons2.Lesson05.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) throws ParseException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.print("Enter with department name: ");
    String dpName = sc.nextLine();

    System.out.print("Enter worker data: \n");

    System.out.print("Name: ");
    String workerName = sc.nextLine();

    System.out.print("Level: ");
    String workerLevel = sc.nextLine();

    System.out.print("Base salary: ");
    double baseSalary = sc.nextDouble();

    Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(dpName));

    System.out.print("How many contracts to this worker? ");
    int contracts = sc.nextInt();

    for (int i = 0; i < contracts; i++) {
      System.out.printf("Enter contract #%d data: \n", i + 1);

      System.out.print("Date (DD/MM/YYYY): ");
      Date contractDate = sdf.parse(sc.next());

      System.out.print("Value per hour: ");
      double valuePerHour = sc.nextDouble();

      System.out.print("Duration (hours): ");
      int hours = sc.nextInt();

      HourContract contract = new HourContract(contractDate, valuePerHour, hours);
      worker.addContract(contract);
    }


    System.out.println("\nEnter month and year to calculate income (MM/YYYY): ");
    String monthAndYear = sc.next();
    int month = Integer.parseInt(monthAndYear.substring(0, 2));
    int year = Integer.parseInt(monthAndYear.substring(3));
    System.out.printf("Name: %s\n", worker.getName());
    System.out.printf("Department: %s\n", worker.getDepartment().getName());
    System.out.printf("Income for %s: %.2f",monthAndYear, worker.income(year, month));

    sc.close();
  }
}
