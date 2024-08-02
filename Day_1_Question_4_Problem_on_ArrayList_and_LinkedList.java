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
public class Day_1_Question_4_Problem_on_ArrayList_and_LinkedList {
    public static void measure(List<Integer> list){
        long st=System.nanoTime();
        for(int i=0;i<5;i++){
            list.add(i);
        }
        long et=System.nanoTime();
        System.out.println("time taken by list to insert element is :"+ (et-st)/1e6 +"ms");
        System.out.println("Inserted element at starting");
        st=System.nanoTime();
        for(int i=0;i<5;i++){
            list.addFirst(i);
        }
        et=System.nanoTime();
        System.out.println("time taken by list after inserting element at beginning is :"+ (et-st)/1e6 +"ms");
        System.out.println("Inserted element at ending");
        st=System.nanoTime();
        for(int i=0;i<5;i++){
            list.addLast(i);
        }
        et=System.nanoTime();
        System.out.println("time taken by list after inserting element at ending is :"+ (et-st)/1e6 +"ms");
    }
    public static void main(String[] args){
        List<Integer> a=new ArrayList<>();
        List<Integer> l=new LinkedList<>();
        System.out.println("Performance of Arraylist is");
        measure(a);
        System.out.println("Performance of LinkedList is");
        measure(l);
    }
}
