/*
Binary search is an efficient algorithm that finds the position of a target value within a sorted array by
repeatedly dividing the search space in half.

Average Time Complexity: O(log n)
 */

public class BinarySearch<T extends Comparable<T>>  {

    private final T[] items;

    public BinarySearch(T[] items) {
        this.items = items;
    }

    public int searchIterative(T key) {
        int low = 0;
        int high = items.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            T guess = items[mid];

            if (guess.compareTo(key) == 0) {
                return mid;
            }
            if (guess.compareTo(key) > 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public int searchRecursive(T key, int low, int high) {

        if (low <= high) {
            int mid = (low + high) / 2;
            T guess = items[mid];

            if (guess.compareTo(key) == 0) {
                return mid;
            }

            if (guess.compareTo(key) > 0) {
                return searchRecursive(key, low, mid - 1);
            } else {
                return searchRecursive(key, mid + 1, high);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] intList = new Integer[] {1, 2, 3, 4, 5, 6};
        int keyInt = 4;
        String[] strList = {"A", "B", "C", "D", "E", "F"};
        String keyStr = "F";
        int index1 = new BinarySearch<>(intList).searchIterative(keyInt);
        int index2 = new BinarySearch<>(strList).searchRecursive(keyStr, 0, 5);
        System.out.println(index1); // must be 3
        System.out.println(index2); // must be 5
    }
}