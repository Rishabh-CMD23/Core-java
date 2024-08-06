/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ldc;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class Day_5_hard1_jdbc {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog","root","");
            Statement stmt=con.createStatement();
            String q="select * from orders";
            ResultSet rs=stmt.executeQuery(q);
            while(rs.next()){
                System.out.println(rs.getInt("id"));
            }
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            
        }
    }
    
}
