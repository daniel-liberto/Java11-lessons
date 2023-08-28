package lessons.Lesson20.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("How many numbers you will type? ");
    int n = sc.nextInt();

    double[] vector = new double[n];

    for (int i = 0; i < vector.length; i++) {
      System.out.print("Type a number: ");
      vector[i] = sc.nextDouble();
    }
    double aux = 0;
    for (double num : vector) {
      if (num > aux) {
        aux = num;
      }
    }
    for (int i = 0; i < vector.length; i++) {
      if (vector[i] == aux) {
        System.out.printf("\nBIGGEST VALUE NUMBER: %.2f", vector[i]);
        System.out.printf("\nINDEX POSITION OF BIGGEST NUMBER: %d", i);
      }
    }
  }
}
