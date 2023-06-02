/*
Merge sort recursively splits the array in half until in cannot be further divided, and then sorts subarrays and
merges them into one sorted array.

Best Time Complexity: O(n log n)
Average Time Complexity: O(n log n)
Worst Time Complexity: O(n log n)
Space Complexity: O(n)
 */

import java.util.Arrays;
@SuppressWarnings("unchecked")
public class MergeSort<T extends Comparable<T>> {

    private final T[] items;

    public MergeSort(T[] items) {
        this.items = items;
    }

    public void mergeSort(int low, int high) {
        if (low >= high) {
            return;
        }
        int middle = (low + high) / 2;
        mergeSort(low, middle);
        mergeSort(middle + 1, high);
        merge(low, middle, high);
    }

    public void sort() {
        mergeSort(0, items.length - 1);
    }

    private void merge(int low, int middle, int high) {

        T[] leftArray = (T[]) new Comparable[middle - low + 1];
        T[] rightArray = (T[]) new Comparable[high - middle];

        System.arraycopy(items, low, leftArray, 0, leftArray.length);
        System.arraycopy(items, middle + 1, rightArray, 0, rightArray.length);

        int leftSubArrCounter = 0;
        int rightSubArrCounter = 0;
        int arrCounter = low;
        while (leftSubArrCounter < leftArray.length && rightSubArrCounter < rightArray.length) {
            items[arrCounter++] = leftArray[leftSubArrCounter].compareTo(rightArray[rightSubArrCounter]) <= 0
                    ? leftArray[leftSubArrCounter++]
                    : rightArray[rightSubArrCounter++];
        }

        while (leftSubArrCounter < leftArray.length) {
            items[arrCounter++] = leftArray[leftSubArrCounter++];
        }

        while (rightSubArrCounter < rightArray.length) {
            items[arrCounter++] = rightArray[rightSubArrCounter++];
        }

    }

    public static void main(String[] args) {
        Integer[] exampleInt = {2, 5, 3, 1, 4};
        String[] exampleStr = {"B", "A", "C", "D", "F", "E"};
        System.out.println(Arrays.toString(exampleInt) + " | " + Arrays.toString(exampleStr));
        new MergeSort<>(exampleInt).sort();
        new MergeSort<>(exampleStr).sort();
        System.out.println(Arrays.toString(exampleInt) + " | " + Arrays.toString(exampleStr));
    }
}