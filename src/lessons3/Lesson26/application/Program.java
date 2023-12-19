package lessons3.Lesson26.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Map<String, Integer> candidatesList = new TreeMap<>();

    String  path = "c:\\temp\\candidates.csv";

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String line =  br.readLine();
      while (line != null){
        String[] fields = line.split(",");
        if(candidatesList.containsKey(fields[0])){
          Integer updatedNumber = candidatesList.get(fields[0]) + Integer.parseInt(fields[1]);
          candidatesList.put(fields[0], updatedNumber);
        } else {
        candidatesList.put(fields[0], Integer.parseInt(fields[1]));
        }
        line = br.readLine();
      }

      System.out.println("\nTOTAL VOTES: ");
      for (String name : candidatesList.keySet()) {
        System.out.println(name + ", "  + candidatesList.get(name));
      }
    } catch (IOException ioException){
      System.out.println("Error: " + ioException.getMessage());
    }
  }
}
