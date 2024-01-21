package lessonsDatabase.lessonsDB6.model.dao.impl;

import lessonsDatabase.lessonsDB.db.DB;
import lessonsDatabase.lessonsDB6.db.DbException;
import lessonsDatabase.lessonsDB6.model.dao.DepartmentDao;
import lessonsDatabase.lessonsDB6.model.entities.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
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
    return null;
  }

  public List<Department> findAll() {
    return null;
  }

}
