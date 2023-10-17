package lessons2.Lesson07.entities;

import lessons2.Lesson07.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
  private Date moment;

  private OrderStatus status;


  private Client client;

  private List<OrderItem> itemList = new ArrayList<>();

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
}
