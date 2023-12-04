package lessons3.Lesson11.application;

import lessons3.Lesson11.devices.PrinterDevice;
import lessons3.Lesson11.devices.ScannerDevice;

import java.util.Locale;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    PrinterDevice p = new PrinterDevice("1000");
    p.processDoc("My Letter");
    p.print("My Letter");

    ScannerDevice s = new ScannerDevice("2003");
    s.processDoc("My Email");
    System.out.println("Scan result: " + s.scan());
  }
}
