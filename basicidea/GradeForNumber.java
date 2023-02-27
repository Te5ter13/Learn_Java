/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicidea;

import java.util.Scanner;

class GradeForNumber{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Percentage");
        int x = scan.nextInt();
        String grade = "";
        if (x>90){
            grade = "A+";
        } else if (x < 90 && x > 80) {
            grade = "A";
        }
        else if(x > 70 && x < 80){
            grade = "B+";
        }
        else if( x > 60 && x < 70){
            grade = "B";
        }
        else{
            grade = "C";
        }

        switch(grade){
            case "A+":
                System.out.println("Very good. You Got "+grade);
                break;
            case "A":
                System.out.println("Good. You Got "+grade);
                break;
            case "B+":
                System.out.println("Ok but not good. You got Grade "+grade);
                break;
            case "B":
                System.out.println("Work Hard. You just got Grade:"+grade);
                break;
            case "C":
                System.out.println("Don't Study.Your grade is"+grade);
                break;
            default:
                System.out.println("Enter valid marks");
        }
    }
}        