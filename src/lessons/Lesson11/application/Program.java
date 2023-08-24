package lessons.Lesson11.application;

import lessons.Lesson11.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter product data: ");

    System.out.print("Name: ");
    String name = sc.nextLine();

    System.out.print("Price: ");
    double price = sc.nextDouble();

    System.out.print("Quantity: ");
    int quantity = sc.nextInt();

    Product product = new Product(name, price, quantity);

    // set and get test lesson
    product.setName("Computer");
    System.out.println("Updated name: " + product.getName());
    product.setPrice(750);
    System.out.println("Updated price: " + product.getPrice());

    System.out.println("\nProduct data: " + product);

    System.out.println("\nEnter the number of products to be added in stock: ");
    product.addProducts(sc.nextInt());

    System.out.println("\nUpdated data: " + product);

    System.out.println("\nEnter the number of products to be removed in stock: ");
    product.removeProducts(sc.nextInt());

    System.out.println("\nUpdated data: " + product);

    sc.close();
  }
}
