package lessons2.Lesson17.application;

import lessons2.Lesson17.model.entities.Reservation;
import lessons2.Lesson17.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    try {
      System.out.print("Room number: ");
      int number = sc.nextInt();
      System.out.print("Check in (dd/MM/yyyy): ");
      Date checkIn = sdf.parse(sc.next());
      System.out.print("Check in (dd/MM/yyyy): ");
      Date checkOut = sdf.parse(sc.next());

      Reservation reservation = new Reservation(number, checkIn, checkOut);
      System.out.println("Reservation: " + reservation);

      System.out.println("\n Enter data to update the reservation: ");
      System.out.print("Check in (dd/MM/yyyy): ");
      checkIn = sdf.parse(sc.next());
      System.out.print("Check in (dd/MM/yyyy): ");
      checkOut = sdf.parse(sc.next());

      reservation.updateDates(checkIn, checkOut);
      System.out.println("Reservation: " + reservation);
    } catch(ParseException parseException){
      System.out.println("\nParse type error.");
      System.out.println("Invalid date format");
    } catch (DomainException domainException){
      System.out.println("Error in reservation: " + domainException.getMessage());
    } catch (RuntimeException runtimeException){
      System.out.println("Unexpected error, if the problem persist, please contact the administrator.");
    }
    sc.close();
  }
}
