/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ldc;

/**
 *
 * @author Lenovo
 */
class a extends Exception{
    public a(String message){
        super(message);
    }
}
class b extends Exception{
    public b(String message){
        super(message);
    }
}
class c extends Exception{
    public c(String message){
        super(message);
    }
}

public class Day_3_hard1_exception {
    public static void operation1() throws a{
        throw new a("Error occured in operation1");
    }
    public static void operation2() throws b{
        throw new b("Error occured in operation2");
    }
    public static void operation3() throws c{
        throw new c("Error occured in operation3");
    }
    public static void main(String[] args){
        try{
            operation1();
            operation2();
            operation3();
        }catch(a | b | c e){
            System.out.println(e.getMessage());
        }
    }
}
