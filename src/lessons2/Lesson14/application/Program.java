package lessons2.Lesson14.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    File file = new File("C:\\Users\\Nomdes\\Documents\\in.txt");
    Scanner sc = null;
    try {
      sc = new Scanner(file);
      while (sc.hasNextLine()){
        System.out.println(sc.nextLine());
      }
    } catch (FileNotFoundException notFound){
      System.out.println("\nError opening file: \n" + notFound.getMessage());
    } finally {
      if(sc != null){
        sc.close();
      }
      System.out.println("Finally block executed.");
    }
  }
}
