package Buoi02;

/**
 * sapxepchen
 */
public class sapxepchen {
    static void sapxep(int arr[], int n) {
        int i, key, j;
        for (i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;

            /*
             * Di chuyển các phần tử có giá trị lớn hơn giá trị
             * key về sau một vị trí so với vị trí ban đầu
             * của nó
             */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int arr[], int n) {
        int i;
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }

    // sắp xếp từ phải sang trái
    static void sapxepnguoc(int arr[], int n) {
        int i, key, j;

        for (i = n - 2; i >= 0; i--) {
            key = arr[i];
            j = i + 1;

            while (j <= n - 1 && key > arr[j]) {
                arr[j - 1] = arr[j];
                j++;
            }
            arr[j - 1] = key;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 19, 21, 9, 12, 6, 18, 4, 20, 7, 14 };

        sapxepnguoc(arr, arr.length);

        printArray(arr, arr.length);

    }
}