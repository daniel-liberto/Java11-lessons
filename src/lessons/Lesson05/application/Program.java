package lessons.Lesson05.application;

import lessons.Lesson05.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Product product = new Product();
    System.out.println("Enter product data: ");

    System.out.print("Name: ");
    product.name = sc.nextLine();

    System.out.print("Price: ");
    product.price = sc.nextDouble();

    System.out.print("Quantity: ");
    product.quantity = sc.nextInt();

//    System.out.printf("Name: %s, Price: %.2f, Quantity: %d", product.name, product.price, product.quantity);

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
