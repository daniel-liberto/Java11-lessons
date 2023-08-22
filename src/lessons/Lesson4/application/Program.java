package lessons.Lesson4.application;

import lessons.Lesson4.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double[] t1 = new double[3];
    double[] t2 = new double[3];

    System.out.println("Enter the measures of triangle X: ");
    for (int i = 0; i < 3; i++) {
      t1[i] = sc.nextDouble();
    }
    System.out.println("Enter the measures of triangle Y: ");
    for (int i = 0; i < 3; i++) {
      t2[i] = sc.nextDouble();
    }

    Triangle x = new Triangle(t1[0], t1[1], t1[2]);
    Triangle y = new Triangle(t2[0], t2[1], t2[2]);

    String largerArea = findLargerArea(x, y);
    System.out.println("Larger triangle area: " + largerArea);

    sc.close();
  }

  public static String findLargerArea(Triangle x, Triangle y) {
    double areaX = x.calculateArea();
    double areaY = y.calculateArea();
    System.out.printf("Area of X: %.2f | Area of Y: %.2f%n", areaX, areaY);
    return (areaX > areaY) ? "X" : "Y";
  }
}
