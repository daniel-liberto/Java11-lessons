package lessons2.Lesson11.entities;

import lessons2.Lesson11.entities.enums.Color;

public abstract class Shape {
  private Color color;

  public Shape(){}
  public Shape(Color color){
    this.color = color;
  }

  public void setColor(Color color){
    this.color = color;
  }

  public Color getColor(){
    return color;
  }

  public abstract  double area();

}
