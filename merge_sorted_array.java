// Time Complexity :O(m+n) m-number of elements initialized in nums1 and nums2
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*Starting from the end of the array nums1 where there is space to add the additional elements, we compare m and n and store the relatively bigger in nums1 one by one. 
If m becomes zero and n still has values then the second while loop will store n in nums1 , if n becomes zero, then no need for a while loop as m is already in order in nums1 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2==null || nums2.length==0) return;
        int k=nums1.length-1;
        int i=m-1;
        int j=n-1;
        while(i>=0 && j>=0)
        {
            if(nums1[i]>nums2[j])
            {
                nums1[k]=nums1[i];
                i--;
            }else{
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }
        while(j>=0)
        {
            nums1[k]=nums2[j];
            k--;
            j--;
            
        }
            
        
        
    }
}