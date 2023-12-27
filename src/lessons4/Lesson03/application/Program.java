package lessons4.Lesson03.application;


import lessons4.Lesson03.entities.Product;
import lessons4.Lesson03.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    List<Product> list = new ArrayList<>();

    list.add(new Product("Tv", 900.0));
    list.add(new Product("Mouse", 50.0));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));

    System.out.println("\nOriginal values: ");
    list.forEach(System.out::println);

    System.out.println("\nPlus 10% from last update:: ");
    list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
    list.forEach(System.out::println);

    System.out.println("\nPlus 10% from last update:");
    list.forEach(new PriceUpdate());
    list.forEach(System.out::println);

    System.out.println("\nPlus 10% from last update:");
    list.forEach(Product::staticUpdate);
    list.forEach(System.out::println);

    System.out.println("\nPlus 10% from last update:");
    list.forEach(Product::nonStaticUpdate);
    list.forEach(System.out::println);

    System.out.println("\nPlus 10% from last update:");
    Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);
    list.forEach(cons);
    list.forEach(System.out::println);
  }
}
