package lessons.Lesson6.application;

import lessons.Lesson6.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Rectangle rect1 = new Rectangle();

    System.out.println("\nEnter rectangle dimensions: ");
    System.out.println("Width: ");
    rect1.width = sc.nextDouble();
    System.out.println("Height: ");
    rect1.height = sc.nextDouble();

    System.out.printf("AREA = %.2f%n", rect1.Area());
    System.out.printf("PERIMETER = %.2f%n", rect1.Perimeter());
    System.out.printf("DIAGONAL = %.2f%n", rect1.Diagonal());

  }
}
