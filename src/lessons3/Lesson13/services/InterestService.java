package lessons3.Lesson13.services;

import java.security.InvalidParameterException;

public interface InterestService {
  double getInterestFee();
  default double payment(double amount, int months){
    if (months < 1){
      throw new InvalidParameterException("Months must be greater than zero");
    }
    return amount * Math.pow(1.0 + getInterestFee() / 100.0, months);
  }
}
