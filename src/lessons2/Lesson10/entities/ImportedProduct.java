package lessons2.Lesson10.entities;

public class ImportedProduct extends Product {
  private Double customFee;

  public ImportedProduct(){}

  public ImportedProduct(String name, Double price, Double customFee){
    super(name, price);
    this.customFee = customFee;
  }

  public void setCustomFee(Double customFee){
    this.customFee = customFee;
  }

  public Double getCustomFee(){
    return customFee;
  }

  public Double totalPrice(Double price){
    return price + customFee;
  }

  @Override
  public String priceTag(String name, Double price){
    StringBuilder sb = new StringBuilder();
    sb.append(name + " $");
    sb.append(price + customFee);
    sb.append(" (Customs fee: $");
    sb.append(customFee + ")");
    return sb.toString();
  }

}
