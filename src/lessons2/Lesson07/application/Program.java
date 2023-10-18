package lessons2.Lesson07.application;

import lessons2.Lesson07.entities.Client;
import lessons2.Lesson07.entities.Order;
import lessons2.Lesson07.entities.OrderItem;
import lessons2.Lesson07.entities.Product;
import lessons2.Lesson07.enums.OrderStatus;

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
    String email = sc.next();

    System.out.print("Birth date (DD/MM/YYYY): ");
    Date birthDate = sdf.parse(sc.next());

    Client client = new Client(name, email, birthDate);

    System.out.println(sdf.format(client.getBirthDate()));

    System.out.println("\nEnter order data: ");
    System.out.print("Status: ");
    OrderStatus status = OrderStatus.valueOf(sc.next());

    System.out.print("How many items to this order? ");
    int itemsAmount = sc.nextInt();

     Order orderList = new Order(new Date(), status, client);

    for (int i = 0; i < itemsAmount; i++) {
      System.out.printf("\nEnter #%d item data: \n", i + 1);

      System.out.print("Product name: ");
      sc.nextLine();
      String prodName = sc.nextLine();

      System.out.print("Product price: ");
      double prodPrice = sc.nextDouble();

      System.out.print("Quantity: ");
      int quantity = sc.nextInt();

      Product product = new Product(prodName, prodPrice);
      OrderItem oi1 = new OrderItem(quantity, prodPrice, product);
      orderList.addItem(oi1);
    }
    System.out.println(orderList);
    sc.close();
  }
}
