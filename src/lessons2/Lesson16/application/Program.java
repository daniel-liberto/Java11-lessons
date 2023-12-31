package lessons2.Lesson16.application;

import lessons2.Lesson16.model.entities.Reservation;

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

    System.out.print("Room number: ");
    int number = sc.nextInt();

    System.out.print("Check in (dd/MM/yyyy): ");
    Date checkIn = sdf.parse(sc.next());
    System.out.print("Check in (dd/MM/yyyy): ");
    Date checkOut = sdf.parse(sc.next());

    if (!checkOut.after(checkIn)){
      System.out.println("Error in reservation: Check-out date must be after check-in date");
    } else {
      Reservation reservation = new Reservation(number, checkIn, checkOut);
      System.out.println("Reservation: " + reservation);

      System.out.println("\n Enter data to update the reservation: ");
      System.out.print("Check in (dd/MM/yyyy): ");
      checkIn = sdf.parse(sc.next());
      System.out.print("Check in (dd/MM/yyyy): ");
      checkOut = sdf.parse(sc.next());

      String error = reservation.updateDates(checkIn, checkOut);
      if(error != null){
        System.out.println("Error in reservation: " + error);
      } else {
        System.out.println("Reservation: " + reservation);
      }
    }


    sc.close();
  }
}
