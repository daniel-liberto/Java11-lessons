package lessons2.Lesson18.model.entities;

import lessons2.Lesson18.model.exceptions.WithdrawException;

public class Account {
  private Integer number;
  private String holder;
  private Double balance;
  private Double withdrawLimit;

  public Account(){}
  public Account(Integer number, String holder, Double balance, Double withdrawLimit){
    this.number = number;
    this.holder = holder;
    this.balance = balance;
    this.withdrawLimit = withdrawLimit;
  }

  public void setNumber(Integer number){
    this.number = number;
  }
  public Integer getNumber(){
    return number;
  }

  public void setHolder(String holder){
    this.holder = holder;
  }
  public String getHolder(){
    return holder;
  }

  public Double getBalance(){
    return balance;
  }

  public void deposit(Double amount){
    balance += amount;
  }
  public void withdraw(Double amount) throws WithdrawException{
    if(amount < withdrawLimit){
      if(amount > balance){
        throw new WithdrawException("Not enough balance");
      } else {
        balance -= amount;
      }
    } else {
      throw new WithdrawException("The amount exceeds withdraw limit");
    }

  }
}
