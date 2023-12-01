package lessons3.Lesson10.model.entities;

import lessons3.Lesson10.model.enums.Color;

public class Circle extends AbstractShape {

  private Double radius;

  public Circle(Color color, Double radius){
    super(color);
    this.radius = radius;
  }

  public void setRadius(Double radius){
    this.radius = radius;
  }

  public Double getRadius(){
    return radius;
  }

  @Override
  public double area(){
    return Math.PI * radius * radius;
  }
}
