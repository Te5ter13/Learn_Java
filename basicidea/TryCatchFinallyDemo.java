/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicidea;

/**
 *
 * @author tester13
 */
public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        int a [] = new int[2];
        try{
            System.out.println("Access element three: " + a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Thrown: "+e);
        }finally{
            a[0] = 6;
            System.out.println("First element value: "+a[0]);
            System.out.println("Finally statement is executed:");
        }
    }
}
