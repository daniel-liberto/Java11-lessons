package lessons4.Lesson04.application;

import lessons4.Lesson04.entities.Product;
import lessons4.Lesson04.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    List<Product> list = new ArrayList<>();

    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));

    List<String> namesClass = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
    System.out.println("\nUppercase class: ");
    namesClass.forEach(System.out::println);

    List<String> namesStaticMethod = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
    System.out.println("\nUppercase static method: ");
    namesStaticMethod.forEach(System.out::println);

    List<String> namesMethod = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
    System.out.println("\nUppercase method: ");
    namesMethod.forEach(System.out::println);

    Function<Product, String> func = p -> p.getName().toUpperCase();
    List<String> namesLambda = list.stream().map(func).collect(Collectors.toList());
    System.out.println("\nUppercase lambda: ");
    namesLambda.forEach(System.out::println);

    List<String> namesLambdaInline = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
    System.out.println("\nUppercase lambda inline: ");
    namesLambdaInline.forEach(System.out::println);

  }
}
