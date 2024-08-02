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
public class Day_1_Question_3_Problem_on_HashMap_and_TreeMap {
    public static void main(String[] args){
        HashMap<Integer,String> m=new HashMap<>();
        TreeMap<Integer,String> h=new TreeMap<>();
        System.out.println("Using HasMap and TreeMap");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
           String s=sc.next();
           m.put(i,s);
           h.put(i, s);
        }
        System.out.println("Displaying HashMap Elements");
        for(int ks:m.keySet()){
            System.out.println(ks+ " "+m.get(ks));
        }
        System.out.println("Displaying TreeMap Elements");
        for(int ks:h.keySet()){
            System.out.println(ks+" "+h.get(ks));
        }
        System.out.println("Removing element from HashMap at 2 index that is : "+ m.remove(1));
        System.out.println("Remaining elements in HashMap is ");
       for(int ks:m.keySet()){
            System.out.println(ks+ " "+m.get(ks));
        }
        System.out.println("Removing element from TreeMap at 2 index that is : "+ h.remove(1));
        System.out.println("Remaining elements in TreeMap is ");
        for(int ks:h.keySet()){
            System.out.println(ks+" "+h.get(ks));
        }
    }
}
