package algorithms.searches;

public class BinarySearch {

    public static <T extends Comparable<T>> int search(T[] array, T key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            T guess = array[mid];

            while (low <= high) {
                int mid = (low + high) / 2;
                int guess = array[mid];

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
    }

    public static <T extends Comparable<T>> int search(T[] array, T key, int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2;
            T guess = array[mid];

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
    public static void main(String[] args) {
        int[] myList = new Integer[] {1, 2, 3, 4, 5, 6};
        System.out.println(search(myList, 4)); // must be 3
    }
}