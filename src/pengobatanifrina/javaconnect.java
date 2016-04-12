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
    public static String path = "Irfina.sqlite";//C:/Users/gazandic/Documents/NetBeansProjects/PengobatanIfrina
    public static Connection ConnectDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            String s = "jdbc:sqlite:"+path;
            Connection conn = DriverManager.getConnection(s);
            JOptionPane.showMessageDialog(null,"Connection established");
            return conn;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
