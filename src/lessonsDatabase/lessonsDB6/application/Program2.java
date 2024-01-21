package lessonsDatabase.lessonsDB6.application;

import lessonsDatabase.lessonsDB6.model.dao.DaoFactory;
import lessonsDatabase.lessonsDB6.model.dao.DepartmentDao;
import lessonsDatabase.lessonsDB6.model.entities.Department;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

    System.out.println("=== TEST 1: Insert department ===");
    System.out.print("Type a department name: ");
    String depName = sc.nextLine();
    Department dep = new Department(null, depName);
    departmentDao.insert(dep);
    System.out.println("New department created! new id: " + dep.getId());

    sc.close();
  }
}
