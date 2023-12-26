package lessons4.Lesson02.util;

import lessons4.Lesson02.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

  @Override
  public boolean test(Product p){
    return p.getPrice() >= 100.0;
  }
}
