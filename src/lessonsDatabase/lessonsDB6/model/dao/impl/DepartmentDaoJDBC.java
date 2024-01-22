package lessonsDatabase.lessonsDB6.model.dao.impl;

import lessonsDatabase.lessonsDB.db.DB;
import lessonsDatabase.lessonsDB6.db.DbException;
import lessonsDatabase.lessonsDB6.model.dao.DepartmentDao;
import lessonsDatabase.lessonsDB6.model.entities.Department;

import java.sql.*;
import java.util.List;

public class DepartmentDaoJDBC implements DepartmentDao {
  private Connection conn;
  public DepartmentDaoJDBC(Connection conn){
    this.conn = conn;
  }
  public void insert(Department obj) {
    PreparedStatement st = null;

    try {
      st = conn.prepareStatement(
              "INSERT INTO Department "
              + "(Name) "
              + "Values (?)",
              Statement.RETURN_GENERATED_KEYS);
      st.setString(1, obj.getName());

      int rowsAffected = st.executeUpdate();
      if ( rowsAffected > 0 ){
        System.out.println("Insert done!");
      } else {
        throw new DbException("Unexpected error! No rows inserted");
      }
    } catch (SQLException sqlException){
      throw new DbException(sqlException.getMessage());
    } finally {
      DB.closeStatement(st);
    }
  }

  public void update(Department obj) {
    PreparedStatement st = null;
    try {
      st = conn.prepareStatement(
              "UPDATE department "
              + "SET Name = ? "
              + "WHERE id = ?"
      );

      st.setString(1, obj.getName());
      st.setInt(2, obj.getId());

      int rowsAffected = st.executeUpdate();
      if (rowsAffected > 0){
        System.out.println("Update complete! rows affected: " + rowsAffected);
      } else {
        throw new DbException("Unexpected error! Update failed");
      }

    } catch (SQLException sqlException){
      throw new DbException(sqlException.getMessage());
    } finally {
      DB.closeStatement(st);
    }
  }

  public void deleteById(Integer id) {

  }

  public Department findById(Integer id) {
    PreparedStatement st = null;
    ResultSet rs = null;
    try {
      st = conn.prepareStatement(
              "SELECT Id,Name as DepName "
                      + "FROM department "
                      + "WHERE Id = ?"
      );
      st.setInt(1, id);

      rs = st.executeQuery();
      if (rs.next()){
        return instantiateDepartment(rs);
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

  public List<Department> findAll() {
    return null;
  }

  private Department instantiateDepartment(ResultSet rs) throws SQLException{
    Department dep = new Department();
    dep.setId(rs.getInt("Id"));
    dep.setName(rs.getString("DepName"));
    return dep;
  }

}
