/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicidea;
import java.util.Scanner;
/**
 *
 * @author tester13
 */
public class DemoIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess the +ve number");
        int x = scan.nextInt();
        if (x > 13){
            System.out.println("You missed the devil's number");
        }
        else if( x < 13 ){
            System.out.println("Far away from devil's number");
        }
        else{
            System.out.println("That's the devil number");
        }
    }
}
