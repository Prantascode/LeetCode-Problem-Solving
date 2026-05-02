package Array.SearchInsertPosition;

public class Solution {
    public static int searchInsert(int[] nums, int target){

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int target = 2;
        System.out.println(searchInsert(nums,target));
    }
}
