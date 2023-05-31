/*
Insertion sort divides an array into sorted (left) and unsorted (right) parts, and inserts elements to the sortet part according to its position comparing them to the previous elements in the sorted part.
Best Time Complexity: O(n)
Average Time Complexity: O(n^2)
Worst Time Complexity: O(n^2)
Space Complexity: O(1)
 */
import java.util.Arrays;
public class InsertionSort {
    
    public static int[] insertionSort(int[] items) {
        int n = items.length; 
        for (int i = 1; i < n; i++) { // iterate from the second element to the last
            int key = items[i];
            int j = i - 1;

            while (j >= 0 && items[j] > key) {
                items[j + 1] = items[j]; // shift the element at index j one position to the right
                j--; // decrement the value of j by 1 to continue comparing the key with previous elements
            }
            items[j + 1] = key; // insert the key value into its correct position
        }
        return items;
    }

    public static void main(String[] args) {
        int[] example = {2, 5, 3, 1, 4};
        System.out.println(Arrays.toString(insertionSort(example)));
    }
}