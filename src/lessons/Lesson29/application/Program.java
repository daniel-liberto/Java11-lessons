package lessons.Lesson29.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    List<String> list = new ArrayList<>();

    list.add("Maria");
    list.add("Alex");
    list.add("Bob");
    list.add("Anna");
    list.add(1, "Marco");

    System.out.printf("List size: %d%n", list.size());
    list.remove("Anna");
    System.out.printf("List size: %d%n", list.size());

    for (String name: list) {
      System.out.println(name);
    }
    System.out.println("----------------------------");
    list.removeIf(x -> x.toUpperCase().charAt(0) == 'M');
    System.out.printf("List size: %d%n", list.size());
    for (String name: list) {
      System.out.println(name);
    }
    list.add("Abigail");
    System.out.println("----------------------------");
    System.out.println("Index of Bob: " + list.indexOf("Bob"));
    System.out.println("Index of Marco: " + list.indexOf("Marco"));
    System.out.println("----------------------------");
    List<String> result = list.stream().filter(x -> x.toUpperCase().charAt(0) == 'A').collect(Collectors.toList());
    System.out.println("People start with A: ");
    for (String nameResult: result
         ) {
      System.out.println(nameResult);
    }
    System.out.println("----------------------------");
    System.out.println("Find first person start with A: ");
    String name = list.stream().filter(x -> x.toUpperCase().charAt(0) == 'A').findFirst().orElse(null);
    System.out.println(name);
    System.out.println("----------------------------");
    System.out.println("Deleting Alex");
    list.remove("Alex");
    String name2 = list.stream().filter(x -> x.toUpperCase().charAt(0) == 'A').findFirst().orElse(null);
    System.out.println("Find first person start with A: ");
    System.out.println(name2);
    System.out.println("----------------------------");
    System.out.println("Deleting Abigail");
    list.remove("Abigail");
    String name3 = list.stream().filter(x -> x.toUpperCase().charAt(0) == 'A').findFirst().orElse(null);
    System.out.println("Find first person start with A: ");
    System.out.println(name3);
  }
}
