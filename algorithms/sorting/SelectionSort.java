/*
Selection sort chooses one min element from the unsorted part of the array and swaps it with the first element
of the unsorted part, gradually building a sorted part from left to right.
Best Time Complexity: O(n^2)
Average Time Complexity: O(n^2)
Worst Time Complexity: O(n^2)
Space Complexity: O(1)
 */
import java.util.Arrays;
import java.util.stream.IntStream;
public class SelectionSort<T extends Comparable<T>> {

    private final T[] items;

    public SelectionSort(T[] items) { this.items = items; }

    public void sortSimple() {
        for (int i = 0; i < items.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < items.length; j++) {
                if (items[j].compareTo(items[minIndex]) < 0) {
                    minIndex = j; // find index with min value
                }
            }
            if (minIndex != i) {
                T temp = items[i];
                items[i] = items[minIndex];
                items[minIndex] = temp;
            }
        }
    }

    public void sortStream() {
        IntStream.range(0, items.length - 1).forEach(i -> // first for loop
                IntStream.range(i, items.length) // second for loop
                        .reduce((left, right) -> // find the min value among two
                                items[left].compareTo(items[right]) < 0 ? left : right)
                        .ifPresent(minIndex -> { // if the min value is present
                            T temp = items[i];
                            items[i] = items[minIndex];
                            items[minIndex] = temp;
                        })
        );
    }

    public static void main(String[] args) {
        Integer[] exampleInt = {2, 5, 3, 1, 4};
        String[] exampleStr = {"B", "A", "C", "D", "F", "E"};
        System.out.println(Arrays.toString(exampleInt) + " | " + Arrays.toString(exampleStr));
        new SelectionSort<>(exampleInt).sortStream();
        new SelectionSort<>(exampleStr).sortSimple();
        System.out.println(Arrays.toString(exampleInt) + " | " + Arrays.toString(exampleStr));
    }
}
