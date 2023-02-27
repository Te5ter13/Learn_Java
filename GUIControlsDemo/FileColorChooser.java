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

public class FileColorChooser extends JFrame{
    JFileChooser f;
    JPanel p;
    JColorChooser cc;
    
    FileColorChooser(){
        setSize(400,400);
        setTitle("FileChooser");
        setVisible(true);
        
        f = new JFileChooser();
        f.showOpenDialog(this);
        
        p = new JPanel();
        cc = new JColorChooser();
        p.setBackground(cc.showDialog(this,"Select Color",Color.red));
    }
    
    public static void main(String[] args) {
        new FileColorChooser();
    }
}
