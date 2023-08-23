package lessons.Lesson9.util;

public class CurrencyConverter {

  public static final double TAX = 6.0;

  public static double dollarConverter(double dollar, double dollarBought) {
    double totalWithoutTax = dollar * dollarBought;
    return totalWithoutTax + ((totalWithoutTax / 100) * TAX);
  }
}
