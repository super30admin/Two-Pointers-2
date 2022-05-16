// Time Complexity :  O(n + m) where n, m = input array size. 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Three line explanation of solution in plain english

/* Use three pointers i, j, and k. i to iterate over nums1 elements, j to iterate over nums2 elements 
 * and k to keep the track of position where next element should be inserted.
 * Start iterating from end of both the arrays and repeat the following step till i or j pointer reaches to 0.
 *      Compare nums1[i] and nums2[j] element, insert the largest of these two element at the nums[k] location 
 *      and decrement the k pointer and the pointer pointing to largest element.
 * If (i)th pointer reaches to 0 before (j)th pointer then copy the remaining elements of nums2 to nums1 using pointer j and k.
 * Similar operation not required incase (j)th pointer reaches to 0 before i because result is stored in nums1 and nums1 is already sorted. 
 */

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        if (nums1.size() == 0)
            return;
        
        int i = m - 1;
        int j = n - 1;
        int k = (m + n) - 1;
        
        while (i >= 0 && j >= 0)
        {
            if (nums1[i] >= nums2[j])
            {
                nums1[k] = nums1[i];
                i--;
            }
            else
            {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        
        // First array already sorted and in place. No need to check for first array.
        while(j >= 0)
        {
            nums1[k--] = nums2[j--];
        }
    }
};