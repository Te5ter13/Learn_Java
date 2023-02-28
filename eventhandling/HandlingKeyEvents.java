/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventhandling;

/**
 *
 * @author tester13
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class HandlingKeyEvents extends JFrame implements KeyListener {
    
    JTextArea t1;
    JLabel l1;
    
    HandlingKeyEvents(){
        setSize(400,400);
        setTitle("Handling Key Events");
        setVisible(true);
        
        t1 = new JTextArea();
        l1 = new JLabel("Enter");
        l1.setBounds(20,50,100,50);
        t1.setBounds(20,100,300,300);
        t1.addKeyListener(this);
        add(l1);
        add(t1);
        
        setLayout(null);

    }

    @Override
    public void keyTyped(KeyEvent ke) {
        l1.setText("Key Typed");
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        l1.setText("Key Pressed");
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        l1.setText("Key Released");
    }
    
    
    public static void main(String[] args) {
        new HandlingKeyEvents();
    }
}
