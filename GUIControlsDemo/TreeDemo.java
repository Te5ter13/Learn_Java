/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIControlsDemo;

/**
 *
 * @author tester13
 */
import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;

public class TreeDemo extends JFrame {
    JTree t;
    TreeDemo(){
        setSize(300,300);
        setTitle("Tree Demo");
        setVisible(true);
        
        DefaultMutableTreeNode t1 = new DefaultMutableTreeNode("First");
        DefaultMutableTreeNode t2 = new DefaultMutableTreeNode("Second");
        DefaultMutableTreeNode t3 = new DefaultMutableTreeNode("Third");
        
        t1.add(t2);
        t1.add(t3);
        
        DefaultMutableTreeNode s1 = new DefaultMutableTreeNode("Second1");
        DefaultMutableTreeNode s2 = new DefaultMutableTreeNode("Second2");
        DefaultMutableTreeNode s3 = new DefaultMutableTreeNode("Second3");
        
        t2.add(s1);
        t2.add(s2);
        t2.add(s3);
        
        t = new JTree(t1);
        add(t);
        
        setLayout(new FlowLayout(FlowLayout.CENTER));
    }
    public static void main(String[] args) {
        new TreeDemo();
    }
}
