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

public class TableDemo extends JFrame{
    JTable jt;
    TableDemo(){
        
        setSize(400,400);
        setTitle("Table Demo");
        setVisible(true);
        
        String data[][] = {
            {"1","Ronaldo","2007"},
            {"2", "Messi", "2020"},
            {"3", "Neymar", "2021"}
        };
        
        String columns[] = {"SNO","Player","Year"};
        
        jt = new JTable(data,columns);
        jt.setBounds(30,40,200,300);
        
        add(jt);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        
    }
    public static void main(String[] args) {
        new TableDemo();
    }
}
