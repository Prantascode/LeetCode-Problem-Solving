package Array.IntersectionOfTwoArrayII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length;
        int m = nums2.length;

        List<Integer> list = new ArrayList<>();

        int i = 0; int j = 0;
        while (i<n && j<m) {
            int a = nums1[i]; 
            int b = nums2[j];
            if (a == b) {
                list.add(a);
                i++;
                j++;
            }else if (a < b) {
                i++;
            }else{
                j++;
            }
        }
        int[] res = new int[list.size()];
        for (int k = 0; k < res.length; k++) {
            res[k] = list.get(k);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] result = intersect(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
