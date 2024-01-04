package lessons4.Lesson05.application;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

    System.out.println("Odd or even?");
    System.out.println("The follow numbers: " + list);
    Stream<String> st1 = list.stream().map(x -> x % 2 == 0 ? "odd" : "even");
    System.out.println("Are: " + Arrays.toString(st1.toArray()));

    Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
    System.out.println("\n" + Arrays.toString(st2.toArray()));

    Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
    System.out.println(Arrays.toString(st3.limit(10).toArray()));

    System.out.println("\nFibonacci: ");
    Stream<Long> st4 = Stream.iterate(new Long[]{0L, 1L}, p ->  new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);
    System.out.println(Arrays.toString(st4.limit(10).toArray()));
  }
}
