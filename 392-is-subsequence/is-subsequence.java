class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int n = s.length();
        int m = t.length();
        int left = 0;
        int right = 0;
        while (left < n && right < m) {
            if (s.charAt(left) == t.charAt(right)) {
                left++;
                right++;
            }else{
                right++;
            }
        }
        if (s.isEmpty()) {
            return true;
        }
        if (left == n) {
            return true;
        }
        return false;
    }
}