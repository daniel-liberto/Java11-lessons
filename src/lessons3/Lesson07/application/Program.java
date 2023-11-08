package lessons3.Lesson07.application;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    String sourcePath = "c:\\temp\\source.csv";

    try (FileWriter fw = new FileWriter(sourcePath)) {
      fw.write("TV LED,1290.99,1");
      fw.write("Video Game Chair,350.50,3");
      fw.write("Samsung Galaxy 9,850.00,2");
    } catch (IOException ioException){
      System.out.println("Error: " + ioException);
    }


    System.out.println(sourcePath);

    sc.close();
  }
}
