package lessons2.Lesson11.entities;

import lessons2.Lesson11.entities.enums.Color;

public class Rectangle extends Shape {

  private Double width;
  private Double height;

  public Rectangle(){
    super();
  }
  public Rectangle(Color color, Double width, Double height){
    super(color);
    this.width = width;
    this.height = height;
  }

  public void setWidth(Double width){
    this.width = width;
  }

  public Double getWidth(){
    return width;
  }

  public void setHeight(Double height){
    this.height = height;
  }

  public Double getHeight(){
    return height;
  }

  @Override
  public double area(){
    return width * height;
  };
}
