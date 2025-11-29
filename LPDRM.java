public class LPDRM {

    public String longestPalindromeString(String s) {
        int[] count = new int[128];

        for (char ch : s.toCharArray())
            count[ch]++;

        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        String middle = "";

        for (int i = 0; i < 128; i++) {
            int val = count[i];

            for (int j = 0; j < val / 2; j++) {
                left.append((char) i);
                right.insert(0, (char) i);
            }

            if (val % 2 == 1 && middle.isEmpty()) {
                middle = String.valueOf((char) i);
            }
        }

        return left.toString() + middle + right.toString();
    }

    public static void main(String[] args) {
        LPDRM obj = new LPDRM();

        String test = "abccccdd";
        String result = obj.longestPalindromeString(test);

        System.out.println("Longest palindrome: " + result);
    }
}
