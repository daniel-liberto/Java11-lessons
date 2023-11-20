package lessons3.Lesson09.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
  private Integer number;
  private Date date;
  private Double totalValue;
  private List<Installment> installments = new ArrayList<>();

  public Contract(){}
  public Contract(Integer number, Date date, Double totalValue){
    this.number = number;
    this.date = date;
    this.totalValue = totalValue;
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

  public void addInstallments(Installment installment){
    installments.add(installment);
  }

  public List<Installment> getInstallment(){
    return installments;
  }

}
