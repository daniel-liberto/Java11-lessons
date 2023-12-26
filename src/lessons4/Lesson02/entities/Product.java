package lessons4.Lesson02.entities;

import java.util.Objects;

public class Product {
  private String name;
  private Double price;

  public Product(String name, Double price){
    this.name = name;
    this.price = price;
  }

  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }

  public void setPrice(Double price){
    this.price = price;
  }
  public Double getPrice(){
    return price;
  }

  public static boolean staticProductPredicate(Product p){
    return p.getPrice() >= 100.0;
  }

  public boolean nonStaticProductPredicate(){
    return price >= 100.0;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Product product = (Product) o;
    return Objects.equals(name, product.name) && Objects.equals(price, product.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, price);
  }

  @Override
  public String toString(){
    return name + ", $" + String.format("%.2f", price);
  }
}
