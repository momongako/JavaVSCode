package BTVN05.Ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WithRead {

   

    // In các phần tử của mảng
    public static int contains(final char[] arr) {
		int result = 0;
		int length = arr.length - 1;

		for (int i = 0; i <= length; i++)
		{
			int digit = arr[i] - '0';
			result *= 10;
			result += digit;
		}
		return result;
	}

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        int line;
        char[] array = new char[100];
        int intArray = 0;
        int count = 0;
        try {
            br = new BufferedReader(new FileReader("BTVN05\\Ex01\\file-content.txt"));

            // Đọc các ký tự và lưu vào array
            br.read(array);
            System.out.print("Array : ");
            System.out.println(array);
            int val = contains(array);


            // intArray = charArrayToInteger(array);
            // System.out.println(intArray);
            // intArray = charArrayToInt(array);
            // System.out.println(intArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}