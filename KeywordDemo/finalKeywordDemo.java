/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KeywordDemo;

/**
 *
 * @author tester13
 */
public class finalKeywordDemo {
    
    //x in final variable
    public static final int x = 10;
    
    //y is final variable
    public final int y = 20;
    
    public final void aFinalMethod(){
        System.out.println("This is final method");
        
    }
    public final class FinalClass{
        public void aMethod(){
            System.out.println("This is a method in final class");
        }
    }
    public static void main(String[] args) {
        finalKeywordDemo obj = new finalKeywordDemo();
        
        // The following line would generate a compile-time error
        // x = 20;

        // The following line would generate a compile-time error
        // obj.y = 30;

        // The following line would generate a compile-time error
        // obj.aFinalMethod();
    }
}