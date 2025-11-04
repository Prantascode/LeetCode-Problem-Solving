package Array.TwoPointer;

import java.util.Arrays;

class Solution {
    // Brute-force approach  complexity = n^2

    /* public int[] twoSum(int[] nums,int target){
        int n = nums.length;
        for(int i = 0;i < n-1;i++){
            for(int j = i+1;j < n;j++){
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{}; */

        //Two Pointer Approach Complexity = nlogn + n

    public int[] twoSum(int[] nums,int target){
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int left = 0; int right = sorted.length - 1;

        while (left < right) {
            int sum = sorted[left] + sorted[right];
            if (sum == target) {
                int i = -1; int j = -1;
                for(int k = 0;k < nums.length;k++){
                    if (nums[k] == sorted[left] && i == -1) {
                        i = k;
                    }
                    else if (nums[k] == sorted[right] && j == -1) {
                        j = k;
                    }
                }
                return new int[]{i,j};
            }
            else if (sum < target) {
                left++;
            }
            else{
                right--;
            }
        }

        return new int[]{};
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num = {2,7,11,15};
        int target = 9;
        int[] result = s.twoSum(num, target);
        System.out.println(Arrays.toString(result));
    }
}
