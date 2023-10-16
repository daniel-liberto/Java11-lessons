package lessons2.Lesson05.entities;

import lessons2.Lesson05.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
  private String name;
  private WorkerLevel level;
  private Double baseSalary;

  private Department department; // 1 to 1
  private final List<HourContract> contracts = new ArrayList<>(); // 1 to *

  public Worker() {

  }

  public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
    this.name = name;
    this.level = level;
    this.baseSalary = baseSalary;
    this.department = department; // 1 to 1
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Department getDepartment() {
    return department;
  }


  public void addContract(HourContract contract) {
    this.contracts.add(contract);
  }
  public void removeContract(HourContract contract) {
    this.contracts.remove(contract);
  }

  public double income(int year, int month) {
    double sum = baseSalary;
    Calendar cal = Calendar.getInstance();
    for (HourContract c: contracts) {
      cal.setTime(c.getDate());
      int c_year = cal.get(Calendar.YEAR);
      int c_month = 1 + cal.get(Calendar.MONTH);
      if(year == c_year && month == c_month){
        sum = sum + c.totalValue();
      }
    }
    return sum;
  }
}
