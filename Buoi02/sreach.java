package Buoi02;

public class sreach {
    public static int sreachNumber(int a[], int n) {
        int trai = 0;
        int phai = a.length - 1;

        for (int i = trai; i <= phai; i++) {
            System.out.println("trai,phai" + i + " :" + trai + " " + phai);
            int giua = (trai + phai) / 2;
            System.out.println("giua :  " + giua);
            if (a[giua] == n) {
                return giua;
            } else if (a[giua] > n) {
                phai = giua - 1;
            } else {
                trai = giua + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 6, 7, 9, 12, 14, 18, 19, 20, 21 };
        System.out.println(sreachNumber(arr, 7));

    }
}
