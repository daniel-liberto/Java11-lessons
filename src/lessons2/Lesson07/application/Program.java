package lessons2.Lesson07.application;

import lessons2.Lesson07.entities.Order;
import lessons2.Lesson07.entities.OrderItem;
import lessons2.Lesson07.entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) throws ParseException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.println("\nEnter client data: ");
    System.out.print("Name: ");
    String name = sc.nextLine();

    System.out.print("Email: ");
    String email = sc.nextLine();

    System.out.print("Birth date (DD/MM/YYYY): ");
    Date birthDate = sdf.parse(sc.nextLine());

    System.out.println("\nEnter order data: ");
    System.out.print("Status: ");
    String status = sc.next();

    System.out.print("How many items to this order? ");
    int itemsAmount = sc.nextInt();

     Order orderList = new Order();

    for (int i = 0; i < itemsAmount; i++) {
      System.out.printf("Enter #%d item data: \n", i + 1);

      System.out.print("Product name: ");
      String prodName = sc.next();

      System.out.print("Product price: ");
      double prodPrice = sc.nextDouble();

      System.out.print("Quantity: ");
      int quantity = sc.nextInt();

      Product product = new Product(prodName, prodPrice);
      OrderItem orderItem = new OrderItem(quantity, prodPrice, product);
      orderList.addItem(orderItem);
    }
    sc.close();
  }
}
