/**
 * Bai1
 */
public class Bai1 {
    // kiểm tra tăng dần
    public static boolean IsGrow1(int a[], int n) {
        for (int i = 0; i < n - 1; i++)
            if (a[i] > a[i + 1])
                return false;
        return true;
    }

    public static void main(String[] args) {
        // Mảng int [] A={5, 7, 9, 10,16} tạo thành dãy tăng dần hay ko?
        int[] A = { 5, 7, 9, 10, 16 };

        int n = 0;
        if (IsGrow1(A, n)) {
            System.out.println("day số tăng dần");
        } else {
            System.out.println("Dẫy số giảm dần");
        }
    }
}