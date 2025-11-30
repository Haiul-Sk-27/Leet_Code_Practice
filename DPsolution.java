import java.util.*;

public class DPsolution {

    public static boolean wordBreak(String s, Set<String> dict) {

        boolean[] t = new boolean[s.length() + 1];


        t[0] = true;

        for (int i = 0; i < s.length(); i++) {

            if (!t[i])
                continue;

            for (String word : dict) {

                int len = word.length();
                int end = i + len;

                if (end > s.length())
                    continue;


                if (t[end])
                    continue;

                if (s.substring(i, end).equals(word)) {
                    t[end] = true;
                }
            }
        }

        return t[s.length()];
    }


    public static void main(String[] args) {

        String s = "programcreek";
        Set<String> dict = new HashSet<>(Arrays.asList(
                "program", "creek", "programcree"
        ));

        boolean result = wordBreak(s, dict);

        System.out.println("Can the string be segmented? " + result);
    }
}
