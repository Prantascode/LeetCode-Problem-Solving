class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
         if (k == 0) {
            return 0;
        }
        int n = nums.length;
        int left = 0;
        int multiply = 1;
        int total = 0;
        for (int right = 0; right < n; right++) {
            multiply *= nums[right];
    
            while (multiply >= k) {
                multiply /= nums[left];
                left++;
            }
            if (multiply < k) {
                total += (right - left + 1);
            }
        }
        return total;
    }
}