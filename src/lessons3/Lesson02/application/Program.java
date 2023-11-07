package lessons3.Lesson02.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    String path = "c:\\temp\\in.txt";
    FileReader fr = null;
    BufferedReader br = null;
    try {
      fr = new FileReader(path);
      br = new BufferedReader(fr);

      String line = br.readLine();
      while (line != null){
        System.out.println(line);
        line = br.readLine();
      }
    } catch (IOException ioException){
      System.out.println("Error: " + ioException.getMessage());
    } finally {
      try {
        if (br != null){
          br.close();
        }
        if (fr != null){
          fr.close();
        }
      } catch (IOException ioException){
        ioException.printStackTrace();
      }

    }
  }
}
