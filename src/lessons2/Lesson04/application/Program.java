package lessons2.Lesson04.application;

import lessons2.Lesson04.entities.Order;
import lessons2.Lesson04.entities.enums.OrderStatus;

import java.util.Date;

public class Program {
  public static void main(String[] args) {
    Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
    System.out.println(order);

    String statusFromUser = "DELIVERED";

    // hardcoded:
    OrderStatus os1 = OrderStatus.DELIVERED;
    // data from drop down or database:
    OrderStatus os2 = OrderStatus.valueOf(statusFromUser);

    System.out.println("os1: " + os1);
    System.out.println("os2: " + os2);
  }
}
