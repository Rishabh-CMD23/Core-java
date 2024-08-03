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
class CustomException extends Exception{
    public CustomException(){
        super();
    }
    public CustomException(String message) {
        super(message);
    }
    public void fun(){
    }
    
}
class b extends CustomException{
    private String name;
    private int age;
    b(String name,int age){
        super("length of name must be greater than 10");
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    
}
public class Day_3_medium1_exception {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int age=sc.nextInt();
        b a=null;
        try {
             if(name.length()<10){
                throw new b(name,age);
            }else{
                a= new b(name,age);
                 System.out.println(a.getName());
            }
        } catch (CustomException e) {
            System.out.println(e); 
       }
       
    }
}
