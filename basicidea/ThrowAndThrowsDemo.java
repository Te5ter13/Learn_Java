/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicidea;

/**
 *
 * @author tester13
 */
public class ThrowAndThrowsDemo {
    static void method() throws ArithmeticException{
        System.out.println("Inside the method()");
        throw new ArithmeticException("Throwing ArithmeticException");
        
    }
    public static void main(String[] args) {
        try {
            method();
        } catch (ArithmeticException e) {
            System.out.println("Caught in main() method");
        }
    }
}
