package BTVN05.Ex02;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class ReadFrom {
    public static void main(String[] args) throws IOException  {
        
        // String url = "BTVN05\\Ex02\\filetext.txt";
        // FileInputStream fileInputStream = null;
        // BufferedReader bufferedReader = null;
        FileReader fr = new FileReader("BTVN05\\Ex02\\filetext.txt");
        BufferedReader br = new BufferedReader(fr);
        try { 
            Student studenA = new Student();
            String[] integersInString = br.readLine().split(",");
           for (String strings : integersInString) {
            // System.out.println(strings);
            studenA = new Student(strings, strings, 0, 0);
            
           }
           System.out.print("hoten" +  studenA.getHoten() + "\t");
           System.out.print("que" +  studenA.getQuequan() + "\t");
           System.out.print("hoten" +  studenA.getNamsinh() + "\t");
            
            
          
        
            br.close();
            fr.close();
            
    




        
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
