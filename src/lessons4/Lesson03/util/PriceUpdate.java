package lessons4.Lesson03.util;

import lessons4.Lesson03.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

  @Override
  public void accept(Product product) {
    product.setPrice(product.getPrice() * 1.1);
  }
}
