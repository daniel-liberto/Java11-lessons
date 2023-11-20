package lessons3.Lesson09.entities;

import java.util.Date;

public class Contract {
  private Integer number;
  private Date date;
  private Double totalValue;
  private Installment installments;

  public Contract(){}
  public Contract(Integer number, Date date, Double totalValue, Installment installments){
    this.number = number;
    this.date = date;
    this.totalValue = totalValue;
    this.installments = installments;
  }

  public void setNumber(Integer number){
    this.number = number;
  }

  public Integer getNumber(){
    return number;
  }

  public void setDate(Date date){
    this.date = date;
  }

  public Date getDate(){
    return date;
  }

  public void setTotalValue(Double totalValue){
    this.totalValue = totalValue;
  }

  public Double getTotalValue(){
    return totalValue;
  }

  public void setInstallments(Installment installments){
    this.installments = installments;
  }

  public Installment getInstallments(){
    return installments;
  }
}
