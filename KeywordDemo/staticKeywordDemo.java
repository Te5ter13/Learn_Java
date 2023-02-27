/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KeywordDemo;

/**
 *
 * @author tester13
 */
public class staticKeywordDemo {
    
    //static variable
    private static int x;
    
    //static method
    public static void setX(int value){
        x = value;
    }
    
    //Static method
    public static int getX(){
        return x;
    }
    
    public static void main(String[] args) {
    staticKeywordDemo.setX(10);
    int value = staticKeywordDemo.getX();
    System.out.println(value);
    }
}

