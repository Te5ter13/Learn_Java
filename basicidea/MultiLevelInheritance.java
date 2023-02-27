/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicidea;

/**
 *
 * @author tester13
 * 
 */
interface Parent1{
    void fun1();
}

interface Parent2{
    void fun2();
}

class MyClass implements Parent1, Parent2{
    public void fun1(){
         System.out.println("Implementation of fun1 from Parent1");
    }
    
    public void fun2(){
        System.out.println("Implementation of fun2 from Parent2");
    }
}

public class  MultiLevelInheritance {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.fun1();
        obj.fun2();
    }
    
}
