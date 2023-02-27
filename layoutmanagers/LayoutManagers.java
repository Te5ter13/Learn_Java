/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package layoutmanagers;

/**
 *
 * @author tester13
 */
import java.awt.*;

public class LayoutManagers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame frame = new Frame("No Layout Test");
        frame.setLayout(null);
        Label label = new Label("First Name");
        label.setBounds(30,50,100,20);
        TextField textfield = new TextField();
        textfield.setBounds(100,50,100,20);
        frame.add(label);
        frame.add(textfield);
        frame.setSize(300,100);
        frame.setVisible(true);
    }
    
}
