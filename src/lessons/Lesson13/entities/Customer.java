package lessons.Lesson13.entities;

public class Customer {
  private int accNumber;
  private String accName;
  private double accBalance;

  public Customer() {

  }

  public Customer(int accNumber, String accName, double accBalance) {
    this.accNumber = accNumber;
    this.accName = accName;
    this.accBalance = accBalance;
  }

  public int getAccNumber() {
    return accNumber;
  }

  public void setAccNumber(int accNumber) {
    this.accNumber = accNumber;
  }

  public String getAccName() {
    return accName;
  }

  public void setAccName(String accName) {
    this.accName = accName;
  }

  public double getAccBalance() {
    return accBalance;
  }

  public void depBalance(double cash) {
    this.accBalance += cash;
  }

  public Object wthBalance(double cash) {
    double withdrawAmount = cash + 5;
    if (withdrawAmount > accBalance || accBalance <= 0) {
      return "fail";
    }
    else {
      accBalance -= withdrawAmount;
      return accBalance;
    }
  }
}
