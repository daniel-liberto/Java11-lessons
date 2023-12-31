package lessons3.Lesson06.application;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a file path: ");
    String strPath = sc.nextLine();

    File path = new File(strPath);
    System.out.println("getPath: " + path.getPath());
    System.out.println("getName: " + path.getName());
    System.out.println("getParent: " + path.getParent());

    sc.close();
  }
}
