package lessons4.Lesson02.entities;

import java.util.Objects;

public class Product {
  private String name;
  private Double value;

  public Product(String name, Double value){
    this.name = name;
    this.value = value;
  }

  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }

  public void setValue(Double value){
    this.value = value;
  }
  public Double getValue(){
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Product product = (Product) o;
    return Objects.equals(name, product.name) && Objects.equals(value, product.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }
}
