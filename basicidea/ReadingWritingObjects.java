/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicidea;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 *
 * @author tester13
 */
//To implement reading and writing object in java, we can use ObjectInputStream and ObjectOutputStream classes.

public class ReadingWritingObjects {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        
        //Create object to serialize
        MyObject obj = new MyObject("hello", 123);
        
        //Serialize the object to a file
        FileOutputStream fos = new FileOutputStream("object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        oos.close();
        
        //Deserialize the object
        FileInputStream fis = new FileInputStream("object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        MyObject obj2 = (MyObject) ois.readObject();
        ois.close();
        
        //print deserialized object
        System.out.println(obj2);
        
    }
}

class MyObject implements Serializable{
    private String str;
    private int num;
    
    public MyObject(String str, int num){
        this.str = str;
        this.num = num;
    }
    @Override
    public String toString(){
        return "MyObject[str="+str+", num= "+num+"]";
    }
}