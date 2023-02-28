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
public class UserInterface2078 extends JFrame implements ActionListener {
    
    JTextField t1;
    JButton b1,b2,b3;
    JLabel l1,l2,l3;
    
    UserInterface2078(){
        setSize(400,400);
        setTitle("Demo Title");
        setVisible(true);
        
        l1 = new JLabel("Input String");
        l2 = new JLabel("Output:");
        l3 = new JLabel();
        t1 = new JTextField();
        b1 = new JButton("CheckPalindrome");
        b2 = new JButton("Reverse");
        b3 = new JButton("FindVowels");
        l1.setBounds(10,10,100,40);
        t1.setBounds(110,10,100,40);
        b1.setBounds(10,60,100,40);
        b2.setBounds(110,60,100,40);
        b3.setBounds(210,60,100,40);
        l2.setBounds(10,110,50,40);
        l3.setBounds(60,110,200,40);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        add(l1);add(t1);add(b1);add(b2);add(b3);add(l2);add(l3);
        
        setLayout(null);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        String word;
        word = t1.getText();
        String rev = "";
        for(int i = word.length()-1; i>=0; i--){
            rev = rev + word.charAt(i);
        }
        if(ae.getActionCommand()=="CheckPalindrome"){
            if(word.equals(rev)){
                l3.setText("Palindrome");
            }
            else{
                l3.setText("Not Palindrome");
            }
        }
        
        if(ae.getActionCommand() == "Reverse"){
            l3.setText(String.valueOf(rev));
        }
        
        if(ae.getActionCommand() == "FindVowels"){
            String vowelwords="";
            String smword = word.toLowerCase();
            for(int i = smword.length()-1; i>=0; i--){
                if(smword.charAt(i) == 'a'|| smword.charAt(i) == 'e'|| smword.charAt(i)=='i'|| smword.charAt(i) =='o'|| smword.charAt(i) =='u'){
                    vowelwords = vowelwords+word.charAt(i);
                }
                
            }
            l3.setText(String.valueOf(vowelwords));
        }

    }
    public static void main(String[] args) {
        new UserInterface2078();
    }
    
}
