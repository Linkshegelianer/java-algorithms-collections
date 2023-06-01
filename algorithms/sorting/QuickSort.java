/*
Quick sort is a divide-and-conquer sorting algorithm that works by selecting a pivot element,
partitioning the array into two subarrays based on the pivot,
and recursively applying the same process to the subarrays.
Best Time Complexity: O(n log n)
Average Time Complexity: O(n log n)
Worst Time Complexity: O(n^2)
Space Complexity: O(log n)
 */

import java.util.Arrays;
public class QuickSort {

    public static int[] quickSort(int[] items, int low, int high) {
        if (items.length <= 1) { // base case for recursive part
            return items;
        }

        int mid = low + (high - low) / 2;
        int pivot = items[mid];

        int i = low, j = high; //  two pointers that will traverse the array from opposite directions
        while (i <= j) {
            while (items[i] < pivot) {
                i++;
            }

            while (items[j] > pivot) {
                j--;
            }

            // items[i] is greater than pivot and items[j] is less than pivot, so their positions should be swapped
            if (i <= j) {
                int temp = items[i];
                items[i] = items[j];
                items[j] = temp;
                i++;
                j--;
            }
        }

        // if there are still elements on the left or right side of the partition
        if (low < j) {
            quickSort(items, low, j);
        }

        if (high > i) {
            quickSort(items, i, high);
        }

        return items;
    }

    public static void main(String[] args) {
        int[] example = {2, 5, 3, 1, 4};
        System.out.println(Arrays.toString(quickSort(example, 0, 4)));
    }
}