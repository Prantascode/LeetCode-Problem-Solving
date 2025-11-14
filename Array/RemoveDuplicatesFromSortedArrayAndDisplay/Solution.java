package Array.RemoveDuplicatesFromSortedArrayAndDisplay;

import java.util.Arrays;

public class Solution {
    public static int removeDuplicates(int[] nums){

        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }
    public static void main(String[] args) {
        int[] num = {1,1,2,2,3};

        int length = removeDuplicates(num);
        int[] validArray = Arrays.copyOfRange(num, 0, length);
        System.out.println(Arrays.toString(validArray));
    }
}
