package lessons3.Lesson13.services;

import java.security.InvalidParameterException;

public class BrazilInterestService {
  private Double interestFee;

  public BrazilInterestService(Double interestFee){
    this.interestFee = interestFee;
  }

  public void setInterestFee(Double interestFee){
    this.interestFee = interestFee;
  }
  public Double getInterestFee(){
    return interestFee;
  }

  public Double payment(double amount, int months){
    if (months < 1){
      throw new InvalidParameterException("Months must be greater than zero");
    }
    return amount * Math.pow(1.0 + interestFee / 100.0, months);
  }
}
