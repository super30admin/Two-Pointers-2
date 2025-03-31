// Time Complexity : O(m + n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes

// Approach:

// 1. Start from the end of both arrays and place the larger element at the last available position in nums1.
// 2. Continue filling nums1 from the back by comparing the last elements of nums1 and nums2.
// 3. If any elements in nums2 remain, copy them into nums1.



public class MergeSortedArray 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int z = nums1.length-1;
        int i = m-1;
        int j = n-1;
        while(i>=0 && j>=0)
        {
            if(nums1[i]<=nums2[j])
            {
                nums1[z] = nums2[j];
                j--;
                z--;
            }
            else
            {
                nums1[z] = nums1[i];
                i--;
                z--;
            }
        }
        while(j>=0)
        {
            nums1[z] = nums2[j];
            j--;
            z--;
        }
    }
}