/*
Selection sort chooses one min element from the unsorted part of the array and swaps it with the first element
of the unsorted part, gradually building a sorted part from left to right.
Best Time Complexity: O(n^2)
Average Time Complexity: O(n^2)
Worst Time Complexity: O(n^2)
Space Complexity: O(1)
 */
import java.util.Arrays;
public class SelectionSort {

    public static int[] selectionSort(int[] items) {
        int n = items.length - 1;

        for (int i = 0; i < n; i++) {
            int min = i; // position to hold min element in the unsorted part

            for (int j = i + 1; j < n; j++) { // iterate through the unsorted part
                if (items[j] < items[min]) {
                    min = j; // place new element to the min index
                }
            }

            int temp = items[min];
            items[min] = items[i]; // swap the min element with the first element of the unsorted part
            items[i] = temp; // swap the current element with the min, placing min in its correct sorted position
        }
        return items;
    }

    public static void main(String[] args) {
        int[] example = {2, 5, 3, 1, 4};
        System.out.println(Arrays.toString(selectionSort(example)));
    }
}
