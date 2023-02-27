/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIControlsDemo;

/**
 *
 * @author tester13
 */
import javax.swing.*;

public class DialogBoxDemo extends JFrame{
    
    DialogBoxDemo(){
   
        
        //Input Dialog Box
        JOptionPane.showInputDialog(this,"Enter Your Name");
        
        //Message Dialog Box
        JOptionPane.showMessageDialog(this, "This is message");
        
        //Confirm Dialog
        JOptionPane.showConfirmDialog(this, "Do You want to exit?", "Alert", JOptionPane.YES_NO_CANCEL_OPTION);
    }
    public static void main(String[] args) {
        new DialogBoxDemo();
    }
}
