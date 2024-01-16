/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author John Vel
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {
    Connection conn = null;
    
    
    public static Connection Connecrdb(){
       try{
           Class.forName("org.sqlite.JDBC");
           Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Win10\\Documents\\NetBeansProjects\\BankSystess\\bank.db");
           return conn;
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
       return null;
    }
    
}
