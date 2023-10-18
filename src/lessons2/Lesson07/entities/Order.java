package lessons2.Lesson07.entities;

import lessons2.Lesson07.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

  private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
  private static SimpleDateFormat sdfSimple = new SimpleDateFormat("dd/MM/yyyy");

  private Date moment;

  private OrderStatus status;

  private Client client;

  private List<OrderItem> itemList = new ArrayList<OrderItem>();

  public Order(){}

  public Order(Date moment, OrderStatus status, Client client){
    this.moment = moment;
    this.status = status;
    this.client = client;
  }

  public void setMoment(Date moment){
    this.moment = moment;
  }
  public void setStatus(OrderStatus status){
    this.status = status;
  }
  public void setClient(Client client){
    this.client = client;
  }

  public Date getMoment(){
    return moment;
  }
  public OrderStatus getStatus() {
    return status;
  }
  public Client getClient(){
    return client;
  }

  public void addItem(OrderItem item){
    itemList.add(item);
  }
  public void removeItem(OrderItem item){
    itemList.remove(item);
  }

  public double total(){
    double sum = 0;
    for (OrderItem item: itemList
         ) {
      sum = sum + item.subTotal();
    }
    return sum;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("\nORDER SUMMARY: ");
    sb.append("\nOrder moment: ");
    sb.append(sdfSimple.format(moment));
    sb.append("\nOrder status: " + getStatus());
    sb.append("\nClient: " + client.getName());
    sb.append(" (" + sdfSimple.format(client.getBirthDate()) +") - " + client.getEmail());
    sb.append("\nOrder items: ");
    double sum = 0;
    for (OrderItem item: itemList
         ) {
      sum += item.subTotal();
      sb.append("\n"
              + item.getProduct().getName()
              + ", $"
              + item.getProduct().getPrice()
              + "Quantity: "
              + item.getQuantity() + ", "
              + "Subtotal: $"
              + item.subTotal());
    }
    sb.append("\nTotal price: " + sum);
    return sb.toString();
  }
}
