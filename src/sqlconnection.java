
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class sqlconnection {
    
     void connection() throws SQLException
     {
        Connection conn = null;
        Statement stmt = null;
        String url = "jdbc:sqlite:C:\\Users\\lenovo\\Documents\\NetBeansProjects\\SmartCity\\smartcity.sqlite";
        conn = DriverManager.getConnection(url);
        conn.setAutoCommit(false); 
        System.out.println("Connection to SQLite has been established.");
        stmt = conn.createStatement();
     }
}
