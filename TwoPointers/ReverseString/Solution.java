package TwoPointers.ReverseString;

public class Solution {
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            start++;
            s[end] = temp;
            end--;
            }
        }              
    public static void main(String[] args) {
        char[] s ={'h','e','l','l','o'};
        reverseString(s);
        System.out.println(new String(s));
    }
}
