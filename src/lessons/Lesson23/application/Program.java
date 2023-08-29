package lessons.Lesson23.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("\nHow many elements vector will have? ");
    int n = sc.nextInt();

    int[] vector = new int[n];

    for (int i = 0; i < vector.length; i++) {
      System.out.printf("Type number %d: ", i + 1);
      vector[i] = sc.nextInt();
    }
    int sum = 0;
    int counter = 0;
    for (int num : vector) {
      if ((num % 2) == 0) {
        sum += num;
        counter++;
      }
    }
    if (counter != 0) {
      System.out.printf("\nAVERAGE OF EVEN NUMBERS: %d", sum / counter);
    }
    else {
      System.out.println("\nTHERE IS NO PAIR NUMBER TYPED");
    }
  }
}
