// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/* 
Use 2 pointers , one at m and other at n. Use a pointer at m+n-1. Compare elements at
mth and nth index and whichever is high store at (m+n-1)th index. This way compare from back
and store in nums1. If pointer of nums2 is not <0 then add element of nums2 in nums1 in same order.
*/
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2=n-1;
        int idx=m+n-1;
        while(p1>=0 && p2>=0){
            if(nums1[p1]>nums2[p2]){
                nums1[idx--]=nums1[p1--];
            }else{
                nums1[idx--]=nums2[p2--];
            }
        }
        while(p2>=0){
            nums1[idx--]=nums2[p2--];
        }
    }
}
