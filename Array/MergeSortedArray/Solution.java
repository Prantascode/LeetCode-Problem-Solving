package Array.MergeSortedArray;


public class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0;
        int j = 0;
        int k = 0;
        int[] temp = new int[m+n];
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                temp[k] = nums1[i];
                k++;
                i++;
                
            }else{
                temp[k] = nums2[j];
                k++;
                j++;
            }
        }
        while (i < m) {
            temp[k] = nums1[i];
            k++;
            i++;
           
        }while (j < n) {
            temp[k] = nums2[j];
            k++;
            j++;
        }

        for (int l = 0; l < m+n; l++) {
            nums1[l] = temp[l];
        }
     }

     public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);

        for (int num : nums1) {
            System.out.print(num + " ");
        }
        
     }
}
