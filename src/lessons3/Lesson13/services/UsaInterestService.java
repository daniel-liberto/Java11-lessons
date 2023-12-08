package lessons3.Lesson13.services;

public class UsaInterestService implements InterestService {
  private double interestFee;

  public UsaInterestService(double interestFee){
    this.interestFee = interestFee;
  }

  @Override
  public double getInterestFee(){
    return interestFee;
  }

}
