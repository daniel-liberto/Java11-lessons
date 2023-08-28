package lessons.Lesson21.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("How many numbers in each vector? ");
    int n = sc.nextInt();
    int[] vector1 = new int[n];
    int[] vector2 = new int[n];

    System.out.println("\n*═══════════════════════*");
    System.out.println(" FIRST VECTOR NUMBERS");
    System.out.println("*═══════════════════════*");
    for (int i = 0; i < vector1.length; i++) {
      System.out.printf("Type number %d: ", i + 1);
      vector1[i] = sc.nextInt();
    }
    System.out.println("\n*═══════════════════════*");
    System.out.println(" SECOND VECTOR NUMBERS");
    System.out.println("*═══════════════════════*");
    for (int i = 0; i < vector2.length; i++) {
      System.out.printf("Type number %d: ", i + 1);
      vector2[i] = sc.nextInt();
    }
    System.out.println("\nVECTOR RESULTS");
    for (int i = 0; i < n; i++) {
      System.out.printf("%d + %d = %d%n",vector1[i], vector2[i], vector1[i] + vector2[i]);
    }
  }
}
