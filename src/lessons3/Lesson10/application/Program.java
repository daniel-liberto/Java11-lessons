package lessons3.Lesson10.application;

import lessons3.Lesson10.model.entities.Circle;
import lessons3.Lesson10.model.entities.Rectangle;
import lessons3.Lesson10.model.entities.Shape;
import lessons3.Lesson10.model.enums.Color;

import java.util.Locale;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Shape s1 = new Circle(Color.BLACK, 2.0);
    Shape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);

    System.out.println("Circle color: " + s1.getColor());
    System.out.println("Circle area: " + String.format("%.3f", s1.area()));
    System.out.println("Rectangle color: " + s2.getColor());
    System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
  }
}
