package lessons3.Lesson07.application;

import lessons3.Lesson07.entities.Products;

import java.util.Locale;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    String[] prod1 = "TV LED,1290.00,1".split(",");
    Products prods1 = new Products(prod1[0], Double.parseDouble(prod1[1]), Integer.parseInt(prod1[2]));

    String[] prod2 = "Video Game Chair,350.50,3".split(",");
    Products prods2 = new Products(prod2[0], Double.parseDouble(prod2[1]), Integer.parseInt(prod2[2]));

    String[] prod3 = "iPhone X,900.00,2".split(",");
    Products prods3 = new Products(prod3[0], Double.parseDouble(prod3[1]), Integer.parseInt(prod3[2]));

    String[] prod4 = "Samsung Galaxy 9,850.00,2".split(",");
    Products prods4 = new Products(prod4[0], Double.parseDouble(prod4[1]), Integer.parseInt(prod4[2]));


    Products[] prodVector = new Products[] {prods1, prods2, prods3, prods4};
    

  }
}