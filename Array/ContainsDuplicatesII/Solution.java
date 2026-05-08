package Array.ContainsDuplicatesII;

import java.util.HashSet;

public class Solution {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        int i = 0;
        while (i < nums.length) {
            
            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);

            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
            i++;

        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;

        System.out.println(containsNearbyDuplicate(nums, k));
    }
}
