/**
Time Complexity : O(M + N)
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
**/
class Solution 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        // its given that nums1 has the space to accomodate nums2 elemenst
        
        int p1 = m -1;
        int p2 = n -1;
        
        int index = nums1.length -1;
        
        while(p1 >=0 || p2 >=0)
        {
            if(p1 >=0 && p2 >=0)
            {
                // compare both
                if(nums1[p1]==nums2[p2])
                {
                    nums1[index--] = nums1[p1--];
                }
                else if(nums1[p1] > nums2[p2])
                {
                    nums1[index--] = nums1[p1--];
                }
                else
                {
                    nums1[index--] = nums2[p2--];
                }
            }
            else if(p1 >=0)
            {
                // copy p1 into the result
                while(p1 >=0)
                {
                    nums1[index--] = nums1[p1--];
                }
            }
            else
            {
                // copy p2 into the result
                while(p2 >=0)
                {
                    nums1[index--] = nums2[p2--];
                }
            }
        }
        
    }
}