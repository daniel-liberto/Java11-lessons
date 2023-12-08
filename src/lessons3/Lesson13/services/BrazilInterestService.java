package lessons3.Lesson13.services;

public class BrazilInterestService implements InterestService {
  private Double interestFee;

  public BrazilInterestService(Double interestFee) {
    this.interestFee = interestFee;
  }

  @Override
  public double getInterestFee() {
    return interestFee;
  }

}
