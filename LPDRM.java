public class LPDRM {

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String longestPalindromeWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longest = "";

        for (String word : words) {
            String clean = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (isPalindrome(clean)) {
                if (clean.length() > longest.length()) {
                    longest = clean;
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        String sentence = "builds this code check the sentence longest palindrome word level civic madam";
        String result = longestPalindromeWord(sentence);

        System.out.println("Longest palindrome word: " + result);
    }
}
