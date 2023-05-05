public class ReverseString {
    public static String reverseString(String str) {
        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) { // start iteration from the end of the string
            result = result + array[i];
        }
        return result;
    }

    public static void main(String[] args) {
        String example1 = "12345";
        String palindrome = "we panic in a pew";
        System.out.println(reverseString(example1)); // must be 54321
        System.out.println(reverseString(palindrome)); // must be wep a ni cinap ew
    }
}
