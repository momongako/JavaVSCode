package Buoi02;

public class sapxep1 {

    public static void main(String[] args) {
        int[] A = { 19, 21, 9, 12, 6, 18, 4, 20, 7, 14 };

        int sx = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    sx = A[i];
                    System.out.print(A[i] + ",");
                    A[i] = A[j];
                    A[j] = sx;
                    // System.out.print(sx + ",");
                }

            }
            System.out.println(" ");
        }
        System.out.print("Tang dan : ");
        for (int i : A) {
            System.out.print(i + " ");
        }

        System.out.println("");
        // tu phai sang trai
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {

                sx = A[i];
                A[i] = A[j];
                A[j] = sx;
                System.out.print(sx + ",");

            }
            System.out.println(" ");
        }
        System.out.print("tu phai sang trai : ");
        for (int i : A) {
            System.out.print(i + " ");
        }
    }

}
