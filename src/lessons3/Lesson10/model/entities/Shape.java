package lessons3.Lesson10.model.entities;

import lessons3.Lesson10.model.enums.Color;

public abstract class Shape {
  private Color color;

  public Shape(Color color){
    this.color = color;
  }

  public void setColor(Color color){
    this.color = color;
  }

  public Color getColor(){
    return color;
  }

  public abstract double area();
}
