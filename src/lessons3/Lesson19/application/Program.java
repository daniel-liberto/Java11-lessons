package lessons3.Lesson19.application;

import lessons3.Lesson19.entities.Client;

import java.util.Locale;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Client c1 = new Client("Maria", "maria@gmail.com");
    Client c2 = new Client("Maria", "maria@gmail.com");

    // true, because they are on the same memory slot
    String s1 = "Test";
    String s2 = "Test";

    // false, because they are not sharing the same mem slot
    String s3 = new String("Test");
    String s4 = new String("Test");

    System.out.println(c1.hashCode());
    System.out.println(c2.hashCode());
    System.out.println(c1.equals(c2)); // true
    System.out.println(s1 == s2); // true
    System.out.println(s3 == s4); // false
  }
}
