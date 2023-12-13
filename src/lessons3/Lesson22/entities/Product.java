package lessons3.Lesson22.entities;

import java.util.Objects;

public class Product implements Comparable<Product> {
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
    return "Product [name=" + name + ", price=" + price + "]";
  }

  @Override
  public int compareTo(Product other){
    return name.toUpperCase().compareTo(other.getName().toUpperCase());
  }
}
