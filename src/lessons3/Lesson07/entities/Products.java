package lessons3.Lesson07.entities;

public class Products {
  private String name;
  private Double price;
  private Integer quantity;

  public Products(){}
  public Products(String name, Double price, Integer quantity){
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void setPrice(double price){
    this.price = price;
  }

  public Double getPrice(){
    return price;
  }

  public void setQuantity(int quantity){
    this.quantity = quantity;
  }

  public Integer getQuantity(){
    return quantity;
  }

  public Double totalPrice(){
    return price * quantity;
  }

  @Override
  public String toString(){
    return name + String.format("%.2f", totalPrice());
  }
}
