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
public class Day_2_medium1_thread implements Runnable {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Day_2_medium1_thread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void main(String[] args){
        Day_2_medium1_thread d=new Day_2_medium1_thread();
        Thread e=new Thread(d);
        Thread f=new Thread(d);
        e.start();
        f.start();
    }
}
