package BTVN03.Sochan;

public class test2 {
    static int maxNumber(int a[], int n) {
        int count = 1;
        int max = 0;
        int countArr3 = 0;
        int[] pos3 = new int[n];
        for (int i = 1; i < n; i++) {
            if (a[i - 1] % 2 == 0 && a[i] % 2 == 0)
                count++;
            else
                count = 1;
            if (count == max) {
                countArr3++;
                pos3[countArr3] = i + 1 - max;
            }
            if (count > max) {
                max = count;
                countArr3 = 1;
                pos3[countArr3] = i + 1 - max;
            }
        }
        // for (int j = pos3[countArr3]; j < pos3[countArr3] + max; j++) {
        // System.out.print(a[j] + " ");
        // }
        for (int i = 0; i < countArr3; i++) {
            System.out.print('\n' + "Dãy thứ " + (i + 1) + " là: ");
            for (int j = pos3[countArr3]; j < pos3[countArr3] + max; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.print(" ở vị trí thứ " + (pos3[i] + 1) + " ");
        }
        // System.out.println(" ");
        // System.out.print(" độ dài : ");
        return max;

    }

    public static void main(String[] args) {
        int[] A = { 5, 1, 9, 10, 16, 4, 6, 8, 3 };
        int n = A.length;
        System.out.println(maxNumber(A, n));
        // int max = 0;
        // int countArr3 = 0;
        // int count = 1;
        // int[] pos3 = new int[A.length];
        // pos3[countArr3] = 0;
        // System.out.println('\n' + "\n" + "BÀI TẬP 3 :" + "\n");
        // for (int i = 1; i < A.length; i++) {
        // if (A[i - 1] % 2 == 0 && A[i] % 2 == 0)
        // count++;
        // else
        // count = 1;
        // if (count == max) {
        // countArr3++;
        // pos3[countArr3] = i + 1 - max;
        // }
        // if (count > max) {
        // max = count;
        // countArr3 = 1;
        // pos3[countArr3] = i + 1 - max;
        // }
        // }

        // if (countArr3 == 0)
        // System.out.print("Không tồn tại dãy thoải mãn điều kiện");
        // else if (countArr3 == 1) {
        // System.out.println("Dãy gồm các phần tử là các số chẵn dài nhất có số phần tử
        // là " + max)
        // + " và bắt đầu xuất hiện ở vị trí: " + (pos3[countArr3] + 1));
        // System.out.print("Dãy đó là: ");
        // for (int j = pos3[countArr3]; j < pos3[countArr3] + max; j++) {
        // System.out.print(A[j] + " ");
        // }
        // } else {
        // System.out.print("Các dãy gồm các phần tử là các số chẵn dài nhất có số phần
        // tử là " + max + " và xuất hiện " + countArr3 + " lần : ");
        // for (int i = 0; i < countArr3; i++) {
        // System.out.print('\n' + "Dãy thứ " + (i + 1) + " là: ");
        // for (int j = pos3[i]; j < pos3[i] + max; j++) {
        // System.out.print(A[j] + " ");
        // }
        // System.out.print(" ở vị trí thứ " + (pos3[i] + 1) + " ");
        // }
        // }
    }
}
