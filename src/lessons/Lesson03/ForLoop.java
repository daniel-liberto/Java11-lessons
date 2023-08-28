package lessons.Lesson03;

import java.util.Scanner;

public class ForLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite uma palavra: ");
    String word = sc.nextLine();
    
    for (int index=0; index < 10; index++){
      System.out.printf("Index: [%d], Palavra: [%s]%n", index, word);
    }
  }
}
