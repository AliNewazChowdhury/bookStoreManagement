/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Ishmam
 */
public class DBUtis {
     
    public static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException{
        PreparedStatement ps =null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url ="jdbc:sqlserver://localhost:1433;databaseName=LibraryManagement";
        String user ="ishmam";
        String pass ="12345";
        Connection con = DriverManager.getConnection(url, user,pass);
        ps= con.prepareStatement(sql);
        return ps;
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
    }
}
