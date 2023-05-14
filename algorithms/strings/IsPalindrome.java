public class IsPalindrome {

    public static boolean isPalRecursive(String str) {
        if (str.length() == 0 || str.length() == 1) { // base
            return true;
        }

        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalRecursive(str.substring(1, str.length() - 1));
        }
        return false;
    }

    public static boolean isPalIterative(String str) {
        int a = 0;
        int b = str.length() - 1;

        while (b > a) {
            if (str.charAt(a) != str.charAt(b)) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }

    public static void main(String[] args) {
        String exampleTrue = "radar";
        String exampleFalse = "word";
        System.out.println(isPalRecursive(exampleTrue));
        System.out.println(isPalRecursive(exampleFalse));
        System.out.println(isPalIterative(exampleTrue));
        System.out.println(isPalIterative(exampleFalse));
    }
}