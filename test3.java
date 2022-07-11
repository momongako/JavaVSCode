public class test3 {
    public static void main(String[] args) {
        int[] A = { 5, 7, 1, 9, 10, 16, 4, 6, 8, 3 };
        int max = 1;
        int dem = 1;
        int dodai = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1]) {
                dem++;

            } else {

                dem = 1;
            }
            if (dem > max) {
                max = dem;
                dodai = i + 1;
            }
        }
        System.out.println("1.1 :" + max);
        System.out.println("1.2 : " + dodai);
        for (int i = dodai - max; i < dodai; i++) {
            System.out.println("mang cua A la : " + A[i]);
        }
    }
}
