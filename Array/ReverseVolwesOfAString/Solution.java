package Array.ReverseVolwesOfAString;


public class Solution {
    private static boolean isVowel(char ch) {
        char lower = Character.toLowerCase(ch);
        return "aeiou".indexOf(lower) != -1;
    }
    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int right = s.length()-1;
        int left = 0;
            while (left < right) {

            while (left < right && !isVowel(arr[left])) left++;
            while (left < right && !isVowel(arr[right])) right--;

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
            }

        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "leetcode";
        
        System.out.println(reverseVowels(s));
    }
}
