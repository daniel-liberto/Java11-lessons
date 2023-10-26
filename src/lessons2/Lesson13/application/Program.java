package lessons2.Lesson13.application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    try {
      System.out.println("Type two or more words: ");
      String[] vect = sc.nextLine().split(" ");

      System.out.print("What position from vector? ");
      int position = sc.nextInt();
      System.out.println(vect[position]);
    } catch (ArrayIndexOutOfBoundsException outOfBoundsException) {
      System.out.println("\nThe system gets the following error: ");
      System.out.println("invalid position error");
    } catch (InputMismatchException inputMismatch) {
      System.out.println("\nThe system gets the following error: ");
      System.out.println("Input error");
    }


    sc.close();
  }
}
