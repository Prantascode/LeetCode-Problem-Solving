package Array.LongestHarmoniousSubsequence;

import java.util.Arrays;

public class Solution {
    public static int findLHS(int[] nums) {
        
        Arrays.sort(nums);

        int length = 0;

        int right = 0;

        for (int left = 0; left < nums.length; left++) {
            while (nums[left] - nums[right] > 1) {
                    right++;
            }
            if (nums[left] - nums[right] == 1) {
                    length = Math.max(length, left - right + 1);
            }        
        }
        return length;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,2,2,5,2,3,7};

        System.out.println(findLHS(nums));
    }
}
