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

public class FlowLayoutDemo extends Frame{
    Button b1,b2,b3,b4,b5,b6;
    FlowLayoutDemo(){
        setSize(400,150);
        setTitle("FlowLayout Demo");
        setLayout(new FlowLayout(FlowLayout.LEFT));
        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        b4 = new Button("Button 4");
        b5 = new Button("5");
        b6 = new Button("Button 6");
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        setVisible(true);
    }
    public static void main(String[] args){
        new FlowLayoutDemo();
    }
}
