/* This problem is callsed "Remove Duplicates from Sotred Array", but in reality it requires counting
unique elements int array without providing new version without duplicates.
 */

public class RemoveDuplicates<T extends Comparable<T>> {

    public int removeDuplicates(T[] items) {
        int counter = 0;
        for (int i = 1; i < items.length; i++) {
            if (items[counter].compareTo(items[i]) != 0) {
                counter++;
                items[counter] = items[i];
            }
        }
        return counter+1;
    }

    public static void main(String[] args) {
        RemoveDuplicates<Integer> removeDuplicatesInt = new RemoveDuplicates<>();
        Integer[] exampleInt = {1, 1, 2, 3, 4, 5, 5, 5, 6}; // 6 unique numbers
        System.out.println(removeDuplicatesInt.removeDuplicates(exampleInt));

        RemoveDuplicates<String> removeDuplicatesStr = new RemoveDuplicates<>();
        String[] exampleStr = {"meow", "meow", "bark", "bark"}; // 2 unique strings
        System.out.println(removeDuplicatesStr.removeDuplicates(exampleStr));
    }
}
