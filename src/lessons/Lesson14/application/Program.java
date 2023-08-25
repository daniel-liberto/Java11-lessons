package lessons.Lesson14.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("\n*═════════════════════════════════════════════════*");
    System.out.println("  Calculate the medium height of selected persons");
    System.out.println("*═════════════════════════════════════════════════*");
    System.out.println("\nHow many person do you want to calculate? ");
    int n = sc.nextInt();
    double[] vect = new double[n];

    for (int i=0; i < n; i++) {
      System.out.printf("\nType the person %d%n", i + 1);
      vect[i] = sc.nextDouble();
    }

    double sum = 0.0;
    for (int i=0; i< n; i++) {
      sum += vect[i];
    }
    double avg = sum / n;
    System.out.println("\n*═════════════════════════*");
    System.out.printf(" AVERAGE HEIGHT: %.2f%n", avg);
    System.out.println("*═════════════════════════*");


    sc.close();
  }
}
