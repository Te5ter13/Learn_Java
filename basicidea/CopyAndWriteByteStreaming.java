/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicidea;

/**
 *
 * @author tester13
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class CopyAndWriteByteStreaming {
    public static void main(String[] args) throws IOException{
        File file = new File("....../abc.txt");
        FileInputStream fis = new FileInputStream(file);
        byte bytes[] = new byte[(int) file.length()];
        
        //Reading data from file
        fis.read(bytes);
        
        //Writing data to xyz file
        File out = new File("...../xyz.txt");
        FileOutputStream fos = new FileOutputStream(out);
        fos.write(bytes);
        fos.flush();
        System.out.println("Data successfully written to specified file");
    }
}
