package lessonsDatabase.lessonsDB4.application;

import lessonsDatabase.lessonsDB.db.DB;
import lessonsDatabase.lessonsDB4.exceptions.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
  public static void main(String[] args) {

    Connection conn = null;
    PreparedStatement st = null;

    try {
      conn = DB.getConnection();
      st = conn.prepareStatement(
              "DELETE FROM department "
              + "WHERE "
              + "Id = ?"
      );

      int departmentId = 2;
      st.setInt(1, departmentId);

      int rowsAffected = st.executeUpdate();

      System.out.println("Done! Rows affected: " + rowsAffected);

    } catch (SQLException sqlException){
      throw new DbIntegrityException(sqlException.getMessage());
    } finally {
      DB.closeStatement(st);
      DB.closeConnection();
    }
  }
}
