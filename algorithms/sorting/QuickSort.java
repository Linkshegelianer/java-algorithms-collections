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
public class QuickSort<T extends Comparable<T>> {

    private final T[] items;

    public QuickSort(T[] items) {
        this.items = items;
    }

    public void sort() {
        qucksort(0, items.length - 1);
    }

    private void qucksort(int low, int high) {
        if (low >= high) {
            return;
        }

        int pivot = partition(low, high);
        qucksort(low, pivot - 1);
        qucksort(pivot + 1, high);
    }

    private int partition(int low, int high) {
        int pivotIndex = (low + high) / 2;
        swap(pivotIndex, high);
        int pivotIndexCounter = low;
        for (int i = low; i < high; i++) {
            if (items[i].compareTo(items[high]) <= 0) {
                swap(pivotIndexCounter, i);
                pivotIndexCounter++;
            }
        }
        swap(pivotIndexCounter, high);
        return pivotIndexCounter;

    }

    private void swap(int firstIndex, int secondIndex) {
        if (firstIndex != secondIndex) {
            T temp = items[firstIndex];
            items[firstIndex] = items[secondIndex];
            items[secondIndex] = temp;
        }
    }

    public static void main(String[] args) {
        Integer[] exampleInt = {2, 5, 3, 1, 4};
        String[] exampleStr = {"B", "A", "C", "D", "F", "E"};
        System.out.println(Arrays.toString(exampleInt) + " | " + Arrays.toString(exampleStr));
        new QuickSort<>(exampleInt).sort();
        new QuickSort<>(exampleStr).sort();
        System.out.println(Arrays.toString(exampleInt) + " | " + Arrays.toString(exampleStr));
    }
}