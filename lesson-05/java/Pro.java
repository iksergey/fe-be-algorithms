public class Pro {

    public static boolean isAlphabetic(char ch) {
        int code = (int) ch;
        return (code >= 65 && code <= 90) || (code >= 97 && code <= 122);
    }

    public static boolean isPalindrome(String string) {
        int left = 0;
        int right = string.length() - 1;

        while (left < right) {

            while (!Character.isAlphabetic(string.charAt(left))) {
                left++;
            }
            while (!Character.isAlphabetic(string.charAt(right))) {
                right--;
            }
            System.out.println(string.charAt(left) + " <<< " + left);
            System.out.println(string.charAt(right) + " <<< " + right);
            if (string.charAt(left) != string.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String testString = "a man, a plan, a canal, panama!";
        System.out.println(isPalindrome(testString));
    }
}
