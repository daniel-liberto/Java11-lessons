package lessons3.Lesson09.entities;

import java.util.Calendar;
import java.util.Date;

public class ContractService {

  private Date addMonths(Date date, int n){
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    cal.add(Calendar.MONTH, n);
    return cal.getTime();
  }

  public void processContract(Contract contract, Integer months){
      OnlinePaymentService service = new PaypalService();
      Double perMonth = contract.getTotalValue() / months; // 200
    for (int i = 0; i < months; i++) {
      Date date = addMonths(contract.getDate(), i + 1);

      Double interestValue = service.interest(perMonth, i + 1); // 2
      Double feeValue = service.paymentFee(perMonth + interestValue);  // 4.04
      contract.addInstallments(new Installment(date, perMonth + feeValue + interestValue));
    }
  }
}
