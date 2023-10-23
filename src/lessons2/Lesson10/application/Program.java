package lessons2.Lesson10.application;

import lessons2.Lesson10.entities.ImportedProduct;
import lessons2.Lesson10.entities.Product;
import lessons2.Lesson10.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
  public static void main(String[] args) throws ParseException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    List<Product> prodList = new ArrayList<>();

    System.out.print("Enter the number of products: ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.printf("\nProduct #%d data: \n", i + 1);
      System.out.print("[C]ommon, [U]sed or [I]mported? (C/U/I): ");
      char prodType = sc.next().charAt(0);
      System.out.print("Name: ");
      String name = sc.next();
      System.out.print("Price: ");
      Double price = sc.nextDouble();
      if (prodType == 'c' || prodType == 'C'){
       Product product = new Product(name, price);
       prodList.add(product);
      } else if (prodType == 'u' || prodType == 'U'){
        System.out.print("Manufacture date (DD/MM/YYYY): ");
        Date manufacture = sdf.parse(sc.next());
        Product product = new UsedProduct(name, price, manufacture);
        prodList.add(product);
      } else if (prodType == 'i' || prodType == 'I'){
        System.out.print("Custom fee: ");
        Double customFee = sc.nextDouble();
        Product product = new ImportedProduct(name, price, customFee);
        prodList.add(product);
      }
    }

    System.out.println("\nPRICE TAGS: ");
    for (Product item: prodList
         ) {
      System.out.println(item.priceTag(item.getName(), item.getPrice()));
    }

    sc.close();
  }
}
