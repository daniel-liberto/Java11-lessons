package lessons3.Lesson09.entities;

public class PaypalService implements OnlinePaymentService{

  @Override
  public Double interest(Double amount, Integer months) {
    return (amount / 100) * months;
  }

  @Override
  public Double paymentFee(Double amount) {
    return (amount / 100) * 2;
  }

}
