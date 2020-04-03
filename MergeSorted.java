

// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// two Pointer
// Your code here along with comments explaining your approach

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int k = nums1.length-1; // pointer pointing the last location of placeholder
        int i = m-1; // POinter for  array where qwe have to place the element
        int j = n-1; // pointer from which we have tio place the elemnet
        while(i>=0 && j>=0)
        {
            if(nums2[j]>=nums1[i])
            {
                nums1[k--] = nums2[j--];
            }
            else{
                nums1[k--] = nums1[i--];
            }
        }
    
       while(i>=0) nums1[k--] = nums1[i--];
       while(j>=0) nums1[k--] = nums2[j--];
            
            
        
    }
}class MergeSorted {

}