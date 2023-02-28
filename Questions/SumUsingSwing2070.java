/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

/**
 *
 * @author tester13
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SumUsingSwing2070 extends KeyAdapter {
    JFrame f;
    JTextField t1,t2,t3;
    JButton b1;

    
    SumUsingSwing2070(){
        f = new JFrame("Adding Two Numbers");
        f.setSize(400,400);
        f.setVisible(true);
        
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        
        t1.setBounds(10,10,100,50);
        t2.setBounds(10,70,100,50);
        t3.setBounds(10,150,80,50);
        
        f.setLayout(null);
        
        t1.addKeyListener(this);
        t2.addKeyListener(this);
        f.add(t1);f.add(t2);f.add(t3);
    }
    
    @Override
    public void keyPressed(KeyEvent ke){
        int x,y,z;
        x = Integer.parseInt(t1.getText());
        y = Integer.parseInt(t2.getText());
        z = x+y;
        t3.setText(String.valueOf(z));
    }
    public static void main(String[] args) {
        new SumUsingSwing2070();
    }
    
}
