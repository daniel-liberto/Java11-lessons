package lessons.Lesson19.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("\nHow many numbers you want to type? ");
    int n = sc.nextInt();

    int[] vector = new int[n];

    for (int i = 0; i < vector.length; i++) {
      System.out.print("Type a number: ");
      vector[i] = sc.nextInt();
    }
    System.out.println("\nEVEN NUMBERS:");
    int counter = 0;
    for (int num : vector) {
      if ((num % 2) == 0) {
        System.out.print(num + " ");
        counter++;
      }
    }
    System.out.printf("\nAMOUNT OF EVEN NUMBERS: %d", counter);
  }
}
