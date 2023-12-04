package lessons3.Lesson11.devices;

public class Scanner extends Device{
  public Scanner(String serialNumber){
    super(serialNumber);
  }

  @Override
  public void processDoc(String doc){
    System.out.println("Scanner processing: " + doc);
  }

  public void scanner(String doc){
    System.out.println("Scanning: " + doc);
  }
}
