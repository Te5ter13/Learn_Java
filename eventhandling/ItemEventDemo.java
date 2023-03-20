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
public class ItemEventDemo extends JFrame implements ItemListener{
    JComboBox c1;
    
    ItemEventDemo(){
        setSize(400,400);
        setTitle("Item Event Demo");
        setVisible(true);
        String subj[] = {"CyberSec","Developer","DevOps","Pentester"};
        c1 = new JComboBox(subj);
        
        c1.addItemListener(this);
        add(c1);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        
    }
    @Override
    public void itemStateChanged(ItemEvent ie) {
        if(ie.getSource() == c1 && ie.getStateChange() == ie.SELECTED){
            JOptionPane.showMessageDialog(this, "Your Subject is "+c1.getSelectedItem());
            
        }
        
    }
    public static void main(String[] args) {
        new ItemEventDemo();
    }
    
}
