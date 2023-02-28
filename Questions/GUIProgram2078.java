/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

/**
 *
 * @author tester13
 */
import java.awt.event.*;
import javax.swing.*;
public class GUIProgram2078 extends MouseAdapter{
    JFrame f;
    JTextField t1,t2;
    JLabel l1,l2,l3,l4;
    
    GUIProgram2078(){
        f = new JFrame("Add and Subtract");
        f.setSize(400,400);
        f.setVisible(true);
        
        t1 = new JTextField();
        t2 = new JTextField();
        l1 = new JLabel("Num1");
        l2 = new JLabel("Num2");
        l3 = new JLabel("Output");
        l4 = new JLabel();
        
        l1.setBounds(10,20,50,20);
        l2.setBounds(10,50,50,20);
        t1.setBounds(60,20,50,20);
        t2.setBounds(60,50,50,20);
        l3.setBounds(10,150,50,20);
        l4.setBounds(60,150,50,20);
        
        f.addMouseListener(this);
        
        f.add(l1);f.add(l2);f.add(l3);f.add(l4);
        f.add(t1);f.add(t2);
        f.setLayout(null);
        
    }
    
    @Override
    public void mousePressed(MouseEvent me){
        int x,y,z;
        x = Integer.parseInt(t1.getText());
        y = Integer.parseInt(t2.getText());
        z = x + y;
        l4.setText(String.valueOf(z));
    }
    
    @Override
    public void mouseReleased(MouseEvent me){
        int x, y,z;
        x = Integer.parseInt(t1.getText());
        y = Integer.parseInt(t2.getText());
        z = x - y;
        l4.setText(String.valueOf(z));
    }
    public static void main(String[] args) {
        new GUIProgram2078();
    }
    
}
