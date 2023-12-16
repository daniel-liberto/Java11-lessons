package lessons3.Lesson24.application;

import lessons3.Lesson24.entities.Students;

import java.util.*;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<String> courses = Arrays.asList("A", "B", "C");
    Set<Students> studentList = new HashSet<>();
    for (int i = 0; i < courses.size(); i++) {
      System.out.printf("How many students for course %s? ", courses.get(i));
      int course = sc.nextInt();
      for (int j = 0; j < course; j++) {
        System.out.printf("Student #%d ID: ", j + 1);
        int studentID = sc.nextInt();
        studentList.add(new Students(studentID));
      }
    }
    System.out.println("\nTotal students: " + studentList.size());
  }
}
