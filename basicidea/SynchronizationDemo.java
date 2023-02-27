/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicidea;

/**
 *
 * @author tester13
 */

class PrintDemo{
    public void printCount(){
        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Counter----"+ i);
            }
        }catch(Exception e){
            System.out.println("Thread Interrupted.");
            
        }
    }
}
class ThreadDemo extends Thread{
    private Thread t;
    private String threadName;
    PrintDemo PD;
    
    ThreadDemo(String name, PrintDemo pd){
        threadName = name;
        PD = pd;
    }
    public void run(){
        synchronized(PD){
            PD.printCount();
        }
        System.out.println("Thread "+ threadName+" existing.");
        
    }
    public void start(){
        System.out.println("Starting "+threadName);
        if( t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
public class SynchronizationDemo {
    public static void main(String[] args) {
        PrintDemo PD = new PrintDemo();
        ThreadDemo T1 = new ThreadDemo("Thread----1", PD);
        ThreadDemo T2 = new ThreadDemo("Thread----2", PD);
        T1.start();
        T2.start();
        
        //waits for threads to end
        try{
            T1.join();
            T2.join();
            
        }catch(Exception e){
            System.out.println("Interrupted");
        }
    }
    
}
