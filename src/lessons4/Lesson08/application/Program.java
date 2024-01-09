package lessons4.Lesson08.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter full file path: ");
    String path = sc.nextLine();

    System.out.print("Enter the salary target value: ");
    double salary = sc.nextDouble();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String line = br.readLine();
      while (line != null){

        line = br.readLine();
      }
    } catch (IOException ioException) {
      System.out.println("Error: " + ioException.getMessage());
    }
  }
}
