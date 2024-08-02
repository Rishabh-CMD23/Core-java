/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ldc;
import java.util.*;

class Person{
    private String name;
    private int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return "Person{name= "+name+" age= "+age+" }";
    }
}

class CustomComparator implements Comparator<Person>{
    public int compare(Person p,Person m){
        return Integer.compare(p.getAge(),m.getAge() );
    }
    
}

/**
 *
 * @author Lenovo
 */
public class Day_1_Question_6_Problem_on_CustomSorting {
    public static void main(String[] args){
        TreeSet<Person> t=new TreeSet<>(new CustomComparator());
        t.add(new Person("a",23));
        t.add(new Person("b",22));
        t.add(new Person("c",24));
        for(Person p:t){
            System.out.println(p.toString());
        }
    }
}
