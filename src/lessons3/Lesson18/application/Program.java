package lessons3.Lesson18.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Type the first word: ");
    String a = sc.next();

    System.out.print("Type the second word: ");
    String b = sc.next();

    System.out.printf("\n'%s' is the same as '%s'?", a, b);
    System.out.print("\nResponse: " + (a.hashCode() != b.hashCode()) + "\n");
  }
}
