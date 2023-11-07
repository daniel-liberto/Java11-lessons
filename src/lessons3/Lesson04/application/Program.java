package lessons3.Lesson04.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    String[] lines = new String[]{"Good morning", "Good afternoon", "Good night"};

    String path = "c:\\temp\\out.txt";


    // the "true" in fileWriter means "overwrite" if true they will recreate the file
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
      for (String line : lines) {
        bw.write(line);
        bw.newLine();
      }
    } catch (IOException ioException){
      ioException.printStackTrace();
    }
  }
}
