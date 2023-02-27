/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicidea;

/**
 *
 * @author tester13
 */
public class ThreadUsingThread {
    public static void main(String[] args) {
        Thread t = new Thread("First Thread Created");
        
        //Start method moves the thread to active state
        t.start();
        String str = t.getName();
        System.out.println(str);
    }
}
