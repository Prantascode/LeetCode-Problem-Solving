package Array.TwoSumII;

import java.util.Arrays;

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;
        int sum = 0;

        while (left < right) {
            sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left+1,right+1};
            }else if (sum > target) {
                right--;
            }else{
                left++;
            }
        }

        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = {2,3,4};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
