/*
Fibonacci search is based on the divide and conquer technique (dynamic programming). It works on array with ascending
order by creating a search tree and finding the key in this tree.

Fib numbers: F(n) = F(n - 1) + F(n - 2)


Average Time Complexity: O(log n)
 */

public class FibonacciSearch<T extends Comparable<T>> {

    private final T[] items;

    public FibonacciSearch(T[] items) {
        this.items = items;
    }

    public int search(T key) {
        int lowFibNumber = 0;
        int middleFibNumber = 1;
        int highFibNumber = middleFibNumber + lowFibNumber;
        int n = items.length;

        while (highFibNumber < n) { // find the smallest Fib number greater than or equal to n
            lowFibNumber = middleFibNumber;
            middleFibNumber = highFibNumber;
            highFibNumber = middleFibNumber + lowFibNumber;
        }

        int offset = -1; // offset to track the index of the last-checked element during the search process

        while (highFibNumber > 1) {
            int i = Math.min(offset + lowFibNumber, n - 1); // index of the element to compare with

            if (items[i].compareTo(key) < 0) {
                highFibNumber = middleFibNumber;
                middleFibNumber = lowFibNumber;
                lowFibNumber = highFibNumber - middleFibNumber;
                offset = i;
            }

            else if (items[i].compareTo(key) > 0) {
                highFibNumber = lowFibNumber;
                middleFibNumber = middleFibNumber - lowFibNumber;
                lowFibNumber = highFibNumber - middleFibNumber;
            } else return i;
        }

        if (middleFibNumber == 1 && offset + 1 < n && items[offset + 1].compareTo(key) == 0) {
            return offset + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        Integer[] intList = new Integer[] {1, 2, 3, 4, 5, 6};
        int keyInt = 4;
        String[] strList = {"A", "B", "C", "D", "E", "F"};
        String keyStr = "F";
        int index1 = new FibonacciSearch<>(intList).search(keyInt);
        int index2 = new FibonacciSearch<>(strList).search(keyStr);
        System.out.println(index1); // must be 3
        System.out.println(index2); // must be 5
    }
}