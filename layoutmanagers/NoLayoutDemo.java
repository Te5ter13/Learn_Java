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
public class NoLayoutDemo extends Frame {
    TextField t1;
    Label l1;
    NoLayoutDemo(){
        setSize(300,300);
        setVisible(true);
        
        setLayout(null);
        t1 = new TextField(10);
        l1 = new Label("Name");
        t1.setBounds(100,50,100,20);
        l1.setBounds(50,50,100,20);
        add(l1);
        add(t1);
        
    }
    public static void main(String[] args) {
        new NoLayoutDemo();
    }
}
