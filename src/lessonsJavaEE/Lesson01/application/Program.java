package lessonsJavaEE.Lesson01.application;

import lessonsJavaEE.Lesson01.domain.Person;

import java.util.Locale;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Person p1 = new Person(1, "Greg", "greg@gmail.com");
    Person p2 = new Person(2, "John", "john@gmail.com");
    Person p3 = new Person(3, "Chris", "chris@gmail.com");
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
  }
}
