package lessons4.Lesson02.application;

import lessons4.Lesson02.entities.Product;
import lessons4.Lesson02.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    List<Product> list = new ArrayList<>();

    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));

    // direct way
    list.removeIf(p -> p.getPrice() >= 100.0);

    // using classes way
    list.removeIf(new ProductPredicate());

    // calling static method inside the product class
    list.removeIf(Product::staticProductPredicate);

    // declaring way
    Predicate<Product> pred = p -> p.getPrice() >= 100.0;
    list.removeIf(pred);

    for (Product p : list){
      System.out.println(p);
    }
  }
}
