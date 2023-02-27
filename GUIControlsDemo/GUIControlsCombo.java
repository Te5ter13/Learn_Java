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

public class GUIControlsCombo extends JFrame{
    //Text Inputs
    JTextField t1;
    JTextArea ta;
    JLabel l1,l2;
    JPasswordField p1;
    JScrollPane sp;
    
    //Choice Components
    JCheckBox c1,c2,c3;
    JRadioButton r1,r2;
    JPanel jp; //For Border
    JComboBox cb;
    JSlider sl;
    
    GUIControlsCombo(){
        setSize(400,400);
        setTitle("GUI Controls Demo");
        setVisible(true);
        
        l1 = new JLabel("Name");
        t1 = new JTextField(10);
        ta = new JTextArea("TextArea Output",20,30);
        l2 = new JLabel("Enter Password");
        p1 = new JPasswordField(10);
        sp = new JScrollPane(ta);
        
        c1 = new JCheckBox("Computer");
        c2 = new JCheckBox("Cyber Security");
        c3 = new JCheckBox("Information Technology");
        
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        
        //Setting Borders
        jp = new JPanel();
        jp.setPreferredSize(new Dimension(400,50));
        jp.setBorder(BorderFactory.createRaisedBevelBorder());
        
        //Combo Box
        String country[] = {"Nepal","China","Canada","US"};
        cb = new JComboBox(country);
        
        //Slider
        sl = new JSlider(JSlider.HORIZONTAL,0,50,20);
        
        add(l1);
        add(t1);
        add(ta);
        add(l2);
        add(p1);
        
        
        
        sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(sp);
        
        add(c1);add(c2);add(c3);
        add(r1);add(r2);
        
        //Adding Borders
        jp.add(new JLabel("This is Border Demo",JLabel.CENTER));
        add(jp,BorderLayout.CENTER);
        
        //Adding ComboBox
        add(cb);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        //Addin Slider
        add(sl);
    }
    public static void main(String[] args) {
        new GUIControlsCombo();
    }
}
