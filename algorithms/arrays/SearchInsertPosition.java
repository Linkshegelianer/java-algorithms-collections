public class SearchInsertPosition {

    public static int searchIndex(int[] items, int target) {
        int start = 0;
        int finish = items.length - 1; // to fix the ArrayIndexOutOfBoundsException

        while (start <= finish) {
            int mid = start + (finish - start) / 2;
            if (items[mid] == target) return mid;
            else if (items[mid] > target) finish = mid - 1;
            else start = mid + 1;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] example1 = {1, 2, 3, 4};
        int[] example2 = {2, 3, 5, 6, 7};
        int[] example3 = {1, 2, 3};
        int target = 4;
        System.out.println(searchIndex(example1, target));
        System.out.println(searchIndex(example2, target));
        System.out.println(searchIndex(example3, target));
    }
}