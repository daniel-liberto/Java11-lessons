package lessons2.Lesson12.entities;

public abstract class Payer {
  private String name;
  private Double annualIncome;

  public Payer(){}
  public Payer(String name, Double annualIncome){
    this.name = name;
    this.annualIncome = annualIncome;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void setAnnualIncome(Double annualIncome){
    this.annualIncome = annualIncome;
  }

  public Double getAnnualIncome(){
    return annualIncome;
  }

  public abstract double currentTax();
  public abstract String totalTax();
}
