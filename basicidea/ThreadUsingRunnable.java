/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicidea;

/**
 *
 * @author tester13
 */
public class ThreadUsingRunnable implements Runnable {
    public void run(){
        System.out.println("Thread is running........");
        
    }
    public static void main(String[] args) {
        ThreadUsingRunnable R1 = new ThreadUsingRunnable();
        Thread t1 = new Thread(R1);
        t1.start();
    }
}
