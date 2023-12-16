package lessons3.Lesson24.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("How many students for course A?");
    int courseA = sc.nextInt();
    for (int i = 0; i < courseA; i++) {
      System.out.printf("Student #%d ID: ", i + 1);
      int studentID = sc.nextInt();
    }
    System.out.print("How many students for course B?");
    int courseB = sc.nextInt();
    for (int i = 0; i < courseB; i++) {
      System.out.printf("Student #%d ID: ", i + 1);
      int studentID = sc.nextInt();
    }
    System.out.print("How many students for course C?");
    int courseC = sc.nextInt();
    for (int i = 0; i < courseC; i++) {
      System.out.printf("Student #%d ID: ", i + 1);
      int studentID = sc.nextInt();
    }
  }
}
