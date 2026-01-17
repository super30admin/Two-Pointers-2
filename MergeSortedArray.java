// https://leetcode.com/problems/merge-sorted-array/description
// Time complexity : O(m+n) where m is number of elements in num1 and n is number of elements in num2
// Space complexity : O(1)
// Did this code successfully run on Leetcode : yes
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i>=0 && j>=0){
            int val1 = nums1[i];
            int val2 = nums2[j];
            if(val1>val2){
                nums1[k] = val1;
                i--;
                k--;
            }else{
                nums1[k] = val2;
                j--;
                k--;
            }
        }
        while(j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}