package Array.WordPatten;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static boolean wordPattern(String pattern,  String s) {
            
            String[] ss = s.split(" ");
            HashMap<Character, String> charToString = new HashMap<>();
            HashSet<String> string = new HashSet<>();

            if (pattern.length() != ss.length) {
                return false;
            }
    
            for (int i = 0; i < ss.length; i++) {
                charToString.put(pattern.charAt(i), ss[i]);
                string.add(ss[i]);
            }
    
            if (charToString.size() != string.size()) {
                return false; 
            }

            for (int i = 0; i < ss.length; i++) {
                char ch = pattern.charAt(i);
                String word = ss[i];

                    if (!charToString.get(ch).equals(word)) {
                        return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        String patten = "abab";
        String s = "dog cat dog";
        System.out.println(wordPattern(patten, s));
    }
}
