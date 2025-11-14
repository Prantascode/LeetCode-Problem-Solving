package Array.ReverseTheArray;

import java.util.Arrays;

public class Solution {
    public static int[] reverse(int[] nums){
        int i = 0;
        int j = nums.length-1;
        int temp;
        while (i<j) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        int[] reverse = reverse(num);
        System.out.println(Arrays.toString(reverse));
    }
}
