
// Time Complexity : O(N+M)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer1 = m-1, pointer2 = n-1, pointer3 = m+n - 1;
        while(pointer1 >= 0 && pointer2 >= 0)
        {
            if(nums2[pointer2] > nums1[pointer1])
            {
                nums1[pointer3] = nums2[pointer2];
                pointer2--;
            }
            else
            {
                nums1[pointer3] = nums1[pointer1];
                pointer1--;
            }
            pointer3--;
        }
        while(pointer2 >= 0)
        {
            nums1[pointer3] = nums2[pointer2];
            pointer2--;
            pointer3--;
        }
    }
}