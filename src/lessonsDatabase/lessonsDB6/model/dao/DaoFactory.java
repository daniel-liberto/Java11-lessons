package lessonsDatabase.lessonsDB6.model.dao;

import lessonsDatabase.lessonsDB.db.DB;
import lessonsDatabase.lessonsDB6.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
  public static SellerDao createSellerDao(){
    return new SellerDaoJDBC(DB.getConnection());
  }

}
