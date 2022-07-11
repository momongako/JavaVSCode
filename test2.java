import java.io.Console;

public class test2 {

    public static boolean so(int A[]) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] > A[i + 1]) {
                return false;
            }

            return true;
        }
        return true;

    }

    public static void main(String[] args) {
        int[] A = { 5, 7, 9, 10, 16 };

        // if (so(A)) {
        // System.out.println("tang dan");
        // } else {
        // System.out.println("giam dan");
        // }

        int[] B = { 5, 7, 1, 9, 10, 16, 4, 6, 8, 3 };
        int dem = 0;
        for (int i = 0; i < B.length; i++) {

            if (B[i] < B[i + 1]) {
                dem++;
            } else {
                dem = 0;
            }

        }
        System.out.println(dem);

    }
}
