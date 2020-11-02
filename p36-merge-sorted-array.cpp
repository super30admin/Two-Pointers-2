// Time complexity is O(m+n) m = number of elements in nums1; n = number of elements in nums2
// Space complexity is O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach:
/*
  1. Initially, 'ptr1' points to the index 'm-1' in nums1, 
                'i' points to the index 'm+n-1' in nums1
                'ptr2' points to the index 'n-1' in nums2.
  2. The array elements at ptr1 and ptr2 are compared and the bigger value is placed at 'i' index. The respective pointer and 'i' are moved to the left by 1.
  3. When ptr1 reaches the zeroth index and ptr2 didn't reach the zeroth index, we can place remaining elements from nums2 into the nums1 without any comparisons.
  4. When ptr2 reaches the zeroth index and ptr1 didn't reach the zeroth index, it implies that all the elements of nums2 are placed in nums1 and since the elements in nums1 from index '0' to ptr1 are already sorted, we don't need another loop.
*/
class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        if(m == 0 && n == 0) return;
        int ptr1 = m-1;
        int ptr2 = n-1;
        int i = m+n-1;
        
        while(ptr1 > -1 && ptr2 > -1) {
            if(nums1[ptr1] > nums2[ptr2]) {
                nums1[i] = nums1[ptr1];
                ptr1--;
            }
            else {
                nums1[i] = nums2[ptr2];
                ptr2--;
            }
            i--;
        }
        
        // When ptr1 reaches the zeroth index and ptr2 didn't reach the zeroth index, we can place remaining elements from nums2 into the nums1 without any comparisons.
        while(ptr2 > -1) {
            nums1[i] = nums2[ptr2];
            ptr2--;
            i--;
        }
    }
};
