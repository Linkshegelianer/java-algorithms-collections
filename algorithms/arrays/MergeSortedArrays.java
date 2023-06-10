import java.util.Arrays;

public class MergeSortedArrays<T extends Comparable<T>> {

    private T[] items1;
    private T[] items2;
    private int n;
    private int m;

    public MergeSortedArrays(T[] items1, int n, T[] items2, int m) {
        this.items1 = items1;
        this.items2 = items2;
        this.n = n;
        this.m = m;
    }

    public void merge() {
        int last = m + n - 1;

        while (m > 0 && n > 0) {
            if (items1[n - 1].compareTo(items2[m - 1]) > 0) {
                items1[last] = items1[n - 1];
                n--;
            } else {
                items1[last] = items2[m - 1];
                m--;
            }
            last--;
        }

        while (m > 0) {
            items1[last] = items2[m - 1];
            m--;
            last--;
        }
    }

    public static void main(String[] args) {
        Integer[] nums1 = {1, 2, 3, 0, 0, 0};
        Integer[] nums2 = {2, 5, 6};

        MergeSortedArrays<Integer> mergerInt = new MergeSortedArrays<>(nums1, 3, nums2, 3);
        mergerInt.merge();
        String result1 = Arrays.toString(nums1); // [1, 2, 2, 3, 5, 6]

        String[] strings1 = {"A", "B", "C", "", "", ""};
        String[] strings2 = {"B", "E", "F"};

        MergeSortedArrays<String> mergerStr = new MergeSortedArrays<>(strings1, 3, strings2, 3);
        mergerStr.merge();
        String result2 = Arrays.toString(strings1); // [A, B, B, C, E, F]

        System.out.println(result1);
        System.out.println(result2);
    }
}