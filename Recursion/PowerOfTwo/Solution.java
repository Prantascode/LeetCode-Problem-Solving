package Recursion.PowerOfTwo;

public class Solution {
    public boolean isPowerOfTwo(int n) {
    //    for (int i = 0; i < n; i++) {
    //         int ans = (int)Math.pow(2, i);
    //         if (ans == n) {
    //             return true;
    //         }
    //    }
    //    return false;
        if (n > 0 && (n&(n-1)) == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Solution num = new Solution();
        System.out.println(num.isPowerOfTwo(16));
    }
}
