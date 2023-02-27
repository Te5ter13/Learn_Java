/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicidea;

/**
 *
 * @author tester13
 */

class Parent1{
    void fun(){
        System.out.println("Parent1 is called");
        
    }
}

class Parent2{
    void fun(){
        System.out.println("Parent2 is called");
    }
}

// Below given inheritance will throws error

/*class MultipleInherNotSupport extends Parent1, Parent2{
    public static void main(String[] args) {
        MultipleInherNotSupport t = new MultipleInherNotSupport();
        t.fun();
    }
    
}*/


