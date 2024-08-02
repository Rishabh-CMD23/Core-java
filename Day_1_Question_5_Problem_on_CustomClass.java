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

public class Day_1_Question_5_Problem_on_CustomClass<E> extends AbstractList<E>{
    
    private node<E> head;
    private node<E> tail;
    private int size = 0;
    
    public static class node<E>{
        E data;
        node<E> next;
        node(E data){
            this.data=data;
        }
    }
    public E get(int index){
         if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bound Exception");
        }
        node<E> current=head;
        int i=0;
        while(i<index){
            current=current.next;
            i++;
        }
        return current.data;
    }
    public boolean add(E e){
         node<E> newNode = new node<>(e);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        return true;
    }
    public int size(){
        return size;
    }
    public E remove(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bound Exception");
        }
        if (index == 0) {
            node<E> temp = head;
            head = head.next;
            size--;
            return temp.data;
        }
        node<E> current=head;
        int i=0;
        while(i<index-1){
            current=current.next;
            i++;
        }
        node<E> r=current.next;
        current.next=r.next;
        if(r==tail){
            tail=current;
        }
        size--;
        return r.data;
    }
    
    
    public static void main(String[] args){
        Day_1_Question_5_Problem_on_CustomClass<Integer> a=new Day_1_Question_5_Problem_on_CustomClass<>();
        a.add(1);
        a.add(2);
        System.out.println("Retrieving element at 1 index is "+a.get(1));
        System.out.println("Removing element at 1 index");
        a.remove(1);
        System.out.println("Retrieving element at 0 index is "+a.get(0));
        System.out.println("size of element is "+a.size());
    }
}
