package lessons4.Lesson04.util;

import lessons4.Lesson04.entities.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {
  @Override
  public String apply(Product p){
    return p.getName().toUpperCase();
  }
}
