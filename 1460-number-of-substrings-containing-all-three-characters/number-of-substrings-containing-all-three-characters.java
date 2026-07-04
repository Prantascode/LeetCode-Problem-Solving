class Solution {
    public int numberOfSubstrings(String s) {
        int left = 0;
        int length = s.length();
        int total = 0;

        int[] freq = new int[3];

        for (int right = 0;right < length;right++) {

            freq[s.charAt(right) - 'a']++;

            while (matchChar(freq)) {
                
                total += length - right;

                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return total;
    }

    public static boolean matchChar(int[] freq){
        return freq[0] > 0 && freq[1] > 0 && freq[2] > 0;
    }
}