package BTVN05.Ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
public class WithRead {

   

    // In các phần tử của mảng
  
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        int line;
        char[] array = new char[100];
        int[] number = new int[array.length];
        int[] number1 = new int[10];
        try {
            br = new BufferedReader(new FileReader("BTVN05\\Ex01\\file-content.txt"));

            // Đọc các ký tự và lưu vào array
            br.read(array);
            // br.skip(5);

            // System.out.print("array : ");
            System.out.println(array);
            if (array !=" ") {
                
            }

            int i;
            int count = 0;
            int res  = 0 ;
            // while ((i = br.read()) != -1) {
            //      number[count] = Character.getNumericValue((char) i);
            //     count++;
                
            //     // System.out.print("check" +(char) i);
                
             
            // }
            
            // for (int j : number) {
            //    if (j != 0 && j >0) {
                 
            //     System.out.print(j + " ");
                
            //    }
            // }
            br.close();
        


            // intarray = chararrayToInteger(array);
            // System.out.println(intarray);
            // intarray = chararrayToInt(array);
            // System.out.println(intarray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}