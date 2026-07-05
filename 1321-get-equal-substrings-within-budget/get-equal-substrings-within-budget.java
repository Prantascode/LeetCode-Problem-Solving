class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = t.length();
         int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }
        

        int left = 0; int right = 0;
        int maxLenth = 0;
        int sum = 0;
        while(right < n) {
            sum += arr[right];

            while (sum > maxCost) {
                sum -= arr[left];
                left++;  
            }

            maxLenth = Math.max(maxLenth,  right - left + 1);
            right++;
        }
        return maxLenth;
    }
}