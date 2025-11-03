package Array.TwoPointer;

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums,int target){
        int n = nums.length;
        for(int i = 0;i < n-1;i++){
            for(int j = i+1;j < n;j++){
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
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
