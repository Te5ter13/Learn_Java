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

public class MenuDemo extends JFrame{
    JMenuBar mb;
    JMenu m1;
    JMenuItem i1,i2,i3;

    
    MenuDemo(){
        setSize(400,400);
        setTitle("Menu Demo");
        setVisible(true);
        
  
        mb = new JMenuBar();
        m1 = new JMenu("Home");
        i1 = new JMenuItem("Item1",new ImageIcon("/home/tester13/Pictures/who.png"));
        i2 = new JMenuItem("Item2");
        i3 = new JMenuItem("Item3");
        
        m1.add(i1);m1.add(i2);m1.add(i3);
        mb.add(m1);
        

        
        m1.add(new JCheckBoxMenuItem("option1"));
        m1.add(new JRadioButtonMenuItem("radion1"));
        

        //set Menubar
        setJMenuBar(mb);
        
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
    }
    public static void main(String[] args) {
        new MenuDemo();
    }
}
