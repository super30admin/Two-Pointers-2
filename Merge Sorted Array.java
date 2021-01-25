
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//use two pointers i=m-1, j=n-1 each pointing at the max element in the array
//use pointer k=m+n-1, pointing at the last position to keep filling the largest element
//fill array till k==0

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1==null || nums2==null || nums1.length==0 || nums2.length==0)
            return;
        
        int i = m-1, j = n-1, k=m+n-1;
        
        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }
        
        while(j>=0){
            nums1[k--] = nums2[j--];
        }
    }
}