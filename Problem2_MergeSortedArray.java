
// Time Complexity : o(m+n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        
       int nums1Index=m-1;
        int nums2Index=n-1;
        int insertAtIndex=m+n-1;
        
        while(nums1Index>=0 && nums2Index>=0)
        {
            if(nums1[nums1Index]>=nums2[nums2Index])
            {
                nums1[insertAtIndex--]=nums1[nums1Index--];
            }
            else
            {
                nums1[insertAtIndex--]=nums2[nums2Index--];
            }
        }
        
       while(nums2Index>=0)
       {
            nums1[insertAtIndex--]=nums2[nums2Index--];
       }
           
    }
}