import java.util.Arrays;

public class BubbleSort<T extends Comparable<T>> { // so we can use compareTo()

    private final T[] items;

    public BubbleSort(T[] items) {
        this.items = items;
    }

    public void sort() {
        for (int i = 0; i < items.length - 1; i++) {
            boolean didSwap = false;
            for (int j = 0; j < items.length - i - 1; j++) { // -i so don't need to iterate through already sorted items
                if (items[j].compareTo(items[j + 1]) > 0) {
                    // sort in ascending order
                    T temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                    didSwap = true;
                }
            }
            if (!didSwap) { // if there were no swapping, the iteration is stopped to save resources
                break;
            }
        }
    }

    public static void main(String[] args) {
        Integer[] exampleInt = {2, 5, 3, 1, 4};
        String[] exampleStr = {"B", "A", "C", "D", "F", "E"};
        System.out.println(Arrays.toString(exampleInt) + " | " + Arrays.toString(exampleStr));
        new BubbleSort<>(exampleInt).sort();
        new BubbleSort<>(exampleStr).sort();
        System.out.println(Arrays.toString(exampleInt) + " | " + Arrays.toString(exampleStr));
    }
}