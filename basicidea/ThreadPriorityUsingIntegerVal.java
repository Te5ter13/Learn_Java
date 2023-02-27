/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicidea;

/**
 *
 * @author tester13
 */
public class ThreadPriorityUsingIntegerVal {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "Thread 1");
        Thread t2 = new Thread(new MyRunnable(),"Thread 2");
        Thread t3 = new Thread(new MyRunnable(), "Thread 3");
        
        t1.setPriority(1);
        t2.setPriority(5);
        t3.setPriority(10);
        
        t1.start();
        t2.start();
        t3.start();
    }
    
    static class MyRunnable implements Runnable{
        public void run(){
            System.out.println(Thread.currentThread().getName()+" Running With Priority "+Thread.currentThread().getPriority());
            
        }
    }
}
