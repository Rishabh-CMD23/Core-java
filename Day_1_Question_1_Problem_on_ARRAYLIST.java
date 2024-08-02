/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ldc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Day_1_Question_1_Problem_on_ARRAYLIST {
    public static void main(String[] args){
        List<Integer> l=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Elements");
        for(int i=0;i<5;i++){
            l.add(sc.nextInt());
        }
        System.out.println("Displaying all the elements");
        for(int i=0;i<5;i++){
            System.out.println(l.get(i));
        }
        l.remove(1);
        System.out.println("Updated List");
        for(int i=0;i<4;i++){
            System.out.println(l.get(i));
        }
        
    }
}
