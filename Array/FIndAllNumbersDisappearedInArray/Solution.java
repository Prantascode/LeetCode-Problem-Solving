package Array.FIndAllNumbersDisappearedInArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
      public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> numset = new HashSet<Integer>();
        for (int num : nums) {
            numset.add(num);
        }

        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i <= nums.length; i++) {
            if (!numset.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num = {1,2,2,3,3,4,6,8};
        System.out.println(findDisappearedNumbers(num));
    }
}
