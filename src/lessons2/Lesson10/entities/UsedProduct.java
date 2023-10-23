package lessons2.Lesson10.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  private Date manufactureDate;

  public UsedProduct(){}

  public UsedProduct(String name, Double price, Date manufactureDate){
    super(name, price);
    this.manufactureDate = manufactureDate;
  }

  public void setManufactureDate(Date manufactureDate){
    this.manufactureDate = manufactureDate;
  }

  public Date getManufactureDate(){
    return  manufactureDate;
  }
  @Override
  public String priceTag(String name, Double price){
    StringBuilder sb = new StringBuilder();
    sb.append(name);
    sb.append(" (used) $");
    sb.append(price);
    sb.append(" (Manufacture date: " + sdf.format(manufactureDate) + ")");
    return sb.toString();
  }
}
