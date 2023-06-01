/*
Bubble sort is the simplest sorting algorithm which swaps the adjacent elements if they are in the wrong order,
so elements 'bubble' their way to their correct position in the list.
Best Time Complexity: O(n)
Average Time Complexity: O(n^2)
Worst Time Complexity: O(n^2)
Space Complexity: O(1)
 */

import java.util.Arrays;

public class BubbleSort {
	public static int[] bubbleSort(int[] items) {
		int n = items.length - 1; // for each iteration, at least one element falls into place, the total number <= n-1
		boolean swapped; // initialized to 'false' as a default value
		do { // the loop will continue as long as swapped is true
			swapped = false;
			for (int i = 0; i < n; i++) {
				// if the current element is larger than the next element, they are swapped through temp variable
				if (items[i] > items[i + 1]) {
					int temp = items[i];
					items[i] = items[i + 1];
					items[i + 1] = temp;
					swapped = true;
				}
			}
			n--;
		} while (swapped);
		return items;
	}

	public static void main(String[] args) {
		int[] example = {2, 5, 3, 1, 4};
		System.out.println(Arrays.toString(bubbleSort(example)));
	}
}
