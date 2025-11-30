public class LongestPalindromeDP {

    public static String longestPalindromeDP(String s, boolean debug) {
        if (s == null) return null;
        int n = s.length();
        if (n <= 1) return s;

        boolean[][] table = new boolean[n][n];
        int maxLen = 1;         
        int start = 0;           
       
        for (int L = 1; L <= n; L++) {
            for (int i = 0; i + L - 1 < n; i++) {
                int j = i + L - 1;

                if (L == 1) {

                    table[i][j] = true;
                } else if (L == 2) {
                    
                    table[i][j] = (s.charAt(i) == s.charAt(j));
                } else {
                   
                    table[i][j] = (s.charAt(i) == s.charAt(j)) && table[i + 1][j - 1];
                }


                if (table[i][j] && L > maxLen) {
                    maxLen = L;
                    start = i;
                }
            }

            if (debug) {
                System.out.println("After length L = " + L + ":");
                printTable(table);
            }
        }

        return s.substring(start, start + maxLen);
    }


    public static void printTable(boolean[][] x) {
        for (boolean[] row : x) {
            for (boolean v : row) {
                System.out.print(v ? "1 " : "0 ");
            }
            System.out.println();
        }
       
    }


    public static void main(String[] args) {
        String s = "dabcba";
        String res = longestPalindromeDP(s, true);  

        System.out.println("Longest palindrome: " + res);
    }
}
