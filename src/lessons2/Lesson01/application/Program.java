package lessons2.Lesson01.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("How many rows? ");
    int rows = sc.nextInt();

    System.out.print("How many columns? ");
    int cols = sc.nextInt();

    int[][] mat = new int[rows][cols];
    int[] diagonals = new int[rows];
    int negativeCounter = 0;

    System.out.println("Type numbers between (-99 and 99)");
    for (int i = 0; i < rows; i++) {
      System.out.println("\n*════════════════════════*");
      System.out.printf(" Values for row #%d%n", i);
      for (int j = 0; j < cols; j++) {
        while (true) {
          System.out.printf(" position X & Y %dx%d: ", i, j);
          mat[i][j] = sc.nextInt();
          if (mat[i][j] < -99 || mat[i][j] > 99) {
            System.out.println("\nPlease type between -99 and 99");
          }
          else {
            break;
          }
        }
        if (mat[i][j] < 0){
          negativeCounter++;
        }
        if (i == j) {
          diagonals[i] = mat[i][j];
        }
      }
      System.out.println("*════════════════════════*");
    }
    System.out.println("\nResults: ");
    for (int i = 0; i < rows; i++) {
      System.out.printf("→ Row #%d: ", i);
      for (int j = 0; j < cols; j++) {
        if (mat[i][j] < 10 && mat[i][j] >= 0) {
          System.out.print("[  ");
        } else if ((mat[i][j] < 100 && mat[i][j] >= 10) || (mat[i][j] < 0 && mat[i][j] > -9)) {
          System.out.print("[ ");
        } else {
          System.out.print("[");
        }
        System.out.print(mat[i][j]);
        System.out.print("] ");
      }
      System.out.println();
    }
    System.out.println("\nMain Diagonals: ");
    for (int num:diagonals) {
      System.out.printf(" [%d] ",num);
    }
    System.out.println("\nQuantity of negative numbers: " + negativeCounter);
    sc.close();
  }
}
