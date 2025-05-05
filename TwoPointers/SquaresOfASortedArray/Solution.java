package TwoPointers.SquaresOfASortedArray;

import java.util.Arrays;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int pos = nums.length - 1;
        while (left <= right) {
            int leftSQ = nums[left] * nums[left];
            int rightSQ = nums[right] * nums[right];
            if (leftSQ > rightSQ) {
                res[pos] = leftSQ;
                left++;
            }else{
                res[pos] = rightSQ;
                right--;
            }
            pos--;
        }
        return res;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {-4,-1,0,3,10};
        int[] result = s.sortedSquares(nums);
        System.out.println(Arrays.toString(result));
    }
}
