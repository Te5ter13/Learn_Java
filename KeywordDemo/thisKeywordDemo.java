/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KeywordDemo;

/**
 *
 * @author tester13
 */
public class thisKeywordDemo {
    private int x;
    private int y;
    
    //Constructor
    public thisKeywordDemo(int x, int y){
        // Using 'this' to refer the current object
        
        this.x = x;
        this.y = y;
    }
    //Method
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        //Use this to refer to the current object
        this.y = y;
    }
    
    // Method
    public void printXY(){
        System.out.println("X = "+this.x+" , y = "+this.y);
    }
    public static void main(String[] args) {
        thisKeywordDemo obj = new thisKeywordDemo(1,2);
        obj.printXY(); // print x = 1 and y = 2
        obj.setX(6);
        obj.setY(9);
        obj.printXY(); // print x = 6  and y = 9
        
    }
}
