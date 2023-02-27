/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicidea.ThrowVsThrows;

/**
 *
 * @author tester13
 */
public class ThrowDemo {
    public static void checkNum(int num){
        if(num < 1){
            throw new ArithmeticException("Number is negative, cannot calculate square");
        }
        else{
            System.out.println("Square of "+num+" is "+(num*num));
            
        }
    }
    //main method
    public static void main(String[] args) {
        ThrowDemo obj = new ThrowDemo();
        obj.checkNum(-3);
        System.out.println("Rest of the code ...........");
    }
}
