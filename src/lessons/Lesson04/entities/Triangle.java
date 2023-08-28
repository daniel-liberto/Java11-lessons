package lessons.Lesson4.entities;

public class Triangle {
  public double a;
  public double b;
  public double c;

  public Triangle(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double calculateArea() {
    double p = (a + b + c) / 2.0;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
  }
}
