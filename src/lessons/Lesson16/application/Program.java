package lessons.Lesson16.application;

import java.util.*;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("\n*════════════════════════════*");
    System.out.println("Find the negative numbers task");
    System.out.println("*════════════════════════════*");
    System.out.println("\nHow many numbers do you wanna calculate? ");
    int n;
    while (true) {
        n = sc.nextInt();
      if (n <= 0 || n > 10) {
        System.out.println("Please choose only between 1 and 10");
      }
      else {
        break;
      }
    }

    int[] vector = new int[n];

    int[] negVector = new int[vector.length];

    System.out.println("\nChoose a number between (-10 and 10)");
    for (int i = 0; i < vector.length; i++) {
      System.out.printf("Type the number %d: ", i + 1);
      while (true) {
        int aux = sc.nextInt();
        if (aux < -10 || aux > 10) {
          System.out.println("Invalid number, only -10 and 10 are acceptable.");
        }
        else {
          if (aux < 0) {
            negVector[i] = aux;
          }
          vector[i] = aux;
          break;
        }
      }
    }

    System.out.println("\nNUMBERS TYPED: ");
    System.out.println(Arrays.toString(vector)+ "\n");

    System.out.println("NEGATIVE NUMBERS: ");
    for (int num : negVector) {
      if (num != 0) {
        System.out.println(num);
      }
    }
  }
}
