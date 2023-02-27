/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicidea.ThrowVsThrows;

/**
 *
 * @author tester13
 */
public class ThrowsDemo {
    //defining a method
    public static int divideNum(int m, int n) throws ArithmeticException{
        int div = m / n;
        return div;
    }
    
    //main method
    public static void main(String[] args) {
        ThrowsDemo obj = new ThrowsDemo();
        try{
            System.out.println(obj.divideNum(45,0));
            
        }catch(ArithmeticException e){
            System.out.println("Number cannot be divided by 0");
            
        }
        System.out.println("Rest of the code.........");
    }
}
