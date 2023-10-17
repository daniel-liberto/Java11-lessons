package lessons2.Lesson07.entities;

public class OrderItem {
  private int quantity;
  private double price;

  private Product product;

  public OrderItem(){}

  public OrderItem(int quantity, double price, Product product){
    this.quantity = quantity;
    this.price = price;
    this.product = product;
  }

  public void setPrice(double price){
    this.price = price;
  }
  public void setQuantity(int quantity){
    this.quantity = quantity;
  }

  public void setProduct(Product product){
    this.product = product;
  }

  public double getPrice(){
    return price;
  }

  public int getQuantity(){
    return quantity;
  }

  public Product getProduct(){
    return product;
  }

  public double subTotal(){
    return price * quantity;
  }

}
