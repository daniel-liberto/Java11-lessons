package lessons.Lesson7.entities;

public class Employee {
  public String Name;
  public double GrossSalary;
  public double Tax;

  public double NetSalary() {
      return GrossSalary - Tax;
  }
  public void IncreaseSalary(double percentage) {
      double aux;
      aux = (percentage / 100) * GrossSalary;
      GrossSalary = aux + GrossSalary - Tax;
  }
}
