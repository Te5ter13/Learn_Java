/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rmidemo;
import java.rmi.*;
/**
 *
 * @author tester13
 */
public interface Adder extends Remote{
   public int add(int x, int y) throws RemoteException;
}
