/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ldc;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class Day_2_easy1_thread extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Day_2_easy1_thread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void main(String[] args){
        Day_2_easy1_thread d=new Day_2_easy1_thread();
        Day_2_easy1_thread s=new Day_2_easy1_thread();
        d.start();
        s.start();
    }
    
}
