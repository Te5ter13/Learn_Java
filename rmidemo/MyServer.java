/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmidemo;
import java.rmi.*;
import java.rmi.registry.*;

/**
 *
 * @author tester13
 */
public class MyServer {
    public static void main(String[] args) {
        try{
            
            Registry reg = LocateRegistry.createRegistry(5001);
            Adder stub = (Adder) new AdderRemote();
            Naming.rebind("rmi://localhost:5001/demo", stub);
            System.out.println("Server is running");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
