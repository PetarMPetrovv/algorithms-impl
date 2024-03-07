import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {15, 22, 17, 6, 9};
        System.out.println("Original Array: " + Arrays.toString(arr));

        InsertionSort insertionSort = new InsertionSort();

        insertionSort.insertion_sort(arr);
        System.out.println("\nSorted array: " + Arrays.toString(arr));
    }

    void insertion_sort(int arr[]) {
        int n = arr.length;

        // loop for each iteration
        for (int i = 1; i < n; i++) {

            // storing value of arr[i] in key temporarily
            int key = arr[i];
            int j = i - 1;

            // Move all the elements to the right side of the key which are greater than key value.
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
