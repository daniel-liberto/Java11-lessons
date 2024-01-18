package lessonsDatabase.lessonsDB6.application;

import lessonsDatabase.lessonsDB6.model.dao.DaoFactory;
import lessonsDatabase.lessonsDB6.model.dao.SellerDao;
import lessonsDatabase.lessonsDB6.model.entities.Department;
import lessonsDatabase.lessonsDB6.model.entities.Seller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
  public static void main(String[] args) {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    Department obj = new Department(1, "Books");
    try {
      Seller seller = new Seller(21, "Bob", "bob@gmail.com", sdf.parse("24/12/2001"), 3000.0, obj);
      System.out.println(seller);
    } catch (ParseException parseException){
      System.out.println(parseException.getMessage());
    }
    SellerDao sellerDao = DaoFactory.createSellerDao();


  }
}
