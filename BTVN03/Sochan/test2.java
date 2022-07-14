package BTVN03.Sochan;

public class test2 {
    static int maxNumber(int a[], int n) {
        int count3 = 1;
        int max3 = 0;
        int countArr3 = 0;
        int[] pos3 = new int[n];
        for (int i = 1; i < n; i++) {
            if (a[i - 1] % 2 == 0 && a[i] % 2 == 0)
                count3++;
            else
                count3 = 1;
            if (count3 == max3) {
                countArr3++;
                pos3[countArr3] = i + 1 - max3;
            }
            if (count3 > max3) {
                max3 = count3;
                countArr3 = 1;
                pos3[countArr3] = i + 1 - max3;
            }
        }
        return countArr3;
    }

    public static void main(String[] args) {
        int[] A3 = { 5, 1, 9, 10, 16, 4, 6, 8, 3 };
        int n = A3.length;
        System.out.println(maxNumber(A3, n));
        int max3 = 0;
        int countArr3 = 0;
        int count3 = 1;
        int[] pos3 = new int[A3.length];
        pos3[countArr3] = 0;
        System.out.println('\n' + "\n" + "BÀI TẬP 3 :" + "\n");
        for (int i = 1; i < A3.length; i++) {
            if (A3[i - 1] % 2 == 0 && A3[i] % 2 == 0)
                count3++;
            else
                count3 = 1;
            if (count3 == max3) {
                countArr3++;
                pos3[countArr3] = i + 1 - max3;
            }
            if (count3 > max3) {
                max3 = count3;
                countArr3 = 1;
                pos3[countArr3] = i + 1 - max3;
            }
        }

        // if (countArr3 == 0)
        // System.out.print("Không tồn tại dãy thoải mãn điều kiện");
        // else if (countArr3 == 1) {
        // System.out.println("Dãy gồm các phần tử là các số chẵn dài nhất có số phần tử
        // là " + max3
        // + " và bắt đầu xuất hiện ở vị trí: " + (pos3[countArr3] + 1));
        // System.out.print("Dãy đó là: ");
        // for (int j = pos3[countArr3]; j < pos3[countArr3] + max3; j++) {
        // System.out.print(A3[j] + " ");
        // }
        // } else {
        // System.out.print("Các dãy gồm các phần tử là các số chẵn dài nhất có số phần
        // tử là " + max3
        // + " và xuất hiện " + countArr3 + " lần : ");
        // for (int i = 0; i < countArr3; i++) {
        // System.out.print('\n' + "Dãy thứ " + (i + 1) + " là: ");
        // for (int j = pos3[i]; j < pos3[i] + max3; j++) {
        // System.out.print(A3[j] + " ");
        // }
        // System.out.print(" ở vị trí thứ " + (pos3[i] + 1) + " ");
        // }
        // }
    }
}
