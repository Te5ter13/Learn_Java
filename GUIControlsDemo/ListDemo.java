/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIControlsDemo;

/**
 *
 * @author tester13
 */
import java.awt.FlowLayout;
import javax.swing.*;
public class ListDemo extends JFrame {
    
    ListDemo(){
        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("Item");
        l1.addElement("Item2");
        l1.addElement("Item3");
        l1.addElement("Item3");
        
        JList<String> list = new JList<>(l1);
        list.setBounds(100,100,30,50);
        add(list);
        setSize(300,300);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.CENTER));
    }
    public static void main(String[] args) {
        new ListDemo();
    }
}
