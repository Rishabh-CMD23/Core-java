/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ldc;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Day_5_medium2_jdbc {
    public static void main(String[] args){
        try {
            Scanner sc=new Scanner(System.in);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog","root","");
            String q="insert into orders(id,name,price) values(?,?,?)";
            PreparedStatement ptsmt=con.prepareStatement(q);
            System.out.println("do you want to add values");
            int a=sc.nextInt();
            while(a==1){
                ptsmt.setInt(1, (int)sc.nextInt());
                ptsmt.setString(2, sc.next());
                ptsmt.setString(3, sc.next());
                ptsmt.executeUpdate();
                System.out.println("do you want to add values");
                a=sc.nextInt();
                
            }
            q="select * from orders";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(q);
            while(rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("price"));
            }
           
           
        } catch (Exception e) {
        }
       
    }
    
}
