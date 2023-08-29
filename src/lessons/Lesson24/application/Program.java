package lessons.Lesson24.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("How many people will be? ");
    int n = sc.nextInt();

    String[] vectorName = new String[n];
    int[] vectorAge = new int[n];

    for (int i = 0; i < n; i++) {
      System.out.printf("\nData of person %d%n", i + 1);
      sc.nextLine();
      System.out.print("Name: ");
      vectorName[i] = sc.nextLine();
      System.out.print("Age: ");
      vectorAge[i] = sc.nextInt();
    }
    int aux = 0;
    for (int i = 0; i < n; i++) {
      if (vectorAge[i] > aux) {
        aux = vectorAge[i];
      }
    }
    for (int i = 0; i < n; i++) {
      if (vectorAge[i] == aux) {
        System.out.printf("\nOLDER PERSON: %s",vectorName[i]);
      }
    }
  }
}
