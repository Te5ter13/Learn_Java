/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicidea;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author tester13
 */
public class ConsonantsVowelsFile {
    public static void main(String[] args) throws IOException {
        
        //Create file writer for the vowels and Consonants
        BufferedWriter vowelsWriter = new BufferedWriter(new FileWriter("vowels.txt"));
        BufferedWriter consonantsWriter = new BufferedWriter(new FileWriter("consonants.txt"));
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = scanner.nextLine();
        
        //Looping the character
        for(char c: input.toCharArray()){
            // Write the character to appropriate file
            if(isVowel(c)){
                vowelsWriter.write(c);
            }else{
                consonantsWriter.write(c);
            }
        }
        // close file writers
        vowelsWriter.close();
        consonantsWriter.close();
    }
    private static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ;
    }
}
