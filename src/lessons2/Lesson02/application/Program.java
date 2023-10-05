package lessons2.Lesson02.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("\n*════════════════════════*");
    System.out.println(" Find the adjacent numbers");
    System.out.println("*════════════════════════*\n");


    System.out.println("How many rows? ");
    int rows = sc.nextInt();

    System.out.println("How many columns? ");
    int cols = sc.nextInt();

    int[][] matrix = new int[rows][cols];

    for (int i = 0; i < rows; i++) {
      System.out.printf("\nType numbers of the row %d: \n", i);
      for (int j = 0; j < cols; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }

    System.out.println("\n Your numbers typed: ");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.println(matrix[i][j]);
      }
    }

    System.out.println("\nWhat number do you want to find?");
    int numberChosen = sc.nextInt();

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (matrix[i][j] == numberChosen) {
          System.out.printf("Position: %d,%d\n", i, j);

          if (j - 1 >= 0) {
            System.out.printf("Left: %d\n", matrix[i][j - 1]);
          }

          if (j + 1 < cols) {
            System.out.printf("Right: %d\n", matrix[i][j + 1]);
          }

          if (i - 1 >= 0) {
            System.out.printf("Up: %d\n", matrix[i - 1][j]);
          }

          if (i + 1 < rows) {
            System.out.printf("Down: %d\n", matrix[i + 1][j]);
          }
        }
      }
    }

  }
}
