/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ldc;
import java.util.*;
import java.sql.*;

/**
 *
 * @author Lenovo
 */
public class Day_5_medium3_jdbc {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog","root","");
            String q="{call getById(?)}";
            CallableStatement callableStatement=con.prepareCall(q);
            callableStatement.setInt(1, 1);
            ResultSet rs=callableStatement.executeQuery();
            con.close();
            while(rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("workmode"));
                System.out.println(rs.getString("mobileno"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
