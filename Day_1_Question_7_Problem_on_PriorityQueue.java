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
public class Day_1_Question_7_Problem_on_PriorityQueue {
    public static void main(String[] args){
        PriorityQueue<Integer> p=new PriorityQueue<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            p.add(sc.nextInt());
        }
        System.out.println("Displaying all the elements");
        Iterator i=p.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        p.poll();
        p.poll();
        System.out.println("After removing elements is ");
        Iterator e=p.iterator();
        while(e.hasNext()){
            System.out.println(e.next());
        }
    }
}
