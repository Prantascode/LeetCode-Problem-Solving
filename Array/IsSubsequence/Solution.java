package Array.IsSubsequence;

public class Solution {
    public static boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();

        int i = 0;
        int j = 0;

        while (i<m && j<n) {
            char a = s.charAt(i);
            char b = t.charAt(j);
            if (a == b) {
                i++;
                j++;
            }else{
                j++;
            }
        }
        if (s.isEmpty()) {
            return true;
        }
       if (i == m) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "b";
        String t = "ahbgde";

        System.out.println(isSubsequence(s, t));
    }
}
