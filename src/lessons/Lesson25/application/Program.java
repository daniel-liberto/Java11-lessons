package lessons.Lesson25.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("How many students will be? ");
    int n = sc.nextInt();

    String[] studentName = new String[n];
    double[] firstSemester = new double[n];
    double[] secondSemester = new double[n];

    for (int i = 0; i < n; i++) {
      System.out.println("\n*════════════════════════════*");
      System.out.printf("Type the student %d name: %n", i + 1);
      sc.nextLine();
      studentName[i] = sc.nextLine();
      System.out.println("Enter the first semester grades");
      firstSemester[i] = sc.nextDouble();
      System.out.println("Enter the second semester grades");
      secondSemester[i] = sc.nextDouble();
      System.out.println("*════════════════════════════*");
    }
    System.out.println("\nSTUDENTS APPROVED: ");
    for (int i = 0; i < n; i++) {
      if ((firstSemester[i] + secondSemester[i]) / 2 >= 6) {
        System.out.println(studentName[i]);
      }
    }
    sc.close();
  }
}
