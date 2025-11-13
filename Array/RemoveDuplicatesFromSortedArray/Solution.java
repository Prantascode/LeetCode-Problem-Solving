package Array.RemoveDuplicatesFromSortedArray;

public class Solution {
    public static int removeDuplicates(int[] nums){

        int j = 1;
        for (int i = 1; i < nums.length; i++) { // Time Complexity: O(n)
            if (nums[i] != nums[i-1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return nums[j];
    }
    public static void main(String[] args) {
        int[] num = {1,1,2};
        System.out.println(removeDuplicates(num));
        
    }
}
