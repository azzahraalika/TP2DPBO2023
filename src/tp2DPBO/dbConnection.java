/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2DPBO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Kristiyant Ponty Y
 */

public class dbConnection {
    public static Statement stmt;
    public static Connection conn;
    
    public void connect(){
        try{
            String url = "jdbc:mysql://localhost/tp2ddpbo";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            System.out.println("Berhasil menyambungkan database");
        } catch(ClassNotFoundException | SQLException ex){
            System.err.println("Gagal menyambungkan database" +ex.getMessage());
        }
    }
    
    public ResultSet Query(String input){
        try{
            connect();
            String sql = input;
            return stmt.executeQuery(sql);
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        
        return null;
    }
}
