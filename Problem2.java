
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Ye, 0ms
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

// Basically traversing backwards and on the basis of comparison, appending the elements from either array at the end of nums1 array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = m-1;
        int j = n-1;
        
        while(j >= 0){
            
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[i+j+1] = nums1[i];
                i--;
            }
            else{
                nums1[i+j+1] = nums2[j];
                j--;
            }
            
        }
    }
}