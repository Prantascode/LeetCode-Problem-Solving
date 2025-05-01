package TwoPointers.ReverseStringII;

public class Solution {
    public static String reverseStr(String s, int k) {
        char[] Char = s.toCharArray();
        for (int i = 0; i < s.length(); i += 2*k) {
            int start = i;
            int end = Math.min(i+k-1, s.length()-1);
            while (start < end) {
                char temp = Char[start];
                Char[start] = Char[end];
                start++;
                Char[end] = temp;
                end--;
            }
        }
        return new String(Char);
    }
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
    }
}
