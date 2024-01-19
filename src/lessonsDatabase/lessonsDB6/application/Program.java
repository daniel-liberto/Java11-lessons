package lessonsDatabase.lessonsDB6.application;

import lessonsDatabase.lessonsDB6.model.dao.DaoFactory;
import lessonsDatabase.lessonsDB6.model.dao.SellerDao;
import lessonsDatabase.lessonsDB6.model.entities.Seller;

public class Program {
  public static void main(String[] args) {
    SellerDao sellerDao = DaoFactory.createSellerDao();

    System.out.println("=== TEST 1: seller findById ===");
    Seller seller = sellerDao.findById(3);
    System.out.println(seller);
  }
}
