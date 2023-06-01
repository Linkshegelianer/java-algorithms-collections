/*
Merge sort recursively splits the array in half until in cannot be further divided, and then sorts subarrays and
merges them into one sorted array.

Best Time Complexity: O(n log n)
Average Time Complexity: O(n log n)
Worst Time Complexity: O(n log n)
Space Complexity: O(n)
 */

import java.util.Arrays;
public class MergeSort {

    public static int[] mergeSort(int[] items) {
        if (items.length <= 1) { // base case for recursive part
            return items;
        }

        int mid = items.length / 2;
        int[] left = Arrays.copyOfRange(items, 0, mid); // left subarray
        int[] right = Arrays.copyOfRange(items, mid, items.length); // right subarray

        left = mergeSort(left); // recursively divide subarrays
        right = mergeSort(right);

        int[] merged = new int[left.length + right.length];
        // variables to keep track of the current positions in the subarrays and result
        int leftIdx = 0;
        int rightIdx = 0;
        int mergedIdx = 0;

        while (leftIdx < left.length && rightIdx < right.length) {
            if (left[leftIdx] <= right[rightIdx]) {
            // the smallest element is added to result merged[]
                merged[mergedIdx] = left[leftIdx];
                leftIdx++;
            } else {
                merged[mergedIdx] = right[rightIdx];
                rightIdx++;
            }
            mergedIdx++;
        }

        // add remaining elements in the left[] and right[] subarrays
        while (leftIdx < left.length) {
            merged[mergedIdx] = left[leftIdx];
            leftIdx++;
            mergedIdx++;
        }

        while (rightIdx < right.length) {
            merged[mergedIdx] = right[rightIdx];
            rightIdx++;
            mergedIdx++;
        }

        return merged;
    }
    public static void main(String[] args) {
        int[] example = {2, 5, 3, 1, 4};
        System.out.println(Arrays.toString(mergeSort(example)));
    }
}