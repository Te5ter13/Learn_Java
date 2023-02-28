/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

/**
 *
 * @author tester13
 */
import java.awt.event.*;
import javax.swing.*;
public class MRS2077 extends JFrame implements ActionListener{
    JTextField t1,t2,t3,t4,t5;
    JButton b1;
    JLabel l1,l2,l3,l4,l5;
    JTable jt;
    JScrollPane sp;
    
    MRS2077(){
        setSize(400,400);
        setTitle("Movie Rental System");
        setVisible(true);
        
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        b1 = new JButton("OK");
        l1 = new JLabel("id");
        l2 = new JLabel("Tille");
        l3 = new JLabel("Genre");
        l4 = new JLabel("Language");
        l5 = new JLabel("Length");
        
        l1.setBounds(10,10,40,40);
        t1.setBounds(50,10,80,40);
        l2.setBounds(10,80,40,40);
        t2.setBounds(50,80,80,40);
        l3.setBounds(10,140,40,40);
        t3.setBounds(50,140,80,40);
        l4.setBounds(10,200,80,40);
        t4.setBounds(90,200,80,40);
        l5.setBounds(10,260,80,40);
        t5.setBounds(90,260,80,40);
        b1.setBounds(50,340,100,40);
        
        b1.addActionListener(this);
        
        add(l1);add(l2);add(l3);add(l4);add(l5);
        add(t1);add(t2);add(t3);add(t4);add(t5);
        add(b1);
        
        setLayout(null);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        String cols[] = {"id","Tille","Genre","Language","Length"};
        String data[][] = {
            {t1.getText(),t2.getText(),t3.getText(),t4.getText(),t5.getText()}
        };
        jt = new JTable(data,cols);
        sp = new JScrollPane(jt);
        sp.setBounds(50,500,800,200);
        
        add(sp);
        setLayout(null);
        
    }
    public static void main(String[] args) {
        new MRS2077();
    }
}
