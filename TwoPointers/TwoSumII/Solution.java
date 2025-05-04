package TwoPointers.TwoSumII;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            int end = numbers.length - 1;
            while (start < end) {
                int sum = numbers[start] + numbers[end];
                if (sum == target) {
                    return new int[]{start+1,end+1};
                }
                else if(sum > target){
                    end--;
                }else{
                    start++;
                }
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num = {0,0,3,4};
        int target = 0;
        int[] result = s.twoSum(num, target);
        System.out.print("[" + result[0] +","+ result[1]+"]");
    }
}
