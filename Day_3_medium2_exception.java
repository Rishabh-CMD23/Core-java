/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ldc;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Day_3_medium2_exception {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       
        try {
             String name=sc.next();
             String password=sc.next();
             if(name.length()<2){
                 throw new Exception("length of name should not be less than or equal to 2");
             }
             if(!(password.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,}$"))){
                 throw new Exception("low password");
             }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
