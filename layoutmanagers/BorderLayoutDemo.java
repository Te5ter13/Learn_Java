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
public class BorderLayoutDemo extends Frame {
    Button b1,b2,b3,b4,b5;
    BorderLayoutDemo(){
        setSize(400,400);
        setTitle("Border Layout Demo");
        setLayout(new BorderLayout());
        
        b1 = new Button("Button1");
        b2 = new Button("Button2");
        b3 = new Button("Button3");
        b4 = new Button("Button4");
        b5 = new Button("Button5");
        
        add(b5,BorderLayout.CENTER);
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        
        
        setVisible(true);
    }
    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
