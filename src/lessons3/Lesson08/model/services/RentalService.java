package lessons3.Lesson08.model.services;

import lessons3.Lesson08.model.entities.CarRental;
import lessons3.Lesson08.model.entities.Invoice;

import java.time.Duration;

public class RentalService {
  private Double pricePerHour;
  private Double pricePerDay;
  private TaxServices taxService;

  public RentalService(Double pricePerHour, Double pricePerDay, TaxServices taxService){
    this.pricePerHour = pricePerHour;
    this.pricePerDay = pricePerDay;
    this.taxService = taxService;
  }

  public void processInvoice(CarRental carRental){

    double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
    double hours = minutes / 60.0;

    double basicPayment;
    if (hours <= 12.0){
      basicPayment = pricePerHour * Math.ceil(hours);
    } else {
      basicPayment = pricePerDay * Math.ceil(hours / 24.0);
    }

    double tax = taxService.tax(basicPayment);

    carRental.setInvoice(new Invoice(basicPayment, tax));
  }

  public void setPricePerHour(Double pricePerHour){
    this.pricePerHour = pricePerHour;
  }

  public Double getPricePerHour(){
    return pricePerHour;
  }

  public void setPricePerDay(Double pricePerDay){
    this.pricePerDay = pricePerDay;
  }

  public Double getPricePerDay(){
    return pricePerDay;
  }

  public void setTaxService(TaxServices taxService){
    this.taxService = taxService;
  }

  public TaxServices getTaxService(){
    return taxService;
  }

}
