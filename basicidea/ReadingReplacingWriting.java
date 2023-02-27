/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicidea;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author tester13
 */
public class ReadingReplacingWriting {
    public static void main(String[] args) throws IOException{
        
        //Reading from file1
        BufferedReader reader = new BufferedReader(new FileReader("...../file1.txt"));
        
        // Writing to file2
        BufferedWriter writer = new BufferedWriter(new FileWriter("........./file2.txt"));
        
        //Read each line from the file
        String line;
        while((line = reader.readLine()) != null){
            //replace all occurance of a with b
            line = line.replace('a','b');
            
            writer.write(line);
            writer.newLine();
            
        }
        // Close the reader and writer
        reader.close();
        writer.close();
    }
}
