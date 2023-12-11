package lessons3.Lesson15.application;

import lessons3.Lesson15.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    List<Product> list = new ArrayList<>();

    String path = "C:\\temp\\numbers.txt";

    try(BufferedReader br = new BufferedReader(new FileReader(path))) {
      String line = br.readLine();
      while (line != null){
        String[] fields = line.split(",");
        list.add(new Product(fields[0], Double.parseDouble(fields[1])));
        line = br.readLine();
      }

    } catch (IOException ioException){
      System.out.println("Error: " + ioException.getMessage());
    }
  }
}
