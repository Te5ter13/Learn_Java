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

public class GridBagLayoutDemo extends Frame{
    Button b1,b2,b3,b4, b5;
    GridBagConstraints gbc;
    GridBagLayoutDemo(){
        setSize(300,300);
        setTitle("GridBagLayoutDemo");
        setLayout(new GridBagLayout());
        
        gbc = new GridBagConstraints();
        b1 = new Button("Button1");
        gbc.gridwidth = 1;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.weightx = 0.5;
        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10,10,10,10);
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(b1,gbc);
        
        b2 = new Button("Button2");
        gbc.gridx = 1;
        add(b2,gbc);
        
        b3 = new Button("Button3");
        gbc.gridx = 2;
        add(b3,gbc);
        
        b4 = new Button("This is Long Button 4");
        gbc.gridwidth = 3;
        gbc.ipady = 100;
        gbc.gridy = 1;
        gbc.gridx = 0;
        add(b4,gbc);
        
        b5 = new Button("Button 5");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.ipady = 20;
        gbc.gridwidth = 2;
        add(b5, gbc);
        
        
        setVisible(true);
    }
    public static void main(String[] args) {
        new GridBagLayoutDemo();
    }
}
