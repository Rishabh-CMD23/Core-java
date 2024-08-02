/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ldc;

/**
 *
 * @author Lenovo
 */
public class Day3_medium2_thread  {
    public static volatile int a=1;
    static class a extends Thread{
        public void run(){
            int l=a;
            while(l<5){
                if(l!=a){
                    System.out.println("got value of local value is "+l);
                    l=a;
                }
            }
        }
    }
    static class b extends Thread{
        public void run(){
            int l=a;
            while(a<5){
                System.out.println("incremented value of a is " + (l+1));
                a=++l;
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
    public static void main(String[] args){
        new a().start();
        new b().start();
        
        
    }
}
