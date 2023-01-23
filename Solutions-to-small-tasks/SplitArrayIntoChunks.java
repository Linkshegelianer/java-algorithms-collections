/* The method splits one-dimensional array into several chunks, creating a two-dimensional array. 
 * The size of chunk is taken as an input. The remaining elements of the input array go in separate array. 
*/
import java.util.Arrays; // for using Arrays.deepToString()

public class SplitArrayIntoChunks {
	public static String[][] chunk(String[] input, int chunkSize) {
		int numberOfChunks = (int) Math.ceil((double) input.length / chunkSize); // array is divided into the number of chunks, Math.ceil() rounds it to the nearest int
		String[][] result = new String[numberOfChunks][]; // create new two-dimensional array. The first one has length of previously calculated number of chunks

		int start = 0;
		int end = chunkSize; 

		for (var i = 0; i < numberOfChunks; i++) { // iterate over the number of chunks
			if (end > input.length) {
				end = input.length;
			}
			result[i] = Arrays.copyOfRange(input, start, end); // copy elements to every chunk (array[] original, int from, int to)
			start += chunkSize; // move to creating a new chunk
			end += chunkSize;
		}
		return result;
	}

	public static void main(String[] args) {
		String[] example = {"1", "2", "3", "4", "5"};
		var example1 = chunk(example, 2);
		System.out.println(Arrays.deepToString(example1)); // must be [["1", "2"], ["3", "4"], ["5"]]
		}
	}

