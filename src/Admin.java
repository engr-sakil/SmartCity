
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
abstract public class Admin {
    private String name;
    private String phoneNo;
    private String gender;
    private String id;
    
    String getname()
    {
        return name;
    }
    String getphoneNo()
    {
        return phoneNo;
    }
    String getgender()
    {
        return gender;
    }
    String getid()
    {
        return id;
    }

    Admin(String name,String phoneNo,String gender,String id)
    {
        this.name=name;
        this.phoneNo=phoneNo;
        this.gender=gender;
        this.id=id;
       
    }
    
    void dataentry(info_type ob)
    {
        Connection conn = null;
        Statement stmt = null; 
        try {
             String url = "jdbc:sqlite:C:\\Users\\lenovo\\Documents\\NetBeansProjects\\SmartCity\\smartcity.sqlite";
             conn = DriverManager.getConnection(url);
             conn.setAutoCommit(false); 
             System.out.println("Connection to SQLite has been established.");
             stmt = conn.createStatement();
             String sql = "INSERT INTO allinfo values('"+ob.getinfoType()+"','"+ob.getid()+"','"+ob.getname()+"','"+ob.getphoneNo()+"','"+ob.getlocation()+"')";         
               stmt.executeUpdate(sql); 
             
               stmt.close();          
               conn.commit();          
               conn.close(); 
        } catch (SQLException ex) {
            //Logger.getLogger(super_admin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Fillup The Form");
        }
 
    }
    
    abstract String studentinfo(local_student ob);
    abstract String touristinfo(foreign_tourist ob);
    
   
}
