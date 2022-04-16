
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
	// 2) Three pinter, r1, r2 and r3, end of nums1, end of nums2, and end of nums1 before 0
	// 3) Then comppare r1 and r2, whiciever is bigger
	// 	a. Put at r3, decrease r3, and whichever is bigger r1 or r2
	// 	b. Keep doing until u reach end of bound for r1 or r2.
	// 	c. If r1 is out of bound, then just copy elements from r2 to 0 to nums1 from r3 to 0
	// 	d. If r2 is out of bound, then it means all elements are in sorting order, nums1 is result.
	// 4) O(m+n), O(1)


public void Merge(int[] nums1, int m, int[] nums2, int n) {
        if((nums1 == null || nums1.Length == 0) && (nums2 == null && nums2.Length == 0))
            return;
        
        int r1 = m-1;
        int r2 = n-1;
        int r3 = m+n-1;
        
        while(r1 >= 0 && r2>=0)
        {
            if(nums1[r1] > nums2[r2])
            {
                nums1[r3] = nums1[r1];
                r1--;
            }
            else
            {
                nums1[r3] = nums2[r2];
                r2--;
            }
            r3--;
        }
        
        while(r2 >= 0)
        {
            nums1[r3] = nums2[r2];
            r3--;
            r2--;
        }
    }