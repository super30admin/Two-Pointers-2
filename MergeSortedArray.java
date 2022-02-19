/**
nums1 = [1,2,2,3,5,6], m = 3, nums2 = [2,5,6], n = 3

[1]

[-3,-1,-1,2,3,4]  [-3,-2,-1]

[1,2,3,4,5,6] [4,5,6]

Tc - O(m+n) 
SC - O(1)

**/


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int start = m - 1;
        int end = n - 1;
        
        int ptrNums1 = m + n - 1;
        
        while (start >=0 && end >= 0)
        {
            if (nums2[end] > nums1[start])
            {
                nums1[ptrNums1] = nums2[end];
                end--;
            }
            else
            {
                nums1[ptrNums1] = nums1[start];
                start--;
            }
            
            ptrNums1--;
        }
        
        while (end >= 0)
        {
            nums1[ptrNums1] = nums2[end];
            ptrNums1--;
            end--;
        }
    }
}