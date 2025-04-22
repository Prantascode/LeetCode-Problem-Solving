package Stack.NextGreaterElement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Solution {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums2) {
            while (!st.empty() && st.peek() < num) {
                map.put(st.pop(), num);
            }
        st.push(num);
        } 
        while (!st.empty()) {
            map.put(st.pop(), -1);
        }
        int[] ans = new int[nums1.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums1 = {4,1,3};
        int[] nums2 = {1,3,4,3};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }
}
