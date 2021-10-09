
// Time Complexity : O(n+m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes 
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums2 == null || n == 0){
            return;
        }
        
        int i = m-1;
        int j = n-1;
        int k = m + n -1;
        
        while(i >=0 && j >= 0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--;
            } else{
                nums1[k]= nums2[j];
                j--;
                k--;
            }
        }
        
        while( j >=0){
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }
}

// TC: O(n+m)
// SC: O(1)
