package SlidingWindow.NumberOfVowelsInASubstringOfGivenLength;

public class Solution {
    public static int maxVowels(String s, int k) {

        s = s.toLowerCase();

        int vowelsCount = 0;
        int maxVowel = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                vowelsCount++;
            }
        }
        maxVowel = vowelsCount;

        for (int right = k; right < s.length(); right++) {
            if (isVowel(s.charAt(right - k))) {
                vowelsCount--;
            }
            if (isVowel(s.charAt(right))) {
                vowelsCount++;
            }

            maxVowel = Math.max(maxVowel, vowelsCount);
        }
        return maxVowel;
    }

    public static boolean isVowel(char ch){
        if (ch == 'a' || ch =='e' || ch =='i' || ch =='o' || ch =='u') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "AeIoU";
        int k = 2;
        System.out.println(maxVowels(s, k));
    }
}
