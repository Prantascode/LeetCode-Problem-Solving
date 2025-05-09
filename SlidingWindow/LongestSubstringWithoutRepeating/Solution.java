package SlidingWindow.LongestSubstringWithoutRepeating;

import java.util.HashSet;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxlenth = 0;
        HashSet<Character> charSet = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            maxlenth = Math.max(maxlenth, right - left + 1);
        }
        return maxlenth; 
    }
    public static void main(String[] args) {
        Solution sl = new Solution();
        String s = "abcabcbb";
        int res = sl.lengthOfLongestSubstring(s);
        System.out.print(res);
    }
}
