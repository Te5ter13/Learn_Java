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
public class FocusEventDemo extends JFrame implements FocusListener{
    JButton b1;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    
    FocusEventDemo(){
        setSize(400,400);
        setTitle("Focus Listener");
        setVisible(true);
        
        b1 = new JButton("Add");
        l1 = new JLabel("Num1");
        l2 = new JLabel("Num2");
        l3 = new JLabel("Sum");
        l4 = new JLabel();
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        
        b1.addFocusListener(this);
        t1.addFocusListener(this);
        t2.addFocusListener(this);
        add(l1);add(t1);add(l2);add(t2);add(l3);add(b1);add(l4);
        
        setLayout(new FlowLayout(FlowLayout.CENTER));
    }
    @Override
    public void focusGained(FocusEvent fe) {
        int x,y,z;
        if(fe.getSource() == b1){
            
            x = Integer.parseInt(t1.getText());
            y = Integer.parseInt(t2.getText());
            z = x+y;  
            l4.setText(String.valueOf(z));
        }
        
    }

    @Override
    public void focusLost(FocusEvent fe) {
        if(fe.getSource() == t1 && t1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Enter Number");
            t1.requestFocus();
        }
        if(fe.getSource() == t2 && t2.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Enter number to continue");
            t2.requestFocus();
        }
    }
    public static void main(String[] args) {
        new FocusEventDemo();
    }
    
}
