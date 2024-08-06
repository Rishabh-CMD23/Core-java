/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ldc;

import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 *
 * @author Lenovo
 */
public class Day_5_medium1_jdbc {
    public static void main(String[] args){
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog","root","");
            String q="create table IF NOT EXISTS product(id INT,name VARCHAR(100),price VARCHAR(100))";      
            Statement stmt=con.createStatement();
            stmt.execute(q);
            q="insert into product(id,name,price) values(?,?,?)";
            PreparedStatement ptsmt=con.prepareStatement(q);
            ptsmt.setInt(1, 1);
            ptsmt.setString(2, "apple watch");
            ptsmt.setString(3, "200000");
            ptsmt.executeUpdate();
            q="select * from product";
            ResultSet rs=stmt.executeQuery(q);
            while(rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("price"));
            }
            q="delete from product where id=1";
            int a=stmt.executeUpdate(q);
            System.out.println("deleted "+a);
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
