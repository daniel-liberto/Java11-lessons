package lessons4.Lesson03.entities;

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

  public static void staticUpdate(Product p){
    p.setPrice(p.getPrice() * 1.1);
  }

  public void nonStaticUpdate(){
    setPrice(getPrice() * 1.1);
  }


  @Override
  public String toString(){
    return name + ", $" + String.format("%.2f", price);
  }
}