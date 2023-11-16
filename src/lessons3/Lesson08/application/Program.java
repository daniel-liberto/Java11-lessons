package lessons3.Lesson08.application;

import lessons3.Lesson08.model.entities.CarRental;
import lessons3.Lesson08.model.entities.Vehicle;
import lessons3.Lesson08.model.services.BrazilTaxService;
import lessons3.Lesson08.model.services.RentalService;

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

    System.out.print("Start (dd/MM/yyyy hh:mm): ");
    LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);

    System.out.print("Finish (dd/MM/yyyy hh:mm): ");
    LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

    CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

    System.out.print("Enter the price per hour: ");
    double pricePerHour = sc.nextDouble();
    System.out.print("Enter the price per day: ");
    double pricePerDay = sc.nextDouble();

    RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
    rentalService.processInvoice(cr);

    System.out.println("INVOICE: ");
    System.out.printf("Basic payment: $%.2f\n", cr.getInvoice().getBasicPayment());
    System.out.printf("Tax: $%.2f\n", cr.getInvoice().getTax());
    System.out.printf("Total payment: $%.2f", cr.getInvoice().getTotalPayment());

    sc.close();
  }
}
