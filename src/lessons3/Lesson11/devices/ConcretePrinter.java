package lessons3.Lesson11.devices;

public class ConcretePrinter extends Device implements PrinterInterface{
  public ConcretePrinter(String serialNumber){
    super(serialNumber);
  }

  @Override
  public void processDoc(String doc){
    System.out.println("Printer processing: " + doc);
  }

  @Override
  public void print(String doc){
    System.out.println("Printing: " + doc);
  }
}
