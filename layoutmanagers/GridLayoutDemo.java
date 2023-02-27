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
public class GridLayoutDemo extends Frame{
    Button b1,b2,b3,b4,b5;
    GridLayoutDemo(){
        setSize(400,400);
        setTitle("GridLayoutDemo");
        setLayout(new GridLayout(0,2));
        
        b1 = new Button("Button1");
        b2 = new Button("Button2");
        b3 = new Button("Button3");
        b4 = new Button("Button2");
        b5 = new Button("Button3");
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GridLayoutDemo();
    }
    
}
