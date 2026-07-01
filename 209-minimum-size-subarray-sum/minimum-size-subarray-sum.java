class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int length = 0;
        int minLength = nums.length;
        int sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                length = right - left + 1;
                minLength = Math.min(minLength, length);
                sum = sum - nums[left];
                left++;
                
            }
            if ((right - left +1) == nums.length && sum < target) {
               minLength = 0;
            }
            
        }
        
        return minLength;
    }
}