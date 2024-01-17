package lessonsDatabase.lessonsDB5.application;

import lessonsDatabase.lessonsDB.db.DB;
import lessonsDatabase.lessonsDB5.exceptions.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
  public static void main(String[] args) {

    Connection conn = null;
    Statement st = null;

    try {
      conn = DB.getConnection();

      // all transaction are pending by default
      conn.setAutoCommit(false);
      st = conn.createStatement();
      int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
      // INTENTIONAL ERROR TEST
      int x = 1;
      if (x < 2){
        throw new SQLException("Fake error!");
      }
      int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
      conn.commit();

      System.out.println("Rows 1: " + rows1);
      System.out.println("Rows 2: " + rows2);

    } catch (SQLException sqlException){
      try {
        conn.rollback();
        throw new SQLException("Something went wrong! rollback cause: " + sqlException.getMessage());
      } catch (SQLException rollbackException){
        throw new DbException("Error trying to rollback! caused by: " + rollbackException.getMessage());
      }
    } finally {
      DB.closeStatement(st);
      DB.closeConnection();
    }
  }
}
