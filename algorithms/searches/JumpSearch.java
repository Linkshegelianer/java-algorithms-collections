/*
Jump search is cheking fewer elements that linear search by jumping ahead by fixed steps or skipping some
elements in place of searching all elements.

Average Time Complexity: O(sqrt(n))
 */

public class JumpSearch<T extends Comparable<T>> {

    private final T[] items;

    public JumpSearch(T[] items) {
        this.items = items;
    }

    public int search(T key) {
        int low = 0;
        int high = items.length - 1;
        int jump = (int) Math.sqrt(items.length);

        while (items[Math.min(jump, high)].compareTo(key) < 0) {
            low = jump;
            jump += (int) (Math.sqrt(high + 1));
            if (low >= high) {
                return -1;
            }
        }

        while (items[low].compareTo(key) < 0) {
            low++;
            if (low == Math.min(jump, high + 1)) {
                return -1;
            }
        }

        if (items[low].compareTo(key) == 0) {
            return low;
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] intList = new Integer[] {1, 2, 3, 4, 5, 6};
        int keyInt = 4;
        String[] strList = {"A", "B", "C", "D", "E", "F"};
        String keyStr = "F";
        int index1 = new JumpSearch<>(intList).search(keyInt);
        int index2 = new JumpSearch<>(strList).search(keyStr);
        System.out.println(index1); // must be 3
        System.out.println(index2); // must be 5
    }
}