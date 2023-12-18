package lessons3.Lesson25.application;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program {
  public static void main(String[] args) {

    Map<String, String> cookies  = new LinkedHashMap<>();

  cookies.put("username", "maria");
  cookies.put("email", "maria@gmail.com");
  cookies.put("phone", "997111122");

  String username = cookies.get("username");
  cookies.remove("username");

    System.out.println("\nALL COOKIES: ");
    for (String key: cookies.keySet()) {
      System.out.println(key + ": " + cookies.get(key));
    }
  }
}
