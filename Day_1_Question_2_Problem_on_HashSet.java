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
public class Day_1_Question_2_Problem_on_HashSet {
    public static void main(String[] args){
        Set<String> s=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Elements");
        for(int i=0;i<5;i++){
            s.add(sc.next());
        }
        System.out.println("Displaying all the elements");
        Iterator i=s.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        s.add("hello");
         Iterator h=s.iterator();
        System.out.println("Updating");
        while(h.hasNext()){
            System.out.println(h.next());
        }
    }
    
}
