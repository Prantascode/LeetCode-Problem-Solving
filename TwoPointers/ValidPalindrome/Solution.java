package TwoPointers.ValidPalindrome;

public class Solution {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = s.length() - 1;
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
        return true;
    }
    public static void main(String[] args) {
        //Solution sl = new Solution();
        String s =  "race a car";
        System.out.println(isPalindrome(s));
    }
}
