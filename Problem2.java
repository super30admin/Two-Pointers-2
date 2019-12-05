
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         if(n>0) {
        int i = m + n - 1;
        
        int j = n - 1;
        int k= m-1;
        
        while(i>=0 && j>=0 && k>=0){
            
            if(nums2[j] >= nums1[k]){
                nums1[i--]= nums2[j--];
            }
            else
                nums1[i--]= nums1[k--];
        }
        
        while(j>=0){
            nums1[i--]= nums2[j--];
        }
    }
    }
}
