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

    List<Shape> shapeList = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      System.out.printf("\nShape #%d data: \n", i + 1);
      System.out.print("[R]ectangle or [C]ircle (R/C)? ");
      char shapeType = sc.next().charAt(0);
      System.out.print("Color (BLACK/BLUE/RED): ");
      Color colorType = Color.valueOf(sc.next());


      if(shapeType == 'R' || shapeType == 'r'){
        System.out.print("Width: ");
        double width = sc.nextDouble();
        System.out.print("Height: ");
        double height = sc.nextDouble();
        shapeList.add(new Rectangle(colorType, width, height));

      } else if (shapeType == 'C' || shapeType == 'c'){
        System.out.print("Radius: ");
        double radius = sc.nextDouble();

        shapeList.add(new Circle(colorType, radius));
      }
    }
    System.out.println("\nSHAPE AREAS: ");
    for (Shape item : shapeList
         ) {
      System.out.println(String.format("%.2f", item.area()));
    }


    sc.close();
  }
}
