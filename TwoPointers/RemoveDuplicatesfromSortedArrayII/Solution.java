package TwoPointers.RemoveDuplicatesfromSortedArrayII;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        int j = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[j-2]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int length = removeDuplicates(nums);
        for (int i = 0; i <length; i++) {
            System.out.print(nums[i]+" ");
        }       
    }
}
