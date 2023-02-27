/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layoutmanagers;

/**
 *
 * @author tester13
 */
import java.awt.*;
import javax.swing.*;

public class GroupLayoutDemo extends Frame {
    Button b1,b2,b3,b4;
    Panel p;
    GroupLayoutDemo(){
        setSize(300,300);
        setTitle("GroupLayout Demo");
        p = new Panel();
        GroupLayout l = new GroupLayout(p);
        p.setLayout(l);
        p.setBackground(Color.GRAY);
        add(p);
        
        l.setAutoCreateContainerGaps(true);
        l.setAutoCreateGaps(true);
        b1 = new Button("Button1");
        b2 = new Button("Button2");
        b3 = new Button("Button3");
        b4 = new Button("Button4");
        l.setHorizontalGroup(l.createSequentialGroup().addComponent(b1).addComponent(b2).addGroup(l.createParallelGroup().addComponent(b3).addComponent(b4)));
        l.setVerticalGroup(l.createSequentialGroup().addGroup(l.createParallelGroup().addComponent(b1).addComponent(b2).addComponent(b3)).addComponent(b4));
        setVisible(true);
        
    }
    public static void main(String[] args) {
        new GroupLayoutDemo();
    }
}
