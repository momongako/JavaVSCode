public class Bai2 {
    public static void main(String[] args) {
        // (2) Cho mảng int [] A={5, 1, 9, 10,16, 4,6, 8, 3}.
        // Hãy xác định và in dãy con tăng dần dài nhất có tổng các phần tử lớn hơn 20
        // nho hon 100
        int[] A = { 5, 1, 9, 10, 16, 4, 6, 8, 3 };
        int max = 1;
        int dem = 1;
        int lastNumber = 0;
        int sumA = A[0];
        int sumArray = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1]) {
                dem++;
                sumA = A[i] + sumA;

            } else {

                dem = 1;
                sumA = A[i];
            }
            if (dem > max && sumA > 20 && sumA < 100) {
                max = dem;
                lastNumber = i + 1;
                sumArray = sumA;

            }

        }

        System.out.println("Do dai :" + max);
        System.out.println("1.2 : " + lastNumber);
        System.out.println("sumArray : " + sumArray);

        for (int i = lastNumber - max; i < lastNumber - 1; i++) {
            // sumA = A[i] + sumA;
            System.out.print(A[i] + ",");

        }
        System.out.println(A[max] + "!");

        // Số chẫn dài nhất

        for (int i = 1; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                dem++;

            } else {

                dem = 0;
            }
            if (dem > max) {
                max = dem;
                lastNumber = i + 1;
                sumA = A[i] + sumA;
            }

        }
        if (sumA > 20) {
            for (int i = lastNumber - max; i < lastNumber; i++) {
                // sumA = A[i] + sumA;
                System.out.println("số chẫn cua A la : " + A[i]);
            }
        }
        System.out.println("1.1 :" + max);
        System.out.println("1.2 : " + lastNumber);
        System.out.println(sumA);
    }
}
