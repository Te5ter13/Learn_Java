/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicidea;

/**
 *
 * @author tester13
 */
class Numbers{
    public void displayInfo(){
        System.out.println("This is the super class");
    }
}

class Addition extends Numbers{
    public void calculate1(){
        System.out.println("This is the Addition subclass to be called");
        
    }
}
class Subtraction extends Numbers{
    public void calculate2(){
        System.out.println("This is Subtraction subclass to be called");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Addition a = new Addition();
        Subtraction b = new Subtraction();
        a.calculate1();
        b.calculate2();
    }
    
}
