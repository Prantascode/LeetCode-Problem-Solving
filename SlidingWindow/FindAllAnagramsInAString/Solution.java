package SlidingWindow.FindAllAnagramsInAString;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length()) {
            return res;
        }

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }

         for (int i = 0; i <= s.length() - p.length(); i++) {
            if (isEqual(pCount, sCount)) res.add(i);

            if (i + p.length() < s.length()) {
                sCount[s.charAt(i) - 'a']--;
                sCount[s.charAt(i+p.length()) - 'a']++;
            }
         }
        return res;
    }

    private static boolean isEqual(int[] arr1, int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p));
    }
}
