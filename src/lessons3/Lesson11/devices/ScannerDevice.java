package lessons3.Lesson11.devices;

public class ScannerDevice extends Device{
  public ScannerDevice(String serialNumber){
    super(serialNumber);
  }

  @Override
  public void processDoc(String doc){
    System.out.println("Scanner processing: " + doc);
  }

  public String scan(){
    return "Scanned content";
  }
}
