package lessons.Lesson2;

public class StringFormat {
  public static void main(String[] args) {

    /*
    * .toLowerCase()
    * .toUppercase()
    * .trim()
    * .substring(start, end)
    * .replace("char", "newChar")
    * .indexOf("char")
    * .lastIndexOf("char")
    * .charAt(int)
    * .compareTo("string") == 0 ? true : false // var.compareTo("string") == 0 zero differences between
    * .compareToIgnoreCase("string") == 0 ? true : false
    * .endsWith("string/char")
    * .startsWith("string/char", int start) // www.google.com = ("google", 4) = google.com
    * .toCharArray() // var become vector
    * .isEmpty()
    * .split("string", do_x_times) // do_x_times = int (optional)
    * String.valueOf(var) // convert to String
    * */

    String originalRaw = "-* -*123fasfq3845y738R$ 50,0027h2rjwe198    *";

    int indexString = originalRaw.indexOf("R$");
    int indexComma = originalRaw.substring(indexString).indexOf(",") + 3;
    String fixedString = originalRaw.substring(indexString, indexString + indexComma).replace(",", ".");
    System.out.printf("Original String: %s%n", originalRaw);
    System.out.printf("Fixed String: %s", fixedString);

  }
}
