package Array.FindtheIndexoftheFirstOccurrenceinaString;


public class Solution {
     public static int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        for (int i = 0; i < m-n; i++) {
            int j = 0;
            while (j < n && haystack.charAt(i+j) == needle.charAt(j)) {
                j++;

            }
            if (j == n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "leetcode";
        String nee = "leeto";

        System.out.println(strStr(str, nee));
    }
}
