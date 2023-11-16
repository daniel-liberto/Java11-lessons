package lessons3.Lesson08.application;

import lessons3.Lesson08.model.entities.CarRental;
import lessons3.Lesson08.model.entities.Vehicle;
import lessons3.Lesson08.model.services.BrazilTaxService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    System.out.println("Enter with rent data: ");
    System.out.print("Car model: ");
    String carModel = sc.nextLine();

    System.out.println("Start (dd/MM/yyyy hh:mm): ");
    LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);

    System.out.println("Finish (dd/MM/yyyy hh:mm): ");
    LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

    CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

    BrazilTaxService taxService = new BrazilTaxService();

    System.out.println(taxService.tax(390));

    sc.close();
  }
}
