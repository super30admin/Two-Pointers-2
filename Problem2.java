// Time Complexity : O(m+n)
// Space Complexity : O(m+n) using the clone of 1st array.
// Did this code successfully run on Leetcode : Y
// Three line explanation of solution in plain english
// 1. Copy the first to array to temp array
// 2. Check the condition where we use up all elments from second array or have numbers < second array , then copy the elements from first array to res aray.
// 3. copy the remaining element from array 2 to resultant array


// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        if (n < 1 && m < 1)
        {
            return;
        }
        int[] nums3 = nums1.clone(); 
		// since the question wants to directly change nums1, we let nums3 be a clone of nums1 from where we will get our numbers from without fearing our values getting change from nums1 being change
		
        int i = 0, j = 0; // let i be index point for nums1 and j be index pointer for nums2
        while (i + j < nums1.length)
        {
            if (j >= n || (i < m && nums3[i] < nums2[j])) 
			// if we have used up all numbers from nums2 
			// or we still have number from nums3 such that that nums3[i] < nums2[j]
            {
                nums1[i+j] = nums3[i++]; // increment i after assigning its current nums3[i] to nums1[i+j]
            }
            else
            {
                nums1[i+j] = nums2[j++]; // increment j after assigning its current nums2[j] to nums1[i+j]
            }
        }
    }
}
