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
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/gazandic/Documents/NetBeansProjects/PengobatanIfrina/Irfina.sqlite");
            JOptionPane.showMessageDialog(null,"Connection established");
            return conn;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
