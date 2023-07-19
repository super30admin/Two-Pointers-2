// Time Complexity : O(m+n), where m is the length of nums1 and n is the length of nums2
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/**
 * We start from the end of the array and keep two pointers, one for each array.
 * We compare the values at the pointers and place the larger value at the end of the first array.
 * We keep doing this until we reach the end of the second array or the first array.
 */


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m+n-1, p1 = m-1, p2 = n-1;

        while(p>=0){
            if(p2<0){
                break;
            }

            if(p1>=0 && nums1[p1] > nums2[p2]){
                nums1[p] = nums1[p1];
                p1--;
            }else{
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
    }
}