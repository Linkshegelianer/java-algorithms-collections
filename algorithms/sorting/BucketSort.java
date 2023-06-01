/*
Bucket sort is a scatter-sort-gather algorithms which works by distributing the elements to sort into
several individually sorted buckets. The exact number of buckets is not fixed, usually it is equal to
the number of elementf of the array.

If the elements are uniformly distributed inside the buckets:
Best Time Complexity: O(n) - each element has one bucket/elements are equally distributed among buckets
Worst Time Complexity: O(n log n) - all elements in one bucket
 */
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class BucketSort {

    public static int[] bucketSort(int[] items, int bucketSize) {
        if (items.length <= 1) { // base case for recursive part
            return items;
        }

        int min = items[0];
        int max = items[0];
        for (int i = 1; i < items.length; i++) {
            if (items[i] < min) {
                min = items[i];
            } else if (items[i] > max) {
                max = items[i];
            }
        }

        int bucketCount = (max - min) / bucketSize + 1;

        List<List<Integer>> buckets = new ArrayList<>(bucketCount);
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<>());
        }

        for (int i = 0; i < items.length; i++) {
            int bucketIndex = (items[i] - min) / bucketSize;
            buckets.get(bucketIndex).add(items[i]);
        }

        int[] sortedArray = new int[items.length];
        int currentIndex = 0;
        for (int i = 0; i < bucketCount; i++) {
            List<Integer> bucket = buckets.get(i);
            Collections.sort(bucket); // after division, elements can be sorted using any other sorting algorithm
            for (int j = 0; j < bucket.size(); j++) {
                sortedArray[currentIndex++] = bucket.get(j);
            }
        }

        return sortedArray;
    }

    public static void main(String[] args) {
        int[] example = {2, 5, 3, 1, 4, 6, 9, 8, 7, 10, 14, 12, 11, 13};
        String result = Arrays.toString(bucketSort(example, 4));
        System.out.println(result);
    }
}