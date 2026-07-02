class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
         int count = 0;
        
        for (int left = 0; left < nums.length; left++) {
            int right = left;
            int sum = 0;
            while (right < nums.length) {
                sum += nums[right];
                if (sum == goal) {
                    count++;
                }
                right++;
            }
            

        }
        return count;
    }
}