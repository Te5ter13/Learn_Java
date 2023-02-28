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
import javax.swing.*;
import java.awt.event.*;
public class MouseEventHandling extends JFrame implements MouseListener {
    
    JLabel l1;
    JTextArea t1;
    JButton b1;
    MouseEventHandling(){
        setSize(400,400);
        setTitle("Mouse Event Handling Demo");
        setVisible(true);
        
        l1 = new JLabel();
        b1 = new JButton("Click");
        l1.setBounds(40,40,100,50);
        b1.setBounds(40,80,100,50);
        
        setLayout(null);
        b1.addMouseListener(this);
        add(l1);add(b1);
        
        
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        l1.setText("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent me) {
        l1.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        l1.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        l1.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        l1.setText("Mouse Exited");
    }
    public static void main(String[] args) {
        new MouseEventHandling();
    }
    
}
