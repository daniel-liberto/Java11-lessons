package lessons2.Lesson10.entities;

public class Product {
  private String name;
  private Double price;

  public Product(){}

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

  public String priceTag(String name, Double price){
    StringBuilder sb = new StringBuilder();
    sb.append(name);
    sb.append(" $");
    sb.append(price);
    return sb.toString();
  };
}
