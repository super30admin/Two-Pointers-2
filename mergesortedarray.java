/ Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english
//start k at the end of 1st array. i at the m-1 oindex and j at n-1 index.
//check values at index i,j. max of them should be placed at k and max element index is decreased by 1.
//check this untill i>=0 and j>=0. 
//at the end check if i or j still did not cross the boundary 0. if true then add the corresponding elements at index k and decrement the indices.




class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,k=m+n-1;
        while(j>=0 && i>=0){
            if(nums1[i]<nums2[j]){
                nums1[k]=nums2[j];
                j--;
            }
            else{
                nums1[k]=nums1[i];
                i--;
            }
            k--;
        }
        while(j>=0){
            nums1[k]=nums2[j];
            k--;j--;
        }
    }
}