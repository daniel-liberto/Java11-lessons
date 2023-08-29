package lessons.Lesson26.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("How many people will be? ");
    int n = sc.nextInt();

    double[] personHeight = new double[n];
    char[] personGender = new char[n];

    for (int i = 0; i < n; i++) {
      System.out.printf("\nHeight of person number %d: %n", i + 1);
      personHeight[i] = sc.nextDouble();
      while (true) {
        System.out.printf("Gender of person number %d: (F/M)%n", i + 1);
        personGender[i] = sc.next().toUpperCase().charAt(0);
        if(personGender[i] == 'F' || personGender[i] == 'M') {
          break;
        }
        else {
          System.out.println("Invalid type, please F or M");
        }
      }
    }
    double smallerPerson = 0;
    for (int i = 0; i < n; i++) {
      if (i == 0) {
        smallerPerson = personHeight[i];
      }
      if (personHeight[i] < smallerPerson) {
        smallerPerson = personHeight[i];
      }
    }
    System.out.println("\n*════════════════════════════*");
    System.out.printf("Smaller height: %.2f%n", smallerPerson);

    double tallerPerson = 0;
    for (int i = 0; i < n; i++) {
      if (personHeight[i] > tallerPerson) {
        tallerPerson = personHeight[i];
      }
    }
    System.out.printf("Taller height: %.2f%n", tallerPerson);

    int menCounter = 0;
    int womenCounter = 0;
    double avgHeightWoman = 0;
    for (int i = 0; i < n; i++) {
      if (personGender[i] == 'F'){
        avgHeightWoman += personHeight[i];
        womenCounter++;
      }
      else {
        menCounter++;
      }
    }
    System.out.printf("Average height of women = %.2f%n", avgHeightWoman / womenCounter);
    System.out.printf("Number of mens: %d%n", menCounter);
    System.out.println("*════════════════════════════*");
  }
}
