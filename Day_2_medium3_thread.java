/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ldc;
import java.util.*;
/**
 *
 * @author Lenovo
 */
public class Day_2_medium3_thread {
    public static Queue<Integer> blockqueue=new ArrayDeque<>();
    static class Producer extends Thread{
        public void run(){
            for(int i=0;i<50;i++){
                System.out.println("adding element"+i);
                blockqueue.add(i);
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    System.out.println(e);
                }
                
            }
        }
    }
    static class Consumer extends Thread{
        public void run(){
            for(int i=0;i<50;i++){
                if(blockqueue.isEmpty()){
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                System.out.println(blockqueue.poll());
                
            }
        }
    }
    public static void main(String[] args){
        new Producer().start();
        new Consumer().start();
    }
}
