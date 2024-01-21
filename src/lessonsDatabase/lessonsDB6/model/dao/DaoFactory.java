package lessonsDatabase.lessonsDB6.model.dao;

import lessonsDatabase.lessonsDB.db.DB;
import lessonsDatabase.lessonsDB6.model.dao.impl.DepartmentDaoJDBC;
import lessonsDatabase.lessonsDB6.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
  public static SellerDao createSellerDao(){
    return new SellerDaoJDBC(DB.getConnection());
  }

  public static DepartmentDao createDepartmentDao(){
    return new DepartmentDaoJDBC((DB.getConnection()));
  }

}
