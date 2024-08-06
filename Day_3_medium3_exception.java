/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ldc;

/**
 *
 * @author Lenovo
 */
class Resource implements AutoCloseable{
    String resourceName;
    public Resource(String resourceName){
        this.resourceName=resourceName;
        System.out.println("opened "+resourceName);
        
    }
    public void doSomething(){
        System.out.println(resourceName+" is doing something");
    }
    public void close(){
        System.out.println(resourceName+" closed");
    }
}
public class Day_3_medium3_exception {
    public static void main(String[] args){
        try(Resource r=new Resource("resource")){
            r.doSomething();
            if(true){
                throw new Exception("an error occured");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
