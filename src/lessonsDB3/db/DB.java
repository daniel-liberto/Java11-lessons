package lessonsDB3.db;

import lessonsDB.exceptions.DbException;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {

  private static Connection conn = null;

  public static Connection getConnection() {
    if (conn == null){
      try {
      Properties props = loadProperties();
      String url = props.getProperty("dburl");
      conn = DriverManager.getConnection(url, props);
      } catch (SQLException sqlException){
        throw new DbException(sqlException.getMessage());
      }
    }
    return conn;
  }

  public static void closeConnection(){
    if (conn != null) {
      try {
      conn.close();
      } catch (SQLException sqlException){
        throw new DbException(sqlException.getMessage());
      }
    }
  }

  private static Properties loadProperties(){
    try (FileInputStream fs = new FileInputStream("db.properties")) {
      Properties props = new Properties();
      props.load(fs);
      return props;
    } catch (IOException ioexception){
      throw new DbException(ioexception.getMessage());
    }
  }

  public static void closeStatement(Statement st){
    if (st != null){
      try {
      st.close();
      } catch (SQLException sqlException){
        throw new DbException(sqlException.getMessage());
      }
    }
  }

  public static void closeResultSet(ResultSet rs){
    if (rs != null){
      try {
        rs.close();
      } catch (SQLException sqlException){
        throw new DbException(sqlException.getMessage());
      }
    }
  }
}
