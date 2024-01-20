package lessonsDatabase.lessonsDB6.model.dao.impl;

import lessonsDatabase.lessonsDB.db.DB;
import lessonsDatabase.lessonsDB5.exceptions.DbException;
import lessonsDatabase.lessonsDB6.model.dao.SellerDao;
import lessonsDatabase.lessonsDB6.model.entities.Department;
import lessonsDatabase.lessonsDB6.model.entities.Seller;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SellerDaoJDBC implements SellerDao {
  private Connection conn;
  public SellerDaoJDBC(Connection conn){
    this.conn = conn;
  }
  public void insert(Seller obj){
    PreparedStatement st = null;
    try {
      st = conn.prepareStatement(
              "INSERT INTO seller "
              + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
              + "Values (?, ?, ?, ?, ?)",
              Statement.RETURN_GENERATED_KEYS
      );
      st.setString(1, obj.getName());
      st.setString(2, obj.getEmail());
      st.setDate(3, new java.sql.Date(obj.getBirthDate().getTime()));
      st.setDouble(4, obj.getBaseSalary());
      st.setInt(5, obj.getDepartment().getId());

      int rowsAffected = st.executeUpdate();
      System.out.println("Rows affected: " + rowsAffected);

      if (rowsAffected > 0){
        ResultSet rs = st.getGeneratedKeys();
        if (rs.next()){
          int id = rs.getInt(1);
          obj.setId(id);
        }
        DB.closeResultSet(rs);
      } else {
        throw new DbException("Unexpected error! No rows affected!");
      }
    } catch (SQLException sqlException){
      throw new DbException(sqlException.getMessage());
    } finally {
      DB.closeStatement(st);
    }

  }
  public void update(Seller obj){
    PreparedStatement st = null;
    try {
      st = conn.prepareStatement(
              "UPDATE seller "
                      + "SET Name = ?, Email = ?, BirthDate = ?, BaseSalary = ?, DepartmentId = ? "
                      + "WHERE id = ?"
      );
      st.setString(1, obj.getName());
      st.setString(2, obj.getEmail());
      st.setDate(3, new java.sql.Date(obj.getBirthDate().getTime()));
      st.setDouble(4, obj.getBaseSalary());
      st.setInt(5, obj.getDepartment().getId());
      st.setInt(6, obj.getId());

      st.executeUpdate();

    } catch (SQLException sqlException){
      throw new DbException(sqlException.getMessage());
    } finally {
      DB.closeStatement(st);
    }
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
  @Override
  public List<Seller> findByDepartment(Department department){
    PreparedStatement st = null;
    ResultSet rs = null;
    try {
      st = conn.prepareStatement(
              "SELECT seller.*,department.Name as DepName "
                      + "FROM seller INNER JOIN department "
                      + "ON seller.DepartmentId = department.Id "
                      + "WHERE DepartmentId = ? "
                      + "ORDER BY Name");
      st.setInt(1, department.getId());
      rs = st.executeQuery();

      List<Seller> list = new ArrayList<>();
      Map<Integer, Department> map = new HashMap<>();

      while (rs.next()) {

        Department dep = map.get(rs.getInt("DepartmentId"));

        if (dep == null){
          dep = instantiateDepartment(rs);
          map.put(rs.getInt("DepartmentId"), dep);
        }

        Seller obj = instantiateSeller(rs, dep);
        list.add(obj);
      }
      return list;

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
    PreparedStatement st = null;
    ResultSet rs = null;
    try {
      st = conn.prepareStatement(
              "SELECT seller.*,department.Name as DepName "
                      + "FROM seller INNER JOIN department "
                      + "ON seller.DepartmentId = department.Id "
                      + "ORDER BY Name");
      rs = st.executeQuery();

      List<Seller> list = new ArrayList<>();
      Map<Integer, Department> map = new HashMap<>();

      while (rs.next()) {

        Department dep = map.get(rs.getInt("DepartmentId"));

        if (dep == null){
          dep = instantiateDepartment(rs);
          map.put(rs.getInt("DepartmentId"), dep);
        }

        Seller obj = instantiateSeller(rs, dep);
        list.add(obj);
      }
      return list;

    } catch (SQLException sqlException){
      throw new DbException(sqlException.getMessage());
    } finally {
      DB.closeStatement(st);
      DB.closeResultSet(rs);
    }
  }

}
