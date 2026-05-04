package Array.TwoSum;

import java.util.Arrays;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {

        int [] sorted = nums.clone();
        Arrays.sort(sorted);
        int left = 0;
        int right = sorted.length - 1;


        while (left < right) {
            
            int sum = sorted[left] + sorted[right];

            if (sum == target) {  
                int i = -1;
                int j = -1;
                for (int k = 0; k < nums.length; k++) {
                    if (nums[k] == sorted[left] && i == -1) {
                        i = k;
                    }
                    else if (nums[k] == sorted[right] && j == -1) {
                        j = k;
                    }
                }
                return new int[]{i,j};
                
            }else if (sum > target) {
                right --;

            }else{
                left++;
            }

        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int [] nums = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
        
    }
}
