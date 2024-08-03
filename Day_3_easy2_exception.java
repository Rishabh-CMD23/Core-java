/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ldc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */

class CustomException extends Exception{

    public CustomException(String message) {
        super(message);
    }
    
}

public class Day_3_easy2_exception {
    public static void main(String[] args)throws CustomException{
        Scanner sc=new Scanner(System.in);
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(b==0){
                throw new CustomException("Arithmetic Exception");
            }
            
        }catch(CustomException e){
                System.out.println(e);    
        }
    }
}
