/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicidea;


public class InnerClassExample {
    
    //Static inner class
    static class StaticInnerClass{
        public static void printMessage(){
            System.out.println("This is from Static inner class");
        }
    }
    
    // Non-static inner class
    class InnerClass{
        public void printMessage(){
            System.out.println("This is from Non-Static inner Class");
        }
    }
    
    public static void main(String[] args) {
        // Local inner classs
        class LocalInnerClass{
            public void printMessage(){
                System.out.println("This is from Local Inner Class");
            }
        }
        
        LocalInnerClass localInner = new LocalInnerClass();
        localInner.printMessage();
        

        
        StaticInnerClass staticInner = new StaticInnerClass();
        staticInner.printMessage();
       
        //Create an instance of outer class
        InnerClassExample outer = new InnerClassExample();
        
        //Create an instance of non-static inner class using outer class instance
        InnerClassExample.InnerClass inner = outer.new InnerClass();
        inner.printMessage();
        
        Runnable r = new Runnable(){
            public void run(){
                System.out.println("This is from Anonymous inner Class");
                
            }
        };
        r.run();
    }
    
}
