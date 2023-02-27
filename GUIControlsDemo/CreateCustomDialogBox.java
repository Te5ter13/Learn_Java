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
import java.awt.*;

public class CreateCustomDialogBox extends JFrame{
    JDialog d;
    JLabel l1;

    JButton b1;
    CreateCustomDialogBox(){
        setDefaultLookAndFeelDecorated(true);
        setTitle("Custom Dialog Box");
        setVisible(true);
        

        l1 = new JLabel("Name");
        d = new JDialog(this,"Dialog Example",true);
        b1 = new JButton("SUBMIT");
        
        setLayout(new FlowLayout(FlowLayout.CENTER));
        d.setSize(300,200);
        d.setLocation(50,50);
        d.setModal(true);
        
        d.add(l1);

        d.add(b1);
        d.setVisible(true);
        
    }
    public static void main(String[] args) {
        new CreateCustomDialogBox();
    }
}
