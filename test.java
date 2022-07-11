import java.util.StringTokenizer;

import javax.swing.JOptionPane;

/**
 * test
 */
public class test {
    public static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    public static void swapFirstTwoInArray(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }

    public static boolean so(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // int[] A = { 10, 100 };
        // swapFirstTwoInArray(A);
        // System.out.println(A[0] + ";" + A[1]);
        // System.out.println("Hello ");
        // char c;
        // String srt = JOptionPane.showInputDialog(null, "nhap vao ky tu ?");
        // c = srt.charAt(0);
        // switch (c) {
        // case 'a':

        // case 'e':

        // case 'i':
        // case 'o':
        // case 'u':
        // System.out.println("ky tu la nguyen am");
        // break;

        // default:
        // System.out.println("ky tu la phu am");
        // }
        // int[] list1 = { 0, 1, 2, 3, 4, 5 };
        // int[] list2 = new int[list1.length];
        // list2 = list1;
        // list1[0] = 100;
        // for (int i : list2) {
        // System.out.println(i);
        // }
        // System.out.println(list2[0]);
        // int x = 10, y = 100;
        // swap(x, y);
        // System.out.println(x, y);
        // char[][] Student = {
        // { 'A', 'B', 'C', 'D', 'E', 'A', 'B', 'C', 'D', 'E' },
        // { 'A', 'A', 'C', 'D', 'E', 'A', 'B', 'C', 'D', 'E' },
        // { 'A', 'C', 'C', 'D', 'E', 'A', 'B', 'C', 'D', 'E' },
        // { 'A', 'D', 'C', 'D', 'E', 'A', 'B', 'C', 'D', 'E' },
        // { 'A', 'E', 'C', 'D', 'E', 'A', 'B', 'C', 'D', 'E' }
        // };
        // char[] key = { 'A', 'B', 'C', 'D', 'E', 'A', 'B', 'C', 'D', 'E' };
        // int[] studenA = new int[Student.length];
        // int diem = 0;
        // // System.out.println(Student[0][0 - 9]);

        // for (int i = 0; i < Student.length; i++) {

        // for (int j = 0; j < key.length; j++) {
        // // System.out.print(Student[i][j] + "\t");
        // // System.out.println("check key" + key[j]);
        // if (Student[i][j] == key[j]) {
        // diem++;
        // }
        // }
        // // sau khi viết xong 1 dòng thi xuống hàng
        // System.out.println("\n");
        // studenA[i] = diem;
        // diem = 0;

        // }
        // for (int i : studenA) {
        // System.out.println("Diem tung sv : " + i);

        // }
        String s = "Hoang Nguyen Tuan Anh";
        // StringTokenizer tkz = new StringTokenizer(s);
        // System.out.println("tong so token = " + tkz.countTokens());
        // while (tkz.hasMoreTokens()) {
        // System.out.println(tkz.nextToken());
        // }

        // String input = "java coll";

        // StringBuffer stringBuffer = new StringBuffer(s);

        // // System.out.println(stringBuffer.reverse().toString());
        // String[] arrwords = s.split(" ");
        // StringBuffer stb = new StringBuffer(arrwords[arrwords.length - 1]);
        // for (int i = 0; i < arrwords.length; i++) {
        // stb.append(" " + arrwords[i]);
        // System.out.println(stb);
        // }
        // for (String string : s.split("\\s", 2)) {
        // System.out.println(string);
        // }
        String[] words = s.split("\\s");
        String s2 = words[words.length - 1];
        System.out.println(s2);
        for (int i = 0; i < words.length - 1; i++) {
            System.out.println(" " + words[i]);
        }
        // so nguyen to
        // boolean ktra = true;
        // int n = 9;
        // for (int i = 2; i <= Math.sqrt(n); i++)
        // if (n % i == 0) {
        // ktra = false; //
        // break;
        // }
        // // Khi nào thì bỏ {} được?
        // if (ktra)
        // System.out.println(n + " là số nt");
        // else
        // System.out.println(n + " ko là số nt");
        // so nguyen to cach 2
        int n = 9;
        if (so(n)) {
            System.out.println(n + " là số nguyên tố!");
        } else {
            System.out.println(n + " không là số nguyên tố!");
        }
    }

}