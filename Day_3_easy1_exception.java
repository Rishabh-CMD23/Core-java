/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ldc;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Day_3_easy1_exception {
    public static void main(String[] args) throws IOException{
     
        FileWriter fw = null;
        
        try {
           
            Scanner sc=new Scanner(System.in);
            fw=new FileWriter("example.txt");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a/b;
        } catch (Exception e) {
            System.out.println(e);
            fw.write("exception occured");
             
        }
    }
}
