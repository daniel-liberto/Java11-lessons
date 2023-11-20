package lessons3.Lesson09.application;

import lessons3.Lesson09.entities.Contract;
import lessons3.Lesson09.entities.ContractService;
import lessons3.Lesson09.entities.Installment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) throws ParseException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.println("Enter with contract data: ");
    System.out.print("Number: ");
    int contractNumber = sc.nextInt();
    sc.nextLine();
    System.out.print("Data (dd/MM/yyyy): ");
    Date date = sdf.parse(sc.nextLine());
    System.out.print("Contract value: ");
    double totalValue = sc.nextDouble();
    System.out.print("Enter with the installment number: ");
    int installmentsNumber = sc.nextInt();

    ContractService service = new ContractService();

    Contract contract = new Contract(contractNumber, date, totalValue);

    service.processContract(contract, installmentsNumber);

    System.out.println("\nINSTALLMENTS: ");
    for (Installment installment: contract.getInstallment()
         ) {
      System.out.println(installment);
    }

    sc.close();
  }
}
