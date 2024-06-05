// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// start filling max number of two arrays from end of first array.
// take care of remaining elemnts from second array if elements are remaining.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums1.length ==0){
            return;
        }
        int p1 = m-1;
        int p2 = n-1;
        int p3 = m+n-1;
        while(p1>=0 && p2>=0){
            nums1[p3] = Math.max(nums1[p1], nums2[p2]);
            p3--;
            if(nums1[p1] > nums2[p2]){
                p1--;
            }
            else{
                p2--;
            }
        }
        while(p2>=0){ // no need to check p1 since that condition won't happen, p1 will always be zero here
            nums1[p3] = nums2[p2];
            p2--;
            p3--;
        }
        
    }
}