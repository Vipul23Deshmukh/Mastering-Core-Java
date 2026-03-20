public class Palindrome_String {

    /**
     * Checks if a string is a palindrome using the two-pointer approach.
     * Ignores non-alphanumeric characters and is case-insensitive.
     *
     * @param s The input string.
     * @return true if the string is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(String s) {
        // Convert to lowercase to handle case-insensitivity, then to a char array
        char[] arr = s.toLowerCase().toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Skip non-alphanumeric characters from the left
            if (!Character.isLetterOrDigit(arr[left])) {
                left++;
                continue;
            }
            // Skip non-alphanumeric characters from the right
            if (!Character.isLetterOrDigit(arr[right])) {
                right--;
                continue;
            }

            // Compare characters; if they don't match, it's not a palindrome
            if (arr[left] != arr[right]) {
                return false;
            }

            // Move pointers inward
            left++;
            right--;
        }

        // If the loop completes, the string is a palindrome
        return true;
    }

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";

        System.out.println(s1 + " is a palindrome: " + isPalindrome(s1));
        System.out.println(s2 + " is a palindrome: " + isPalindrome(s2));
    }
}
