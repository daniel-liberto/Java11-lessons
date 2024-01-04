package lessons4.Lesson04.application;

import lessons4.Lesson04.entities.Product;
import lessons4.Lesson04.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    List<Product> list = new ArrayList<>();

    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));

    List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
    names.forEach(System.out::println);
  }
}