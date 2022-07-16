package BTVN05.Ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WithRead {

    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
            // đến một vị trí trước vị trí hiện tại của chúng
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // In các phần tử của mảng
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
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
            int result = 0;

            // intArray = charArrayToInteger(array);
            // System.out.println(intArray);
            // intArray = charArrayToInt(array);
            // System.out.println(intArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int charArrayToInteger(char[] array) {
        String arr = new String(array);
        int number = Integer.parseInt(arr);

        return number;
    }

    private static int charArrayToInt(char[] array) {
        int result = 0;
        int length = array.length - 1;

        for (int i = 0; i <= length; i++) {
            int digit = array[i] - '0'; // we don't want to cast by using (int)
            result *= 10;
            result += digit;
        }
        return result;
    }
}