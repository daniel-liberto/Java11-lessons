package lessons3.Lesson14.application;

import lessons3.Lesson14.services.PrintServiceObject;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    PrintServiceObject<Integer> pss = new PrintServiceObject<>();

    System.out.print("How many values? ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      Integer value = sc.nextInt();
      pss.addValue(value);
    }

    pss.print();
    Integer x = pss.first();
    System.out.println("First: " + x);

    sc.close();
  }
}
