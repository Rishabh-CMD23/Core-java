/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ldc;
import java.sql.*;
/**
 *
 * @author Lenovo
 */
public class Day_5_easy2_jdbc {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from employee");
            while(rs.next()){
                System.out.print(rs.getInt("id")+" ");
                System.out.print(rs.getString("name")+" ");
                System.out.print(rs.getString("workmode")+" ");
                System.out.println(rs.getString("mobileno"));
                
                
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
    }
}
