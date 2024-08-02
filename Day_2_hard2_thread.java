/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ldc;

/**
 *
 * @author Lenovo
 */
/*
  i have created 2 task which acquire locks on resource 1 and resource 2
  task1 holds resource1 and try to access resource 2 which is hold by task2 and task waits for resource 1 which is hold
  by task 1, thus , it results in circular wait and this situation is called deadlock 
  
  To resolve this situation, both of the task hold resource in same order and that is what i did. Task 1 and Task 2 hold resource 1 and then resource 2
*/
public class Day_2_hard2_thread {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();
    public static void main(String[] args) throws InterruptedException{
        task1 t=new task1();
        task2 d=new task2();
        t.start();
        d.start();
        t.join();
        d.join();
       
    }
    public static class task1 extends Thread{
        public void run(){
            synchronized(resource1){
                System.out.println(Thread.currentThread().getName()+" has acquired lock on resource1");
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            synchronized(resource2){
                System.out.println(Thread.currentThread().getName()+" has acquired lock on resource2");
            }
        }
    }
     public static class task2 extends Thread{
        public void run(){
            synchronized(resource1){
                System.out.println(Thread.currentThread().getName()+" has acquired lock on resource1");
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            synchronized(resource2){
                System.out.println(Thread.currentThread().getName()+" has acquired lock on resource2");
            }
        }
    }
}
