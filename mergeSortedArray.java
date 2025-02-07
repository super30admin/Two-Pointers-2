// Problem2 (https://leetcode.com/problems/merge-sorted-array/)

// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach in three sentences only
/*
 * Here three pointer approach is used. One pointer at the end of 1st arrays elements, second is at end of second array and third idx is at 
 * end of 1st array. Compare 1st and 2nd indices, greater element among the two is kept at idx place of array 1. decrease idx and decrease the
 * greater elements pointer. If array1 is emptied first just copy the remaining elements as is in 1st array. Finally return 1st array.
 */

class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int idx = m+n-1;
        while(p1>=0 && p2>=0){
            if(nums1[p1]>nums2[p2]){
                nums1[idx] = nums1[p1];
                p1--;
                
            }
            else{
                nums1[idx] = nums2[p2];
                p2--;
            }
            idx--;
        }
        while(p2>=0){
            if(p1<0){
                nums1[idx] = nums2[p2];
                p2--;
                idx--;
            }
        }
        return nums1;
    }
}
