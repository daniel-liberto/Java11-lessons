package lessons2.Lesson11.application;

import lessons2.Lesson11.entities.Circle;
import lessons2.Lesson11.entities.Rectangle;
import lessons2.Lesson11.entities.Shape;
import lessons2.Lesson11.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of shapes: ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.printf("Shape #%d data: ", i + 1);
      System.out.print("[R]ectangle or [C]ircle (R/C)? ");
      char shapeType = sc.next().charAt(0);
      System.out.print("Color (BLACK/BLUE/RED): ");
      String colorType = sc.next();

      List<Shape> shapeList = new ArrayList<>();

      if(shapeType == 'R' || shapeType == 'r'){
        System.out.print("Width: ");
        Double width = sc.nextDouble();
        System.out.print("Height: ");
        Double height = sc.nextDouble();
        Shape rec = new Rectangle(Color.valueOf(colorType), width, height);
        shapeList.add(rec);
      } else if (shapeType == 'C' || shapeType == 'c'){
        System.out.println("Radius: ");
        Double radius = sc.nextDouble();
        Shape rec = new Circle(Color.valueOf(colorType), radius);
        shapeList.add(rec);
      }
    }


    sc.close();
  }
}
