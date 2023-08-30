package lessons.Lesson28.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    String[] vect = new String[] {"Maria", "Bob", "Alex"};
    System.out.println("\n*════════════════════════════*");
    System.out.println("CONVENTIONAL FOR LOOP: ");
    for (int i = 0; i < vect.length; i++) {
      if (vect[i].toUpperCase().startsWith("M")){
        System.out.println("\nStart with M: ");
        System.out.println(vect[i]);
      } else if (vect[i].toLowerCase().endsWith("x")) {
        System.out.println("\nEnds with x: ");
        System.out.println(vect[i]);
      }
    }
    System.out.println("\n*════════════════════════════*");
    System.out.println("FOR EACH LOOP: ");
    for (String name : vect) {
      if (name.toUpperCase().startsWith("M")) {
        System.out.println("\nStart with M");
        System.out.println(name);
      } else if (name.toLowerCase().endsWith("x")) {
        System.out.println("\nEnds with x");
        System.out.println(name);
      }
    }
  }
}
