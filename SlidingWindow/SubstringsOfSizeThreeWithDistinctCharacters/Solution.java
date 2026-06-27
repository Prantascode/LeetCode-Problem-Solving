package SlidingWindow.SubstringsOfSizeThreeWithDistinctCharacters;

//import java.util.HashMap;

public class Solution {
    public static int countGoodSubstrings(String s) {

        // Sliding window approach

        /*if (s.length() < 3) {
            return 0;
        }

        HashMap<Character ,Integer> freq = new HashMap<>();

        int goodSubString = 0;

        for (int i = 0; i < 3; i++) {
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
        }

        if (freq.size() == 3) {
            goodSubString++;
        }
        for (int right = 3; right < s.length(); right++) {
            int left = right - 3;

            char leftChar = s.charAt(left);
            freq.put(leftChar, freq.get(leftChar) - 1);

            if (freq.get(leftChar) == 0) {
                freq.remove(leftChar);
            }
           
            char rightChar = s.charAt(right);
            freq.put(rightChar,freq.getOrDefault(rightChar, 0) + 1);

            if (freq.size() == 3) {
                goodSubString++;
            }
        }

        return goodSubString;*/

        // Brute force approach
        if (s.length() < 3) {
            return 0;
        }

        char[] ch = s.toCharArray();
        int count = 0;

        for (int i = 2; i < s.length(); i++) {
            if (ch[i-1]!= ch[i] && ch[i-1] != ch[i-2] && ch[i-2] != ch[i]) {
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {
        String s = "aababcabc";

        System.out.println(countGoodSubstrings(s));
    }
}
