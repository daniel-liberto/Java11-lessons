package lessons.Lesson3;

import java.util.Scanner;

public class WhileLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite uma palavra: ");
    String palavra = sc.nextLine();
    int counter = 0;

    while (counter <= 10){
      System.out.printf("Loop: %d, Palavra: %s%n",counter, palavra);
      counter += 1;
    }
    sc.close();
  }
}
