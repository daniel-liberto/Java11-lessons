package lessonsDatabase.lessonsDB.application;

import lessonsDatabase.lessonsDB.db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
  public static void main(String[] args) {

//    Connection conn = DB.getConnection();
//    DB.closeConnection();

    Connection conn = null; // connect to db
    Statement st = null; //
    ResultSet rs = null;

    try {
      conn = DB.getConnection();
      st = conn.createStatement();
      rs = st.executeQuery("select * from department");

      while (rs.next()) {
        System.out.println(rs.getInt("Id") + " | " + rs.getString("Name"));
      }
    } catch (SQLException sqlexception){
      sqlexception.printStackTrace();
    } finally {
      DB.closeResultSet(rs);
      DB.closeStatement(st);
      DB.closeConnection();
    }
  }
}
