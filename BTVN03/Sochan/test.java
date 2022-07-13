package BTVN03.Sochan;

// Java Program to find the Length of the longest
// Subarray with only Even Elements
public class test {

    // Function to find the Length of the longest
    // Subarray with only Even Elements
    static int maxEvenSubarray(int array[], int N) {
        int ans = 0;
        int count = 0;

        // Iterate the loop
        for (int i = 0; i < array.length; i++) {

            // Check whether the element is
            // even in continuous fashion
            if (array[i] % 2 == 0) {
                count++;
                ans = Math.max(ans, count);

            }

            else {
                // If element are not even in continuous
                // fashion. Reinitialize the count
                count = 0;
            }
            return array[i];
        }

        // Check for the last element in the array
        ans = Math.max(ans, count);
        return ans;
    }

    // Driver Code
    public static void main(String args[]) {
        int arr[] = { 5, 1, 9, 10, 16, 4, 6, 8, 3 };

        int N = arr.length;

        System.out.println(maxEvenSubarray(arr, N));
    }
}
