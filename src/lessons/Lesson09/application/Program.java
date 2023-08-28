package lessons.Lesson09.application;

import lessons.Lesson09.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double dollarPrice;
    double dollarBuy;

    System.out.print("What is the actual dollar price? $");
    dollarPrice = sc.nextDouble();

    System.out.print("How many dollars will be bought? $");
    dollarBuy = sc.nextDouble();

    double resultDollar = CurrencyConverter.dollarConverter(dollarPrice, dollarBuy);
    System.out.printf("Amount to be paid in BRL: R$ %.2f", resultDollar);

  }
}
