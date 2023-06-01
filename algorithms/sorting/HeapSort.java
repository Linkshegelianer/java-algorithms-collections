/*
Heap sort works by first building a max heap data structure from the input array, then repeatedly swapping
the root element (max value) with the last element of the heap, reducing the heap size by one, and finally
heapifying the reduced heap to ensure the next largest element is at the root.
Best Time Complexity: O(n log n)
Average Time Complexity: O(n log n)
Worst Time Complexity: O(n log n)
Space Complexity: O(1)
 */

import java.util.Arrays;
public class HeapSort {

    public static void heapSort(int[] items) {
        int n = items.length;

        for (int i = n / 2 - 1; i>= 0; i--) {
            heapify(items, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = items[0];
            items[0] = items[i];
            items[i] = temp;

            heapify(items, i, 0);
        }
    }

    public static void heapify(int[] items, int heapSize, int rootIndex) {
        int largestIndex = rootIndex;
        int leftChildIndex = 2 * rootIndex + 1;
        int rightChildIndex = 2 * rootIndex + 2;

        if (leftChildIndex < heapSize && items[leftChildIndex] > items[largestIndex]) {
            largestIndex = leftChildIndex;
        }

        if (rightChildIndex < heapSize && items[rightChildIndex] > items[largestIndex]) {
            largestIndex = rightChildIndex;
        }

        if (largestIndex != rootIndex) {
            int temp = items[rootIndex];
            items[rootIndex] = items[largestIndex];
            items[largestIndex] = temp;

            heapify(items, heapSize, largestIndex);
        }
    }

    public static void main(String[] args) {
        int[] example = {2, 5, 3, 1, 4, 6, 9, 8, 7, 10, 14, 12, 11, 13};
        heapSort(example);
        System.out.println(Arrays.toString(example));
    }
}