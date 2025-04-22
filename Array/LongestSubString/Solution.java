package Array.LongestSubString;

import java.util.HashSet;

class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLenght = 0;
        HashSet<Character> charSet = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            maxLenght = Math.max(maxLenght, right - left+1);
        }
        return maxLenght;
    }
    public static void main(String[] args) {
        String s = "abdeabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
