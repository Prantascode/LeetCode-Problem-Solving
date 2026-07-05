class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int cost = Math.abs(s.charAt(i) - t.charAt(i));
            arr[i] = cost;
        }
        

        int left = 0;
        int length = 0;
        int maxLenth = 0;
        int sum = 0;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            
            while (sum > maxCost) {
                sum -= arr[left];
                left++;  
            }

            length = right - left + 1;

            maxLenth = Math.max(maxLenth, length);
        }
        return maxLenth;
    }
}