package Prefix_Suffix.CountingWordsWithPrefix;

import java.util.Arrays;

public class Solution {
    public static int prefixCount(String[] words, String pref) {
        Arrays.sort(words);
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            int idx = 0;
            while (idx < pref.length() && idx < words[i].length()) {
                if (words[i].charAt(idx) == pref.charAt(idx)) {
                    idx++;                  
                }
                else{
                    break;
                }
            }
            if (idx == pref.length()) {
                count++;
            }
        }
        return count;
    } 
    public static void main(String[] args) {
        String words[] = {"pay","attention","practice","attend"};
        String pref = "at";
        System.out.println(prefixCount(words, pref));
    }
}
