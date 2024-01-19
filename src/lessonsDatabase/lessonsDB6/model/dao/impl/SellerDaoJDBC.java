package lessonsDatabase.lessonsDB6.model.dao.impl;

import lessonsDatabase.lessonsDB.db.DB;
import lessonsDatabase.lessonsDB5.exceptions.DbException;
import lessonsDatabase.lessonsDB6.model.dao.SellerDao;
import lessonsDatabase.lessonsDB6.model.entities.Department;
import lessonsDatabase.lessonsDB6.model.entities.Seller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SellerDaoJDBC implements SellerDao {
  private Connection conn;
  public SellerDaoJDBC(Connection conn){
    this.conn = conn;
  }
  public void insert(Seller obj){

  }
  public void update(Seller obj){

  }
  public void deleteById(Integer id){

  }

  public Seller findById(Integer id) {
    PreparedStatement st = null;
    ResultSet rs = null;
    try {
      st = conn.prepareStatement(
              "SELECT seller.*,department.Name as DepName "
              + "FROM seller INNER JOIN department "
              + "ON seller.DepartmentId = department.Id "
              + "WHERE seller.Id = ?");
      st.setInt(1, id);
      rs = st.executeQuery();
      if (rs.next()){
        Department dep = instantiateDepartment(rs);
        Seller obj = instantiateSeller(rs, dep);
        return obj;
      } else {
        return null;
      }
    } catch (SQLException sqlException){
      throw new DbException(sqlException.getMessage());
    } finally {
      DB.closeStatement(st);
      DB.closeResultSet(rs);
    }

  }
  private Department instantiateDepartment(ResultSet rs) throws SQLException{
    Department dep = new Department();
    dep.setId(rs.getInt("DepartmentId"));
    dep.setName(rs.getString("DepName"));
    return dep;
  }
  private Seller instantiateSeller(ResultSet rs, Department dep) throws  SQLException{
    Seller obj = new Seller();
    obj.setId(rs.getInt("Id"));
    obj.setName(rs.getString("Name"));
    obj.setEmail(rs.getString("Email"));
    obj.setBaseSalary(rs.getDouble("BaseSalary"));
    obj.setBirthDate(rs.getDate("BirthDate"));
    obj.setDepartment(dep);
    return obj;
  }
  public List<Seller> findAll(){
    return null;
  }
}
