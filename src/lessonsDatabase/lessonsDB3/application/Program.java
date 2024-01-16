package lessonsDatabase.lessonsDB3.application;

import lessonsDatabase.lessonsDB.db.DB;
import lessonsDatabase.lessonsDB.exceptions.DbException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
  public static void main(String[] args) {

    Connection conn = null;
    PreparedStatement st = null;

    try {
      conn = DB.getConnection();
      st = conn.prepareStatement(
              "UPDATE seller "
              + "SET BaseSalary = BaseSalary + ? "
              + "WHERE "
              + "(DepartmentId = ?)",
              Statement.RETURN_GENERATED_KEYS
      );

      double extraSalary = 200.0;
      int departmentId = 2;
      st.setDouble(1, extraSalary);
      st.setInt(2, departmentId);

      int rowsAffected = st.executeUpdate();

      System.out.println("Done! Rows affected: " + rowsAffected);

    } catch (SQLException sqlException){
      throw new DbException(sqlException.getMessage());
    } finally {
      DB.closeStatement(st);
      DB.closeConnection();
    }
  }
}
