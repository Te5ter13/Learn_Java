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
public class MouseAdapterDemo extends MouseAdapter {
    
    Frame f;
    MouseAdapterDemo(){
        
        f = new Frame("Mouse Adapter Demo");
        f.addMouseListener(this);
        f.setSize(300,300);
        f.setVisible(true);
        
    }
    public void mouseClicked(MouseEvent e){
        Graphics g = f.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(), e.getY(), 30, 30);

    }
    
    public static void main(String[] args) {
        new MouseAdapterDemo();
    }
        
}
