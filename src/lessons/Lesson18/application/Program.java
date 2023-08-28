package lessons.Lesson18.application;

import lessons.Lesson18.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("How many persons will be? ");
    int n = sc.nextInt();

    Person[] personVector = new Person[n];

    for (int i = 0; i < n; i++) {
      System.out.printf("\nData of person %d%n", i + 1);
      sc.nextLine();
      System.out.print("Name: ");
      String name = sc.nextLine();
      System.out.print("Age: ");
      int age = sc.nextInt();
      System.out.print("Height: ");
      double height = sc.nextDouble();
      personVector[i] = new Person(name, age, height);
    }

    double totalHeight = sumHeight(personVector, n);
    System.out.printf("\nAverage height: %.2f%n",totalHeight);
    
    double lessSixteenPer = lessThanSixteenPercentage(personVector, n);
    System.out.println(lessSixteenPer + "% of people are below 16 years");
    
    String[] lessSixteenName = lessThanSixteen(personVector, n);

    System.out.println("\nKids below sixteen name:");
    for (String s : lessSixteenName) {
      if (s != null) {
      System.out.println("  * " + s);
      }
    }
    
    sc.close();
  }

  public static double sumHeight(Person[] personArray, int n) {
    double sumHeight = 0;
    for (int i = 0; i < n; i++) {
      sumHeight += personArray[i].getHeight();
    }
    return sumHeight / n;
  }

  public static double lessThanSixteenPercentage(Person[] personArray, int n) {
    double percentAge = 0;
    for (int i = 0; i < n; i++) {
      if (personArray[i].getAge() < 16) {
        percentAge++;
      }
    }
    return (percentAge / personArray.length) * 100;
  }

  public static String[] lessThanSixteen(Person[] personArray, int n) {
    String[] vectorString = new String[n];
    for (int i = 0; i < n; i++) {
      if (personArray[i].getAge() < 16) {
        vectorString[i] = personArray[i].getName();
      }
    }
    return vectorString;
  }
}
