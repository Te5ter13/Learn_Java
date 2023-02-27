/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIControlsDemo;

/**
 *
 * @author tester13
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PopupMenuDemo extends JFrame{
    JPopupMenu p1;
    JMenuItem i1,i2,i3;
    
    PopupMenuDemo(){
        JFrame f = new JFrame("Hello");
        setSize(400,400);
        setTitle("Popup Menu Demo");
        setVisible(true);
        
        p1 = new JPopupMenu("Home");
        i1 = new JMenuItem("Item1");
        i2 = new JMenuItem("Item2");
        i3 = new JMenuItem("Item3");
        
        addMouseListener(new MouseAdapter(){
            public void MouseClicked(MouseEvent e){
                p1.show(f, e.getX(), e.getY());
            }
        });
        
        p1.add(i1);p1.add(i2);p1.add(i3);
        add(p1);
    }
    public static void main(String[] args) {
        new PopupMenuDemo();
    }
}
