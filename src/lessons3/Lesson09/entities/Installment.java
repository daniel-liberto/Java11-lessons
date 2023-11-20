package lessons3.Lesson09.entities;

import java.util.Date;

public class Installment {
  private Date dueDate;
  private Double amount;

  public Installment(Date dueDate, Double amount){
    this.dueDate = dueDate;
    this.amount = amount;
  }

  public void setDueDate(Date dueDate){
    this.dueDate = dueDate;
  }
  public Date getDueDate(){
    return dueDate;
  }

  public void setAmount(Double amount){
    this.amount = amount;
  }
  public Double getAmount(){
    return amount;
  }
}
