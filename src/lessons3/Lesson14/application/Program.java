package lessons3.Lesson14.application;

import lessons3.Lesson14.services.PrintServiceString;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    PrintServiceString pss = new PrintServiceString();

    System.out.print("How many values? ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      String value = sc.next();
      pss.addValue(value);
    }

    pss.print();
    System.out.println("First: " + pss.first());

    sc.close();
  }
}
