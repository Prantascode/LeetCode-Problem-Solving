package Prefix_Suffix.LongestCommonprefix;

import java.util.Arrays;

public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while (idx < s1.length() && idx < s2.length()) {
            if (s1.charAt(idx) == s2.charAt(idx)) {
                idx++;
            }else{
                break;
            }
        }
        return s1.substring(0,idx);
    }
    public static void main(String[] args) {
        //Solution s = new Solution();
        String strs[] = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
