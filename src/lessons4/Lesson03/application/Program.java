package lessons4.Lesson03.application;


import lessons4.Lesson03.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    List<Product> list = new ArrayList<>();

    list.add(new Product("Tv", 900.0));
    list.add(new Product("Mouse", 50.0));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));

    list.forEach(p -> p.setPrice((p.getPrice() / 100) * 10 + p.getPrice()));

    for (Product p: list) {
      System.out.println(p);
    }
  }
}
