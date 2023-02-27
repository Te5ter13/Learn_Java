/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicidea;
import java.lang.Thread;
/**
 *
 * @author tester13
 */
public class ThreadPriority {

    public static void main(String[] args) {
        Thread th1 = new Thread(new MyRunnable(),"Thread 1");
        Thread th2 = new Thread(new MyRunnable(), "Thread 2");
        Thread th3 = new Thread(new MyRunnable(), "Thread 3");
        
        th1.setPriority(Thread.MIN_PRIORITY);
        th2.setPriority(Thread.NORM_PRIORITY);
        th3.setPriority(Thread.MAX_PRIORITY);
        
        
        th1.start();
        th2.start(); 
        th3.start();
        
        
        }
    static class MyRunnable implements Runnable{
        public void run(){
            System.out.println(Thread.currentThread().getName()+" with Priority "+Thread.currentThread().getPriority());
            
        }
    }
 
}
