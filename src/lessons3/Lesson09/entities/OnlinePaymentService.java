package lessons3.Lesson09.entities;

public interface OnlinePaymentService {
  Double paymentFee(Double amount);
  Double interest(Double amount, Integer months);
}
