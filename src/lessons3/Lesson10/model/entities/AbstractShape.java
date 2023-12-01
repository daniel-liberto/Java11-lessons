package lessons3.Lesson10.model.entities;

import lessons3.Lesson10.model.enums.Color;

public abstract class AbstractShape implements Shape {

  private Color color;

  public AbstractShape(Color color){
    this.color = color;
  }

  public void setColor(Color color){
    this.color = color;
  }

  public Color getColor(){
    return color;
  }
}
