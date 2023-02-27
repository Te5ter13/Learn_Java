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

public class MnemonicsAndAccelerator extends JFrame {
    JMenuBar mb;
    JMenu m1;
    JMenuItem i1,i2,i3;
    JPasswordField t1;
    JLabel l1;
    MnemonicsAndAccelerator(){
        setSize(300,300);
        setTitle("Mnemonics and Accelerator Demo");
        setVisible(true);
        
        mb = new JMenuBar();
        m1 = new JMenu("Home");
        i1 = new JMenuItem("Item1");
        i2 = new JMenuItem("Item2");
        i3 = new JMenuItem("Item3");
        t1 = new JPasswordField(10);
        l1 = new JLabel("Password");
        
        m1.add(i1);m1.add(i2);m1.add(i3);
        mb.add(m1);
        
        //Setting mnemonics
        m1.setMnemonic('H');
        
        //Setting Accelerator
        i1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.ALT_MASK));
        
        //Enabling and Disabling Menu Items
        i2.setEnabled(false);
        i3.setEnabled(true);
        
        //Textfield
        add(l1);
        add(t1);
        
        //SetTooltip
        t1.setToolTipText("Enter Your Name");
        l1.setToolTipText("What is this");
        
        setJMenuBar(mb);
        setLayout(new FlowLayout(FlowLayout.LEFT));
    }
    public static void main(String[] args) {
        new MnemonicsAndAccelerator();
    }
}
