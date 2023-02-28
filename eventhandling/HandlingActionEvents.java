/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventhandling;

/**
 *
 * @author tester13
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class HandlingActionEvents extends JFrame implements ActionListener {
    JButton b1;
    JTextField t1;
    HandlingActionEvents(){
    
        setTitle("Action Events");
        setSize(300,300);
        setVisible(true);
        
        t1 = new JTextField(20);
        b1 = new JButton("Click");
        b1.addActionListener(this);
        
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(b1);
        add(t1);
}

    @Override
    public void actionPerformed(ActionEvent ae) {
        t1.setText("You clicked the button");
    }
    
    public static void main(String[] args) {
        new HandlingActionEvents();
    }
    
}
