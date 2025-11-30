import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexWordBreak {
    public static boolean wordBreakRegex(String s,Set<String> dict){
        if(dict.isEmpty()) return s.isEmpty();

        StringBuilder sb = new StringBuilder();
        for(String word : dict){
            sb.append(Pattern.quote(word)).append("|");
        }

        String pattern = sb.substring(0,sb.length()-1);

        pattern = "("+pattern+")*";

        Pattern p = Pattern.compile(pattern);

        Matcher m = p.matcher(s);

        return m.matches();
    }

    public static void main(String[] args){
        Set<String> dict = new HashSet<>();
        dict.add("go");
        dict.add("goal");
        dict.add("goals");
        dict.add("special");

        String[] tests = { "goalspecial", "gogoals", "goalsspecial", "gospecials", "goalspecialspecial" };


        for(String test : tests){
            boolean result = wordBreakRegex(test, dict);
            System.out.println();
            System.out.println(test + " -> " + (result ? "match" : "no match"));
        }
    }
}
