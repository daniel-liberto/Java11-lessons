package lessons3.Lesson11.devices;

public class PrinterDevice extends Device{
  public PrinterDevice(String serialNumber){
    super(serialNumber);
  }

  @Override
  public void processDoc(String doc){
    System.out.println("Printer processing: " + doc);
  }

  public void print(String doc){
    System.out.println("Printing: " + doc);
  }
}
