/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicidea;

/**
 *
 * @author tester13
 */
public class MultipleCatchBlock {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30/0;
            
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occurs");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e){
            System.out.println("Parent Exception Occurs");
        }
        System.out.println("Rest of the code");
    }
    
}
