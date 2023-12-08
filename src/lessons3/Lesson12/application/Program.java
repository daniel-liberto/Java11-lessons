package lessons3.Lesson12.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    List<String> list = new ArrayList<>();
    String path = "C:\\temp\\in.txt";

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String name = br.readLine();
      while (name != null){
        list.add(name);
        name = br.readLine();
      }
      Collections.sort(list);
      for (String s: list) {
        System.out.println(s);
      }
    }catch (IOException ioException){
      System.out.println("Error: " + ioException.getMessage());
    }
  }
}
