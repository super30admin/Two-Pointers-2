
// Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        while(m>0 && n>0){
            if(nums1[m-1]<nums2[n-1]){
                nums1[m+n-1]=nums2[n-1];
                n--;
            }
            else{
                nums1[m+n-1]=nums1[m-1];
                m--;
            }
        }
        
        while(n>0){
            nums1[m+n-1]=nums2[n-1];
            n--;
        }
    }
}