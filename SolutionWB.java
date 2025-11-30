import java.util.HashSet;
import java.util.Set;

public class SolutionWB {
    public boolean wordBreak(String s, Set<String> dict) {
        return wordBreakHelper(s, dict, 0);
    }

    public boolean wordBreakHelper(String s, Set<String> dict, int start) {
        if (start == s.length()) {
            return true;
        }

        for (String word : dict) {
            int len = word.length();
            int end = start + len;

            if (end > s.length())
                continue;

            if (s.substring(start, end).equals(word)) {
                if (wordBreakHelper(s, dict, end)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        SolutionWB sol = new SolutionWB();

        String s = "leetcode";
        Set<String> dict = new HashSet<>();
        dict.add("leet");
        dict.add("code");

        boolean result = sol.wordBreak(s, dict);
        System.out.println("Can the string be segmented? " + result);
    }
}
