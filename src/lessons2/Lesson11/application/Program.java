package lessons2.Lesson11.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of shapes: ");
    int n = sc.nextInt();



    sc.close();
  }
}
