package Array.FindContentChildren;


import java.util.Arrays;

public class Solution {
    public static int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);
        int m = g.length;
        if (m == 0) {
            return 0;
        }
        int count = 0;

        int i = m-1;
        int j = s.length - 1;
        while ( i >= 0 && j >= 0) {
            if (s[j] >= g[i]) {
                count++;
                i--;
                j--;
            }else{
                i--;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int[] g = {1,2};
        int[] s = {1,2,3};

        System.out.println(findContentChildren(g, s));
    }
}
