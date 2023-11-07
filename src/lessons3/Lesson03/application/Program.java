package lessons3.Lesson03.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    String path = "c:\\temp\\in.txt";

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String line = br.readLine();
      while (line != null){
        System.out.println(line);
        line = br.readLine();
      }
    } catch (IOException ioException){
      System.out.println("Error: " + ioException.getMessage());
    }
  }
}
