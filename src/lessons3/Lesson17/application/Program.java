package lessons3.Lesson17.application;

import lessons3.Lesson17.entities.Circle;
import lessons3.Lesson17.entities.Rectangle;
import lessons3.Lesson17.entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    List<Shape> myShapes = new ArrayList<>();
    myShapes.add(new Rectangle(3.0, 2.0));
    myShapes.add(new Circle(2.0));

    System.out.println("Total area: " + String.format("%.2f", totalArea(myShapes)));

  }
    public static double totalArea(List<? extends Shape> list){
      double sum = 0.0;
      for (Shape s: list) {
        sum += s.area();
      }
      return sum;
    }
}
