package lessons3.Lesson01.application;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    File file = new File("c:\\temp\\in.txt");
    Scanner sc = null;
    try {
      sc = new Scanner(file);
      while (sc.hasNextLine()){
        System.out.println(sc.nextLine());
      }
    } catch (IOException ioException){
      System.out.println("Error: " + ioException.getMessage());
    } finally {
      if(sc != null){
        sc.close();
      }
    }
  }
}
