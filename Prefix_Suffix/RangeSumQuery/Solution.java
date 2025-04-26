package Prefix_Suffix.RangeSumQuery;

class NumArray {
    int [] nums;
    public NumArray(int[] nums){
        this.nums = nums;
    }
    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <=  right; i++) {
            if (left <= right) {
                sum += nums[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray arr = new NumArray(nums);
        System.out.println(arr.sumRange(0,2));
        System.out.println(arr.sumRange(2,5));
        System.out.println(arr.sumRange(0,5));
    }
}
