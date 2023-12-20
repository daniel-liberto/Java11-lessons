package lessons4.Lesson01.entities;

public class Product implements Comparable<Product>{
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
  public int compareTo(Product p){
    return name.toUpperCase().compareTo(p.getName().toUpperCase());
  }
}
