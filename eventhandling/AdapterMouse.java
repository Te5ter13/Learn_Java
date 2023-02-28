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

public class AdapterMouse extends MouseAdapter {
    JFrame f;
    JButton b1;
    JLabel l1;
    AdapterMouse(){
        f = new JFrame("Mouse Adapter Demo");
        f.setSize(300,300);
        f.setVisible(true);
        
        b1 = new JButton("Click");
        l1 = new JLabel();
        l1.setBounds(40,40,100,80);
        b1.setBounds(40,100,80,20);
        
        b1.addMouseListener(this);
        f.add(b1);f.add(l1);
        
        f.setLayout(null);
        
    }
    @Override
    public void mouseClicked(MouseEvent me){
        l1.setText("Mouse Clicked");
    }

    public static void main(String[] args) {
        new AdapterMouse();
    }
}
