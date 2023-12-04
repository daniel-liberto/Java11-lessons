package lessons3.Lesson11.application;

import lessons3.Lesson11.devices.ComboDevice;
import lessons3.Lesson11.devices.ConcretePrinter;
import lessons3.Lesson11.devices.ConcreteScanner;

import java.util.Locale;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    System.out.println("\nINDIVIDUAL RESULT:");
    ConcretePrinter p = new ConcretePrinter("1000");
    p.processDoc("My Letter");
    p.print("My Letter");

    ConcreteScanner s = new ConcreteScanner("2003");
    s.processDoc("My Email");
    System.out.println("Scan result: " + s.scan());

    System.out.println("\nCOMBO RESULT:");
    ComboDevice c = new ComboDevice("2081");
    c.processDoc("My dissertation");
    c.print("My dissertation");
    System.out.println("Scan result: " + c.scan());
  }
}
