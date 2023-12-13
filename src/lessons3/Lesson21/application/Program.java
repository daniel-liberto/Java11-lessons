package lessons3.Lesson21.application;

import lessons3.Lesson21.entities.Product;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Set<Product> set = new HashSet<>();

    set.add(new Product("TV", 900.00));
    set.add(new Product("Notebook", 1200.00));
    set.add(new Product("Tablet", 400.00));

    Product prod = new Product("Notebook", 1200.00);
    System.out.println("\nsetList contains Product prod: " + set.contains(prod));
  }
}
