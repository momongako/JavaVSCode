public class Bai2 {
    public static void main(String[] args) {
        // (2) Cho mảng int [] A={5, 1, 9, 10,16, 4,6, 8, 3}.
        // Hãy xác định và in dãy con tăng dần dài nhất có tổng các phần tử lớn hơn 20
        // nho hon 100
        int[] A = { 5, 1, 9, 10, 16, 4, 6, 8, 3 };
        int max = 1;
        int dem = 1;
        int dodai = 0;
        int sumA = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1]) {
                dem++;

            } else {

                dem = 1;
            }
            if (dem > max) {
                max = dem;
                dodai = i + 1;
                sumA = A[i] + sumA;
            }

        }

        System.out.println("Do dai :" + max);
        System.out.println("1.2 : " + dodai);
        System.out.println("Tong : " + sumA);
        if (sumA > 20 && sumA < 100) {
            for (int i = dodai - max; i < dodai; i++) {
                // sumA = A[i] + sumA;
                System.out.print(A[i] + ",");

            }
            System.out.println("!");
        }

        // for (int i = dodai - max; i < dodai; i++) {
        // sumA = A[i] + sumA;
        // System.out.println("mang cua A la : " + A[i]);
        // }
        // System.out.println(sumA);

        // Số chẫn dài nhất

        for (int i = 1; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                dem++;

            } else {

                dem = 0;
            }
            if (dem > max) {
                max = dem;
                dodai = i + 1;
                sumA = A[i] + sumA;
            }

        }
        if (sumA > 20) {
            for (int i = dodai - max; i < dodai; i++) {
                // sumA = A[i] + sumA;
                System.out.println("số chẫn cua A la : " + A[i]);
            }
        }
        System.out.println("1.1 :" + max);
        System.out.println("1.2 : " + dodai);
        System.out.println(sumA);
    }
}
