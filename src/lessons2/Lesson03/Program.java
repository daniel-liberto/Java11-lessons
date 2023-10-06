package lessons2.Lesson03;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
  public static void main(String[] args) {

    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    LocalDate d01 = LocalDate.now();
    LocalDateTime d02 = LocalDateTime.now();
    Instant d03 = Instant.now();

    LocalDate d04 = LocalDate.parse("2023-10-06");
    LocalDateTime d05 = LocalDateTime.parse("2023-10-06T01:30:26");
    Instant d06 = Instant.parse("2023-10-06T01:30:26Z");
//    Instant d07 = Instant.parse("2023-10-06T01:30:26-03:00");

    LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
    LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
    LocalDate d10 = LocalDate.of(2022, 7, 20);
    LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);

    System.out.printf("\nDate.now(): %s", d01);
    System.out.printf("\nDateTime.now(): %s", d02);
    System.out.printf("\nInstant.now(): %s", d03);
    System.out.printf("\nLocalDate.parse(): %s", d04);
    System.out.printf("\nLocalDateTime.parse(): %s", d05);
    System.out.printf("\nInstant.parse(): %s", d06);
//    System.out.printf("\nInstant.parse(): %s", d07);
    System.out.printf("\nLocalDate.parse(): %s", d08);
    System.out.printf("\nLocalDateTime.parse(): %s", d09);
    System.out.printf("\nLocalDate.parse(): %s", d10);
    System.out.printf("\nLocalDateTime.parse(): %s", d11);


  }
}
