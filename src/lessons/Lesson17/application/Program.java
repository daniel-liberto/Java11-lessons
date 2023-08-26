package lessons.Lesson17.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("\n*════════════════════════════*");
    System.out.println("Sum vector numbers task");
    System.out.println("*════════════════════════════*");
    System.out.println("\nHow many numbers do you will wanna to sum?");
    int n = sc.nextInt();

    double[] vector = new double[n];

    double sum = 0;
    for (int i = 0; i < vector.length; i++) {
      System.out.printf("Type the number %d: ", i + 1);
      vector[i] = sc.nextDouble();
      sum += vector[i];
    }
    double avgValue = sum / vector.length;
    System.out.print("\nVALUES = ");
    for (double value : vector) {
      System.out.print(value + " ");
    }
    System.out.printf("\nTOTAL SUM = %.2f%n", sum);
    System.out.printf("AVERAGE VALUE = %.2f%n", avgValue);

    sc.close();
  }
}
