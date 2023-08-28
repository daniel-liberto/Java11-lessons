package lessons.Lesson22.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("How many elements will have in the vector? ");
    int n = sc.nextInt();

    double[] vector = new double[n];

    for (int i = 0; i < vector.length ; i++) {
      System.out.printf("Type the number %d: ", i + 1);
      vector[i] = sc.nextDouble();
    }
    double sum = 0.0;
    for (double value : vector) {
      sum += value;
    }
    double avgSum = sum / vector.length;
    System.out.println("\nAVERAGE VALUE FROM VECTOR NUMBERS: ");
    System.out.println(avgSum);

    System.out.println("\nELEMENTS BELOW AVERAGE NUMBER: ");
    for (double num : vector) {
      if (num < avgSum) {
        System.out.println(num);
      }
    }
  }
}
