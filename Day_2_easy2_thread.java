/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ldc;

/**
 *
 * @author Lenovo
 */
public class Day_2_easy2_thread extends Thread {
   public static int a=100;
   public static int b=100;
    public synchronized  void fun(){
        int amaount=100;
        if(a<b){
                a-=amaount;
                b+=amaount;
                
            }else{
                a+=amaount;
                b-=amaount;
            }
    }
    public void run(){
        
        for(int i=0;i<1000000;i++){
            fun();
        }
        
    }
    public static void main(String[] args){
       
         System.out.println(a+b);
        Day_2_easy2_thread d=new Day_2_easy2_thread();
        Day_2_easy2_thread e=new Day_2_easy2_thread();
        System.out.println();
        d.start();
        e.start();
        try {
            d.join();
            e.join();
        } catch (Exception f) {
            System.out.println(f);
        }
         System.out.println(a+b);
       
    }
            
    
}
