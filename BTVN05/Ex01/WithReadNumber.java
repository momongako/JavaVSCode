package BTVN05.Ex01;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class WithReadNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        
        
        
        try {
            br = new BufferedReader(new FileReader("BTVN05\\Ex01\\Numbers.txt"));
            // DataOutputStream out = new DataOutputStream(new FileOutputStream("BTVN05\\Ex01\\Numbers.txt"));
            
            

            String[] integersInString = br.readLine().split(" ");
                int a[] = new int[integersInString.length];
                for (int i = 0; i < integersInString.length; i++) {
                    a[i] = Integer.parseInt(integersInString[i]);
                }
                int max = 0;
                int countArr = 0;
                int count = 1;
                int[] B = new int[a.length];
                B[countArr] = 0;
                for (int i = 1; i < a.length; i++) {
                    if (a[i - 1] % 2 == 0 && a[i] % 2 == 0)
                        count++;
                    else
                        count = 1;
                    if (count == max) {
                        countArr++;
                        B[countArr] = i + 1 - max;
                    }
                    if (count > max) {
                        max = count;
                        countArr = 1;
                        B[countArr] = i + 1 - max;
                    }
                }
                if (countArr == 0)
                    System.out.print("ko ton tai");

                else if (countArr == 1) {

                    System.out.println("do dai " + max);
                    for (int j = B[countArr]; j < B[countArr] + max; j++) {
                        System.out.print(a[j] + " ");
                    }
                } else {

                    System.out.println("do dai " + max);
                    for (int i = 0; i < countArr; i++) {
                        System.out.print('\n' + " " + (i + 1) + ": ");

                        for (int j = B[i]; j < B[i] + max; j++) {
                            System.out.print(a[j] + " ");
                        }
                        
                    }
                }

               
                // for (int i = 1; i < a.length; ++i) {
                //     int key = a[i];
                //     int j = i - 1;
        
                //     // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
                //     // đến một vị trí trước vị trí hiện tại của chúng
                //     while (j >= 0 && a[j] > key) {
                //         a[j + 1] = a[j];
                //         j = j - 1;
                //     }
                //     a[j + 1] = key;
                // }
                // for (int i : a) {
                //     System.out.print(i + " ");
                //     out.writeBytes(i + " ");
                // }
                // Đọc file Number
                

            br.close();
            


            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
