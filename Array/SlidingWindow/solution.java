package Array.SlidingWindow;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k <= 0) {
            return new int[0];
        }
        int[] result = new int[nums.length-k+1];
        int ri = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
           while (!q.isEmpty() && q.peek() < i - k+1) {
                q.poll();
           }
           while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
           }
           q.offer(i);
           if (i >= k - 1) {
                result[ri++] = nums[q.peek()];
           }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums,k)));
    }
}
