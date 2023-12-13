package lessons3.Lesson20.application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {
  public static void main(String[] args) {

    System.out.println("\nRemove if the word have more than 3 char:");
    Set<String> set = new LinkedHashSet<>();

    set.add("Tv");
    set.add("Tablet");
    set.add("Notebook");
    set.removeIf(x -> x.length() >= 3);

    for (String p : set) {
      System.out.println(p);
    }

    System.out.println("\nRemove if the word have initial char equals T:");
    Set<String> set2 = new LinkedHashSet<>();

    set2.add("Tv");
    set2.add("Tablet");
    set2.add("Notebook");
    set2.removeIf(x -> x.charAt(0) == 'T');

    for (String p : set2) {
      System.out.println(p);
    }

  }
}
