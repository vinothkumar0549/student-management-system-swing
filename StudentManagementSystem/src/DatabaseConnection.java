import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vinot
 */
public class DatabaseConnection {


    final static String URL = "jdbc:mysql://localhost:3306/mysql";
    final static String USER = "root";
    final static String PASS = "mysql";
    
    public static Connection getConnection(){
        try{
            Connection con = DriverManager.getConnection(URL,USER,PASS);
            return con;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
