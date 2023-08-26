package lessons.Lesson15.application;

import lessons.Lesson15.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("\n*════════════════════════════*");
    System.out.println("  Products price comparison");
    System.out.println("*════════════════════════════*");
    System.out.println("\nHow many products do you want to compare? ");
    int n = sc.nextInt();
    Product[] vect = new Product[n];

    for (int i = 0; i < vect.length; i++) {
      sc.nextLine(); // anti-glitch
      System.out.printf("\nWhat is the name of product number %d%n", i + 1);
      String name = sc.nextLine();
      System.out.printf("What is the price of product number %d%n", i + 1);
      double price = sc.nextDouble();
      vect[i] = new Product(name, price);
    }

    double sum = 0.0;

    for (int i = 0; i < vect.length; i++) {
      sum += vect[i].getPrice();
    }

    double avg = sum / n;
    System.out.println("\n*═════════════════════════*");
    System.out.printf(" AVERAGE PRICE: %.2f%n", avg);
    System.out.println("*═════════════════════════*");

    sc.close();
  }
}
