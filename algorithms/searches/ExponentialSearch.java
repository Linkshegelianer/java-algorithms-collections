/*
Exponential search involves two steps: find range where the element is present and do binary search in this range.

Average Time Complexity: O(log n)
 */
import java.util.Arrays;
public class ExponentialSearch<T extends Comparable<T>> {

    private final T[] items;

    public ExponentialSearch(T[] items)  {
        this.items = items;
    }

    public int search(T key) {
        if (items[0].equals(key)) return 0;

        int i = 1;

        while (i < items.length && items[i].compareTo(key) <= 0) i *= 2;

        int low = i / 2;
        int high = Math.min(i, items.length - 1);

        return Arrays.binarySearch(items, low, high + 1, key);
    }

    public static void main(String[] args) {
        Integer[] intList = new Integer[] {1, 2, 3, 4, 5, 6};
        int keyInt = 4;
        String[] strList = {"A", "B", "C", "D", "E", "F"};
        String keyStr = "F";
        int index1 = new ExponentialSearch<>(intList).search(keyInt);
        int index2 = new ExponentialSearch<>(strList).search(keyStr);
        System.out.println(index1); // must be 3
        System.out.println(index2); // must be 5
    }
}