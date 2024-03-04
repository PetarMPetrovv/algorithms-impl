import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]) {

        int arr[] = {9, 7, 5, 3, 8, 1, 11};
        System.out.println("Original Array: " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("\nSorted array: " + Arrays.toString(arr));
    }

    static void bubbleSort(int arr[]) {

        int n = arr.length;

    // Loop for each pass
        for (int i = 0; i < n - 1; i++) {
        // Loop to iterate over each element in each pass
            for (int j = 0; j < n - i - 1; j++) {

            // compare two adjacent elements, if swapping is required then do so
                if (arr[j] > arr[j + 1]) {

                // swap both elements using temp variable
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                }
            }
        }
    }
}
