package lessonsDatabase.lessonsDB6.application;

import lessonsDatabase.lessonsDB6.model.dao.DaoFactory;
import lessonsDatabase.lessonsDB6.model.dao.DepartmentDao;
import lessonsDatabase.lessonsDB6.model.entities.Department;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program2 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
    List<Department> depList;

//    System.out.println("\n=== TEST 1: Insert department ===");
//    System.out.print("Type a department name: ");
//    String depName = sc.nextLine();
//    Department dep = new Department(null, depName);
//    departmentDao.insert(dep);
//    System.out.println("New department created! new id: " + dep.getId());

//    System.out.println("\n=== TEST 2: Update department ===");
//    System.out.print("Type the department id to update: ");
//    int depUpdateId = sc.nextInt();
//    Department depUpdate = departmentDao.findById(depUpdateId);
//    System.out.println("Department name selected is: " + depUpdate.getName());
//    sc.nextLine();
//    System.out.print("What is the updated name for this department? ");
//    String depUpdateName = sc.nextLine();
//    departmentDao.update(new Department(depUpdate.getId(), depUpdateName));

//   System.out.println("\n=== TEST 3: FindById ===");
//    System.out.print("Type an department id: ");
//    int depFindId = sc.nextInt();
//    Department depResult = departmentDao.findById(depFindId);
//    System.out.println(depResult)

    System.out.println("\n=== TEST 4: FindAll ===");
    depList = departmentDao.findAll();
    for (Department department : depList) {
      System.out.println(department);
    }

    System.out.println("\n=== TEST 5: Delete department ===");
    System.out.print("type an id to DELETE department: ");
    int depDeleteId = sc.nextInt();
    departmentDao.deleteById(depDeleteId);


    sc.close();
  }
}
