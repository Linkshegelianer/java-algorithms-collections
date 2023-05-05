public class BinarySearch {
    public static int binarySearch(int[] numbers, int index) {
        int low = numbers[0];
        int high = numbers.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = numbers[mid];

            if (guess == index) {
                return mid;
            }

            if (guess > index) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] myList = new int[] {1, 2, 3, 4, 5, 6};
        System.out.println(binarySearch(myList, 4)); // must be 3
    }
}