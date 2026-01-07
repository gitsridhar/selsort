import java.util.Arrays;

public class RecursiveSelectionSort {

    /**
     * Recursively sorts an array using the Selection Sort logic.
     * @param arr   The array to be sorted.
     * @param start The starting index for the current recursive pass.
     */
    public static void selectionSortRecursive(int[] arr, int start) {
        int n = arr.length;

        // Base case: If start index reaches the end, the array is sorted
        if (start >= n - 1) {
            return;
        }

        // 1. Find the index of the minimum element in the range [start, n-1]
        int minIndex = start;
        for (int i = start + 1; i < n; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        // 2. Swap the found minimum element with the element at the 'start' index
        if (minIndex != start) {
            int temp = arr[minIndex];
            arr[minIndex] = arr[start];
            arr[start] = temp;
        }

        // 3. Recursively sort the remaining unsorted part of the array
        selectionSortRecursive(arr, start + 1);
    }

    public static void main(String[] args) {
        int[] data = {64, 25, 12, 22, 11};

        System.out.println("Original Array: " + Arrays.toString(data));

        // Start recursion from the first index
        selectionSortRecursive(data, 0);

        System.out.println("Sorted Array:   " + Arrays.toString(data));
    }
}
