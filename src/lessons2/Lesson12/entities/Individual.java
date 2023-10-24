package lessons2.Lesson12.entities;

public class Individual extends Payer{
  private Double healthExp;

  public Individual(){
    super();
  }
  public Individual(String name, Double annualIncome, Double healthExp){
    super(name, annualIncome);
    this.healthExp = healthExp;
  }

  public void setHealthExp(Double healthExp){
    this.healthExp = healthExp;
  }
  public Double getHealthExp(){
    return healthExp;
  }

  @Override
  public double currentTax(){
    double taxValue = getAnnualIncome() / 100;
    return getAnnualIncome() <= 20000.00 ? (taxValue * 15) - (healthExp / 2) : (taxValue * 25) - (healthExp / 2);
  }

  @Override
  public String totalTax(){
    StringBuilder sb = new StringBuilder();
    sb.append(getName());
    sb.append(": $");
    sb.append(currentTax());
    return sb.toString();
  }
}
