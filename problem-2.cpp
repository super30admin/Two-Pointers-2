// 88. Merge Sorted Array
// Time Complexity : O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
    
uses two pointers p1 and p2 starting from the ends of the respective arrays 
and another pointer i to track the current position to fill in the merged array.
iterates through both arrays, comparing elements and filling nums1 
from the end to the start until all elements from nums2 are merged, ensuring the 
merged array remains sorted.
*/
 void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int p1 = m-1, p2 = n-1, i = m+n-1;
        while(p1>=0 && p2>=0)
        {
            if(nums1[p1] >= nums2[p2])
            {
                nums1[i] = nums1[p1];
                p1--;
                i--;
            }
            else
            {
                nums1[i] = nums2[p2];
                p2--;
                i--;                
            }
        }
        if(p1 == -1)
        {
            while(p2>=0)
            {
                nums1[i] = nums2[p2];
                p2--;
                i--;
            }
        }
        return;
    }  
