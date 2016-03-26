/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengobatanifrina;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Satria
 */
public class javaconnect {
    Connection conn = null;
    public static Connection ConnectDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            JOptionPane.showMessageDialog(null,"Connection established");
            
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/Satria/Documents/NetBeansProjects/PengobatanIfrina/Irfina.sqlite");
            
            return conn;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
