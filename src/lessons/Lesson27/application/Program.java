package lessons.Lesson27.application;

import lessons.Lesson27.entities.Customer;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("How many rooms will be rented? ");
    int n = sc.nextInt();

    Customer[] clients = new Customer[10];
    int loopCounter = 0;
    do {
      String name;
      String email;
      int room;
      for (int i = 0; i < n; i++) {
        System.out.println("\n*══════════════════════*");
        System.out.printf("Rent #%d:%n", i + 1);
        sc.nextLine();
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Email: ");
        email = sc.nextLine();
        System.out.println("*══════════════════════*");
        while (true) {
          System.out.println("\nRooms available: ");
          System.out.println("X is already busy");
          System.out.println("╔═════════════════════════════════════════════════╗");
          for (int j = 0; j < clients.length; j++) {
            if (clients[j] != null) {
              System.out.print(" |X| ");
            } else {
              System.out.printf(" |%d| ", j + 1);
            }
          }
          System.out.println("\n╚═════════════════════════════════════════════════╝");
          System.out.println("Customers: ");
          for (int k = 0; k < clients.length; k++) {
            if(clients[k] != null){
              System.out.printf("%d: %s, %s%n", k + 1, clients[k].getName(), clients[k].getEmail());
            }
          }
          System.out.print("\nRoom number: ");
          room = sc.nextInt() - 1;
          if (room <= 9 && room >= 0) {
            if (clients[room] == null) {
              clients[room] = new Customer(name, email);
              System.out.printf("\nSuccessfully rented to room %d%n", room + 1);
              System.out.println("Have a great stay!");
              loopCounter++;
              break;
            } else {
              System.out.println("Room already rented, choose another.");
            }
          } else {
            System.out.println("Wrong room, choose between 1 to 10");
          }
        }
      }
    } while (loopCounter < n);
    System.out.println("\nAll rental requests have been completed.");
    sc.close();
  }
}
