
package Dao;

import java.sql.*;
public class ConnectionJtdc {
        public static Connection connectionJDBC(){
        final String URL = "jdbc:sqlserver://localhost;database=QuanLyHocVien";
        final String USER = "sa";
        final String PASS = "sa123";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(URL, USER, PASS);
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
