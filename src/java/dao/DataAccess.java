package dao;


import db.DBUtis;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ishmam
 */
public class DataAccess {
    
    public void addNew(addBook n)
    {
        try {
            PreparedStatement ps = DBUtis.getPreparedStatement("insert into books(title,subject,publisher,language,number_of_page,total_no,image) values(?,?,?,?,?,?,?)");
            
            ps.setString(1,n.getTitle());
            ps.setString(2,n.getSubject());
            ps.setString(3,n.getPublisher());
            ps.setString(4,n.getLanguage());
            ps.setInt(5,n.getNum_of_page());
            ps.setInt(6,n.getTotal_books());
            ps.setString(7,n.getImage());
            
            ps.executeUpdate();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        } 
    } 
    
    public void addClient(addClient n)
    {
        try {
            PreparedStatement ps= DBUtis.getPreparedStatement("insert into client(name,gender,phone,address,house_no) values(?,?,?,?,?)");
            ps.setString(1, n.getName());
            ps.setString(2, n.getGender());
            ps.setInt(3, n.getPhone());
            ps.setString(4, n.getAddress());
            ps.setString(5, n.getHouse_no());
            
            ps.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public static List<addBook> getAll()
    {
        List<addBook> ls = new LinkedList<>();
        try {
            
            ResultSet rs = DBUtis.getPreparedStatement("select * from books").executeQuery();
            
            while(rs.next())
            {
                addBook n = new addBook(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getInt(7),rs.getString(8));
                ls.add(n);
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ls;
    }
    
    
    public static ResultSet getImage()
    {
        ResultSet rs= null;
        try {
             
            rs = DBUtis.getPreparedStatement("select image from books").executeQuery();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    
    public static List<addClient> getClient()
    {
        List<addClient> la = new LinkedList<>();
        try {
            
            ResultSet rs = DBUtis.getPreparedStatement("SELECT * FROM client").executeQuery();
            
            while(rs.next())
            {
                addClient n = new addClient(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6));
                la.add(n);
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return la;
    }
    
    public static List<addBook> getBookById(int id)
    {
        List<addBook> ls = new LinkedList<>();
        String sql= "select * from books where b_id= "+id ;
        try {
            
            ResultSet rs = DBUtis.getPreparedStatement(sql).executeQuery();
            
            while(rs.next())
            {
                addBook n = new addBook(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getInt(7),rs.getString(8));
                ls.add(n);
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ls;
    }
    public void edit(String title,String subject,String publisher,String language,int number_of_page,int tot_no,int id,String image){
      String  sql="update books SET title = ?, subject = ?, publisher = ?, language = ?, number_of_page = ?, total_no = ?, image = ?"+" where b_id = ?";
      
      PreparedStatement ps;
      
        try {
            ps = DBUtis.getPreparedStatement(sql);
             ps.setString(1, title);
             ps.setString(2, subject);
             ps.setString(3, publisher);
             ps.setString(4, language);
             ps.setInt(5, number_of_page);
             ps.setInt(6, tot_no);
             ps.setInt(7, id);
             ps.setString(8, image);
             ps.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
    public void delete(int  id){
      String  sql="delete from books where b_id = ?";
      
      PreparedStatement ps;
      
        try {
            ps = DBUtis.getPreparedStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
    public   ResultSet getName(String password,String email){
      String  sql="select name from Admin where email = '"+email+"' and pass = '"+password+"'";
      
      
      ResultSet rs= null;
        try {
            rs = DBUtis.getPreparedStatement(sql).executeQuery();
            
        } catch (ClassNotFoundException |SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       return rs;
    }

}
