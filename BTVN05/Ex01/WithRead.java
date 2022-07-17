package BTVN05.Ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
public class WithRead {

   

    // In các phần tử của mảng
  
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        
        char[] array = new char[100];
        int[] number = new int[array.length];
        int[] number1 = new int[10];
        try {
            br = new BufferedReader(new FileReader("BTVN05\\Ex01\\file-content.txt"));

            // Đọc các ký tự và lưu vào array
            // br.read(array);
            // br.skip(5);

            // System.out.print("array : ");
            // System.out.println(array);
            

            // int i;
            // int count = 0;
            // int res  = 0 ;
            
            // int a[] = new int[11];
            // String line = br.readLine(); // to read multiple integers line
            // String[] strs = line.trim().split("\\s+");
            // for (int i = 0; i < 10; i++) {
            //     a[i] = Integer.parseInt(strs[i]);
            // }
            

            String[] integersInString = br.readLine().split(" ");
                int a[] = new int[integersInString.length];
                for (int i = 0; i < integersInString.length; i++) {
                    a[i] = Integer.parseInt(integersInString[i]);
                }
                for (int i = 1; i < a.length; ++i) {
                    int key = a[i];
                    int j = i - 1;
        
                    // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
                    // đến một vị trí trước vị trí hiện tại của chúng
                    while (j >= 0 && a[j] > key) {
                        a[j + 1] = a[j];
                        j = j - 1;
                    }
                    a[j + 1] = key;
                }
                for (int i : a) {
                    System.out.print(i + " ");
                }
            // while ((i = br.read()) != -1) {
            //      number[count] = Character.getNumericValue((char) i);
            //     count++;

                
            //     System.out.print("check" +(char) i);
                
             
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