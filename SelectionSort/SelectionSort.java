import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {


        int arr[] = {55,22, 41, 29, 16, 23, 14};
        System.out.println("Original Array: " + Arrays.toString(arr));

        SelectionSort selectionSort = new SelectionSort();

        selectionSort.selection_sort(arr);
        System.out.println("\nSorted array: " + Arrays.toString(arr));
    }
    void selection_sort(int arr[]) {
        int n = arr.length;


        //  Loop for each iteration
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;


            // Loop to find index of minimum element for ith index in each iteration
            for (int j = i + 1; j < n; j++) {

                // Check for the minimum element in each iteration.
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // put that minimum element at ith index using temp variable
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

}