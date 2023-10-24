package lessons2.Lesson12.entities;

public class Company extends Payer {
  private Integer employeeNum;

  public Company(){
    super();
  }
  public Company(String name, Double annualIncome, Integer employeeNum){
    super(name, annualIncome);
    this.employeeNum = employeeNum;
  }

  public void setEmployeeNum(Integer employeeNum){
    this.employeeNum = employeeNum;
  }

  public Integer getEmployeeNum(){
    return employeeNum;
  }

  @Override
  public String totalTax(){
    StringBuilder sb = new StringBuilder();
    sb.append(getName());
    sb.append(": $");
    double taxValue = getAnnualIncome() / 100;
    sb.append(String.format("%.2f", employeeNum >= 10 ? taxValue * 14 : taxValue * 16));
    return sb.toString();
  }
}
