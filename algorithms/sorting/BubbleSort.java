/*
Bubble sort is the simplest sorting algorithm which swaps the adjacent elements if they are in the wrong order, so elements 'bubble' their way to their correct position in the list.
Best Time Complexity: O(n)
Average Time Complexity: O(n^2)
Worst Time Complexity: O(n^2)
Space Complexity: O(1)
 */

import java.util.Arrays;

public class BubbleSort {
	public static int[] bubbleSort(int[] items) {
		var n = items.length - 1; // for each iteration, at least one element falls into place, so the total number <= n-1
		boolean swapped; // initialized to 'false' as a default value
		do { // the loop will continue as long as swapped is true
			swapped = false;
			for (var i = 0; i < n; i++) { 
				if (items[i] > items[i + 1]) { // if the current element is larger than the next element, they are swapped through temp variable
					var temp = items[i];
					items[i] = items[i + 1];
					items[i + 1] = temp;
					swapped = true;
				}
			}
			n--; // the last element in the array is guaranteed to be the largest after each iteration, so it doesn't need to be compared again
		} while (swapped);
		return items;
	}

	public static void main(String[] args) {
		int[] example = {2, 5, 3, 1, 4};
		System.out.println(Arrays.toString(bubbleSort(example)));
	}
}
