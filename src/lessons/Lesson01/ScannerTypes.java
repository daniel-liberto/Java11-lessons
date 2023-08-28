package lessons.Lesson1;

import java.util.Locale;
import java.util.Scanner;

public class ScannerTypes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double total;
        String firstName;
        String entireName;
        int age;

        System.out.println("Type your first name: ");
        firstName = sc.next(); // first String only input

        sc.nextLine();  //this will solve nextLine problem of consuming the "Enter" key.

        System.out.println("Type your entire name: ");
        entireName = sc.nextLine(); // String line input

        System.out.println("What is your age? ");
        age = sc.nextInt(); // Int input

        System.out.println("Type a value: (ex: 12.53) ");
        total = sc.nextDouble(); // Double input

        System.out.printf("Your name is: %s%n", firstName);
        System.out.printf("Your entire name is: %s%n", entireName);
        System.out.printf("Your age is: %d%n", age);
        System.out.printf("The total is: %.2f", total);

        sc.close();
    }
}
