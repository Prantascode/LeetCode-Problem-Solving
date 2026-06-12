package String.ReverseWordsInAString;


public class Solution {
    public static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;

        reverse(chars, 0, n-1);

        int write = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                if (write > 0) {
                    chars[write++] = ' ';
                }
                int wordStart = write;
                while (i < n && chars[i] != ' ') {
                    chars[write] = chars[i];
                    write++;
                    i++;
                }
                reverse(chars, wordStart, write - 1);
            }
        }
        return new String(chars,0,write);
    }

    private static void reverse(char[] c,int l, int r){
        while (l < r) {
            char temp = c[l];
            c[l] = c[r];
            c[r] = temp;
            l++;
            r--;
        }
       
    }

    public static void main(String[] args) {
        String s = "The Sky is blue";
        System.out.println(reverseWords(s));
    }
}
